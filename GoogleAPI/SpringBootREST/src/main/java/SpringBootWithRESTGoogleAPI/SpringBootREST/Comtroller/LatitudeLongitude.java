package SpringBootWithRESTGoogleAPI.SpringBootREST.Comtroller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatitudeLongitude {
   @JsonProperty("location")
   Location location;
   public LatitudeLongitude() {
   }
   public Location getGeocodeLocation() {
       return location;
   }
   public void setGeocodeLocation(Location location) {
       this.location = location;
   }
}