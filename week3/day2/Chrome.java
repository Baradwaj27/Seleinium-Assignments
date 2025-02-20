package week3.day2;

public class Chrome extends Browser{
	
	public void openIncognito()
	{
		System.out.println("Open Incognito");
	}
	
	public void clearCache()
	{
		System.out.println("Clear Cache");
	}

	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
		
	}

}
