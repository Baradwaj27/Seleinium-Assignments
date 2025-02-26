package week4.assignments.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlerts {

	public static void main(String[] args) 
	{
		//Open Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		//Maximize Window
		driver.manage().window().maximize();
		
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		
		//Accepting the alert box
		alert.sendKeys("Baradwaj"); 
		alert.accept();
		//alert.dismiss();
		WebElement verify = driver.findElement(By.id("demo"));
		String displayedText = verify.getText();
		
		if(displayedText.contains("Baradwaj"))
		{
			System.out.println("Input was successfully entered.");
		}
		else
		{
			System.out.println("Cancel button was clicked or no input was entered");
		}
		
	}

}
