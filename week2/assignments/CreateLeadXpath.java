package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Baradwaj");

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M R");

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

		String Title = "Automation Engineer";
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys(Title);

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String DisplayedTitle = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();

		if(Title.equals(DisplayedTitle))
		{
			System.out.println("Page Verified");
		}
		else
		{
			System.out.println("Page Not Verified");
		}
		
		driver.close();

	}

}
