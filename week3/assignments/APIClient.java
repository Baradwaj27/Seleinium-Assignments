package week3.assignments;

//Metod OverLoading
public class APIClient {
	
	//Creating Method for sendRequest with one input argument
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);
	}
	
	//Creating Method for sendRequest with Multiple input argument
	public void sendRequest(String endpoint,String requestBody,String requestStatus)
	{
		System.out.println("Multiple Statement -" + endpoint + requestBody + requestStatus);
	}
	

	public static void main(String[] args) {
		//Creating Object
		APIClient api = new APIClient();
		api.sendRequest("Single Argument");//Call sendRequest with one input argument
		api.sendRequest("EndPoint,", "Request Body,", "Request Status");//Call sendRequest with Multiple input argument
	}

}
