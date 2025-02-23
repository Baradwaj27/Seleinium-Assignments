package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class TestCase2 {
	
    public static void main(String[] args) 
    {
    	// Initialize the WebDriver
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Add an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Step 1: Open Amazon India
        driver.get("https://www.amazon.in/");
        
        

        // Step 2: Type "Bags for boys" in the search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Bags for boys");

        // Step 3: Press Enter to search
        searchBox.submit();

        // Step 4: Wait for the search results to load and print the total number of results
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement resultCount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sg-col-inner']/h2")));
        System.out.println("Total Results: " + resultCount.getText());

        // Step 5: Select the first two brands in the left menu
        
         for (int j = 5; j <= 6; j++) { 
        	 WebElement brands = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])["+j+"]")); 
        	 if(!brands.isSelected()) 
        	 { 
   			  brands.click(); 
   			  } 
        	 }

        // Step 6: Sort by New Arrivals
        driver.findElement(By.className("a-dropdown-label")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();

        
        // Step 7: Print the first resulting bag info (name, discounted price)
        WebElement firstBagName =driver.findElement(By.xpath("(//a[@target='_blank'])[2]//span"));
        WebElement firstBagPrice = driver.findElement(By.xpath("(//span[@class='a-price'])[1]//span[@class='a-price-whole']"));
        System.out.println("First Bag: " + firstBagName.getText());
        System.out.println("Discounted Price: " + firstBagPrice.getText());

        // Step 8: Get the page title and close the browser
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the browser
        driver.close();
    }
}
