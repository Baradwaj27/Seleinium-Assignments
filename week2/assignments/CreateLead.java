package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Baradwaj");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M R");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		String title = "Automation Engineer";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);

		driver.findElement(By.name("submitButton")).click();
		
		String DisplayedTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		
		//System.out.println("title="+ title);
		//System.out.println("DisplayedTitle="+DisplayedTitle);

		if(title.equals(DisplayedTitle))
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
