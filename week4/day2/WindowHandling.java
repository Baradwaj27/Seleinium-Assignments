package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		// Initialize the WebDriver
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
       
        // Step 1: Open URL
        driver.get("https://www.irctc.co.in/");

        // Add an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //click on flights
        driver.findElement(By.xpath("(//li[@class='menu-list header-icon-menu'])[3]")).click();

        //Create WindowHandles
        Set<String> window = driver.getWindowHandles();
        
        //Convert to list
        List<String> child = new ArrayList<String>(window);
        
        //Switch Driver Focus to child window
        driver.switchTo().window(child.get(1));
        
        //Get Title of Child window
        String title = driver.getTitle();
        System.out.println("Child Window Name:"+title);
        
      //Switch Driver Focus to Parent window
        driver.switchTo().window(child.get(0));
        
        //Close Parent window
        driver.close();
        
        
	}

}
