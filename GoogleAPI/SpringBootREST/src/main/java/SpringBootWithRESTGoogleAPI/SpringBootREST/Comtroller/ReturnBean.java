package SpringBootWithRESTGoogleAPI.SpringBootREST.Comtroller;

public class ReturnBean {

	private String message;
	public ReturnBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("ReturnBean [message=%s]", message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
