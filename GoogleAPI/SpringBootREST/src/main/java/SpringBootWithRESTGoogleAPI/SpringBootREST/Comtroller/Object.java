package SpringBootWithRESTGoogleAPI.SpringBootREST.Comtroller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Object {
   @JsonProperty("place_id")
   String placeId;
   @JsonProperty("address_components")
   List<AddressComponent> addressComponents;
   @JsonProperty("formatted_address")
   String formattedAddress;
   LatitudeLongitude geometry;
   public Object() {
   }
   public List<AddressComponent> getAddressComponents() {
       return addressComponents;
   }
   public void setAddressComponents(List<AddressComponent> addressComponents) {
       this.addressComponents = addressComponents;
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
