package week2.day1;

public class Methods {
	
	public void takePhoto() {
		System.out.println("Take photo");
	}
	
	public void saveContact() {
		System.out.println("Contact was saved");
		
	}
	
	public void makeCall() {
		System.out.println("Make Call");

	}
	
   public static void main(String[] args) {
		
		//ClassName objectName=new ClassName();
 
		Methods mobileOptions=new Methods();
		
		mobileOptions.takePhoto();
		
		mobileOptions.saveContact();
		
		mobileOptions.makeCall();
	}

}
