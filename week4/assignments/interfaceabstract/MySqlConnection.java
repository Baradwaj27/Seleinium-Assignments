package week4.assignments.interfaceabstract;

//abstract class implements from interface
public abstract class MySqlConnection implements DatabaseConnection {
	
	
	public void connect() {
		System.out.println("Connecting...");	
	}
	
	//creating abstract method
	abstract void executeQuery(String query);
	
	public void disconnect() {
		System.out.println("Disconnecting...");		
	}

}
