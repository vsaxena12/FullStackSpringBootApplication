package SpringBootWithGoogleAPI.SpringBootREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MapObject {
   @JsonProperty("place_id")
   String placeId;
   @JsonProperty("address_components")
   List<Address> address;
   @JsonProperty("formatted_address")
   String formattedAddress;
   LatitudeLongitude geometry;
   public MapObject() {
   }
   public List<Address> getAddressComponents() {
       return address;
   }
   public void setAddressComponents(List<Address> address) {
       this.address = address;
   }
   public String getPlaceId() {
       return placeId;
   }
   public void setPlaceId(String placeId) {
       this.placeId = placeId;
   }
   public String getFormattedAddress() {
       return formattedAddress;
   }
   public void setFormattedAddress(String formattedAddress) {
       this.formattedAddress = formattedAddress;
   }
   public LatitudeLongitude getGeometry() {
       return geometry;
   }
   public void setGeometry(LatitudeLongitude geometry) {
       this.geometry = geometry;
   }
}
