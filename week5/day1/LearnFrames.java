package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		
		//Open Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch URL
		driver.get("https://www.leafground.com/frame.xhtml");

		//Maximize Window
		driver.manage().window().maximize();
		
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch to the frame
		driver.switchTo().frame(0);	
		
		driver.findElement(By.id("Click")).click();
		
		//Switch to main Webpage
		driver.switchTo().defaultContent();
		
		//Nested Frames
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		

	}

}
