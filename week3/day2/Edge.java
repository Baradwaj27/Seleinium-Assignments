package week3.day2;

public class Edge extends Browser{
	
	public void takeSnap()
	{
		System.out.println("Take Snap");
	}
	
	public void clearCookies()
	{
		System.out.println("Clear Cookies");
	}
	
	public static void main(String[] args) {
		
		Edge e = new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();

		
	}


}
