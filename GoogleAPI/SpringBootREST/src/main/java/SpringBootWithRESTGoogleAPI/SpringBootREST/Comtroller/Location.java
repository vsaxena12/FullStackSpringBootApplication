package SpringBootWithRESTGoogleAPI.SpringBootREST.Comtroller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
   @JsonProperty("lat")
   private String latitude;
   @JsonProperty("lng")
   private String longitude;
   public Location() {
   }
   public String getLatitude() {
       return latitude;
   }
   public void setLatitude(String latitude) {
       this.latitude = latitude;
   }
   public String getLongitude() {
       return longitude;
   }
   public void setLongitude(String longitude) {
       this.longitude = longitude;
   }
}