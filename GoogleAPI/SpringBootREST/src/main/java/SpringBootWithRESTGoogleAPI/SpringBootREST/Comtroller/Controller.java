package SpringBootWithRESTGoogleAPI.SpringBootREST.Comtroller;

import java.io.IOException;
import java.net.URLEncoder;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;



//Controller which handles REST Requests
@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class Controller {
	
	@GetMapping(path="/hello-world")
	public String returnString()
	{
		return "Hello World!";
	}

	
	  @GetMapping(path="/hello-world-bean") public ReturnBean returnStringBean() {
	  return new ReturnBean("Hello World Bean"); }
	  
	  @GetMapping(path="/hello-world-bean/{name}") public ReturnBean
	  returnStringBean(@PathVariable String name) { return new
	  ReturnBean(String.format("Hello World Bean, %s", name)); }
	 
	
	//@RequestMapping(path = "/hello-world-bean", method = RequestMethod.GET )
	   public Result getGeocode(@RequestParam String address) throws IOException {
	       OkHttpClient client = new OkHttpClient();
	       String encodedAddress = URLEncoder.encode(address, "UTF-8");
	       Request request = new Request.Builder()
	               .url("https://google-maps-geocoding.p.rapidapi.com/geocode/json?language=en&address=" + encodedAddress)
	               .get()
	               .addHeader("x-rapidapi-host", "google-maps-geocoding.p.rapidapi.com")
	               .addHeader("x-rapidapi-key", "038a2a0bcfmshb3e1476d0331b50p15a5f2jsn8981043bad6e")
	               .build();
	       ResponseBody responseBody = client.newCall(request).execute().body();
	       ObjectMapper objectMapper = new ObjectMapper();
	       Result result = objectMapper.readValue(responseBody.string(), Result.class);
	       return result;
	   }
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Result {
   List<Object> results;
   String status;
   public Result() {
   }
   public String getStatus() {
       return status;
   }
   public void setStatus(String status) {
       this.status = status;
   }
   public List<Object> getResults() {
       return results;
   }
   public void setResults(List<Object> results) {
       this.results = results;
   }
}


