package week2.day1;

public class Browser {
	
	public String launchBrowser()
	{
		return "Browser launch successfully";
	}
	public void launchURL()
	{
		System.out.println("Launch URL Successfully");
	}
	public static void main(String[] args) {
		Browser b = new Browser();
		
		System.out.println(b.launchBrowser());
		b.launchURL();
	}
}
