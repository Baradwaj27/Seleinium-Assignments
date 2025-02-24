package week4.assignments.interfaceabstract;

public class SelConnection extends MySqlConnection{

	public static void main(String[] args) {
		SelConnection sc = new SelConnection(); 
		 sc.connect();
		 sc.executeUpdate();
		 sc.executeQuery("SELECT * FROM users;");
		 sc.disconnect();
	}

	//inherits unimplemented methods
	@Override
	public void executeUpdate() {
		System.out.println("Execute Update = 1.9002");
	}

	
	@Override
	public void executeQuery(String query) {
		System.out.println("Execute Query = "+query);	
	}
	

}
