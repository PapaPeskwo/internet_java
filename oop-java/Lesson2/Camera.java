public class Camera {
	private boolean active = false; //cant be accessed as it's private
	String serialNumber;
	
	boolean getActive() { //can access the private one through this method
		return active;	
	}		
}