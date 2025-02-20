package week3.assignments.leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;;

public class EditLead {
	
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter UserName
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		// Click on the CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter the CompanyName Field Using Xpath	
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		
		//Enter the FirstName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("miqzxunb");
		
		//- Enter the LastName Field Using Xpath.	
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("lwahfftfr");
		
		//- Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("asjhgff");
		
		//- Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("uytre");
		
		//- Enter the Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("iuytrew");
		
		//- Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("uytre@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.		
		WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dd = new Select(state);
		dd.selectByVisibleText("Alabama");
		
		//Click on the Create Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click on the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		
		//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("rntvssgvhbtynuujku");
		
		//Click on the update button
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		//Get the Title of the Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close the browser window
		driver.close();
	}
}

