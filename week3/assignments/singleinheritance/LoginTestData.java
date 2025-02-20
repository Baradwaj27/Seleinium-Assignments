package week3.assignments.singleinheritance;

//SubClass for TestData in Sing Inheritance
public class LoginTestData extends TestData
{
	//Creating Method For LoginTestData
	 public void enterUsername(String username)
	 {
		 System.out.println("Entering Username : " + username);
	 }
	 
	 public void enterPassword(String password)
	 {
		 System.out.println("Entering Password : "+ password);
	 }

	public static void main(String[] args) {
		
		//Object for TestData
		TestData t = new TestData();
		
		//Call form Testdata using Object created by Super Class
		t.enterCredentials();
		t.navigateToHomePage();
		
		System.out.println("-----------");
		
		//Object for LoginTestData
		LoginTestData l = new LoginTestData();
		
		//Call form Testdata using Object created by Sub Class
		l.enterCredentials();
		l.navigateToHomePage();
		//Call From subClass
		l.enterUsername("User123");
		l.enterPassword("User@1234");
		
	}

}
