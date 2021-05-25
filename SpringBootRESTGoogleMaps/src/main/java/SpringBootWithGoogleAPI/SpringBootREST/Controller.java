package SpringBootWithGoogleAPI.SpringBootREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import org.springframework.expression.spel.CodeFlow;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

@RestController
public class Controller {
	
   private static final String USER_IDENTIFIER_KEY = "MY_DUMMY_USER";
   //private GoogleAuthorizationCodeFlow flow;
	
   @RequestMapping(path = "/geocode", method = RequestMethod.GET )
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
       System.out.println(result);
       return result;
   }
   
   @GetMapping(value = { "/googlesignin" })
	public void doGoogleSignIn(HttpServletResponse response) throws Exception {
		
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Result {
   List<MapObject> results;
   String status;
   public Result() {
   }
   public String getStatus() {
       return status;
   }
   public void setStatus(String status) {
       this.status = status;
   }
   public List<MapObject> getResults() {
       return results;
   }
   public void setResults(List<MapObject> results) {
       this.results = results;
   }
}
