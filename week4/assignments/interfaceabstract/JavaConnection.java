package week4.assignments.interfaceabstract;

//Implements from Interface
public class JavaConnection implements DatabaseConnection 
{

	//Inherits Unimplemented Method
	@Override
	public void connect() {
		System.out.println("Connecting...");	
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting...");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update = 1.9002");		
	}
	
public static void main(String[] args) {
	
	//Executing the method
		 JavaConnection db = new JavaConnection(); 
		 db.connect();
		 db.executeUpdate();
		 db.disconnect();
     }
}
