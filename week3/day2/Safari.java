package week3.day2;

public class Safari extends Browser{

	public void readerMode()
	{
		System.out.println("Reader Mode");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Full Screen Mode");
	}
	
	public static void main(String[] args) {
		
		Safari s = new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		s.readerMode();
		s.fullScreenMode();

		
	}

}
