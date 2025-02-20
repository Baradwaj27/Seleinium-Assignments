package week3.assignments.overriding;

//Method OverRiding
// Create a subclass named LoginPage.
public class LoginPage extends BasePage
{
	
	//Override the performCommonTasks() method in the LoginPage class
	public void performCommonTasks()
	{
		System.out.println("Perform Common Tasks Over Ride");
	}
	
	public static void main(String[] args) {
		
		//Demonstrate the concept by creating objects for both classes and calling their methods.

		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
		
		System.out.println("---------------");
		
		LoginPage lp = new LoginPage();
		
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}
}
