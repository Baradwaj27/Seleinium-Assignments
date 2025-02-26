package week4.assignments.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAuto {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize Window
		driver.manage().window().maximize();
		
		//Enter the username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		//a[text()='Contacts']
		
		//Click on Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		//Create WindowHandles
        Set<String> window = driver.getWindowHandles();
        
        //Convert to list
        List<String> child = new ArrayList<String>(window);
        
        String findcontact0 = child.get(0);
        String findcontact1 = child.get(1);
        //System.out.println(findcontact0);
        //System.out.println(findcontact1);

        //swtitch to find contact for "From Contact"
        driver.switchTo().window(findcontact1);
		Thread.sleep(3000);

		//Click on the first resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		//swtitch to find contact for main Window
		driver.switchTo().window(findcontact0);
		Thread.sleep(2000);

		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(3000);
			
		window = driver.getWindowHandles();
		List<String> child2 = new ArrayList<String>(window);
        String findcontact2 = child2.get(1);
        //System.out.println(findcontact4);
        
      //swtitch to find contact for "To Contact"
        driver.switchTo().window(findcontact2);

		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();

		driver.switchTo().window(findcontact0);
		Thread.sleep(3000);
		
		//Click on the Merge button
		driver.findElement(By.className("buttonDangerous")).click();
		
		//Accept the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// Verify the title of the page
		String expectedTitle = "View Contact | opentaps CRM";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed: Merge Contacts Successful!");
        } else {
            System.out.println("Test Failed: Title mismatch!");
        }
        
        driver.close();
	}

}
