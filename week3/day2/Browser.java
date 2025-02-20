package week3.day2;

public class Browser {
	
	public void openURL()
	{
		System.out.println("Open URL");
	}
	
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	public void navigateBack()
	{
		System.out.println("Navigate Back");
	}

	public static void main(String[] args) {
		
		Browser b = new Browser();
		b.openURL();
		b.closeBrowser();
		b.navigateBack();
		
	}

}
