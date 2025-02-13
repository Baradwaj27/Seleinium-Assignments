package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		//Enter a username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter a password.
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//- Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//- Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//- Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		
		//- Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		
		//- Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Test Selenium 102");
		
		//- Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//- Select "ComputerSoftware" as the industry.
		WebElement a = driver.findElement(By.name("industryEnumId"));
		Select d1 = new Select(a);
		d1.selectByVisibleText("Computer Software");
		
		//- Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement b = driver.findElement(By.name("ownershipEnumId"));
		Select d2 = new Select(b);
		d2.selectByVisibleText("S-Corporation");
		
		//- Select "Employee" as the source using SelectByValue.
		WebElement c = driver.findElement(By.id("dataSourceId"));
		Select d3 = new Select(c);
		d3.selectByValue("LEAD_EMPLOYEE");
		
		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement d = driver.findElement(By.id("marketingCampaignId"));
		Select d4 = new Select(d);
		d4.selectByIndex(6);
		
		//- Select "Texas" as the state/province using SelectByValue.
		WebElement e = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select d5 = new Select(e);
		d5.selectByValue("TX");
		
		//- Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verification
		
		WebElement CreatedAccount = driver.findElement(By.xpath("//span[@class='tabletext' and contains(text(),'Test Selenium 102')]"));
		
		if(CreatedAccount.isDisplayed())
		{
			System.out.println("Account Verified");
		}
		else
		{
			System.out.println("Account Not Verified");
		}
		
		//Close Browser
		driver.close();
	}


}
