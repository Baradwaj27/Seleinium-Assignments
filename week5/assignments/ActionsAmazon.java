package week5.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Launch website
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. Search for "oneplus 9 pro".
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchBox.sendKeys("oneplus 9 pro");
	    searchBox.submit();
	     
	    //3. Get the price of the first product.
	 	String price = driver.findElement(By.xpath("(//span[text()='₹']/following-sibling::span)[1]")).getText();
	 	System.out.println("Price of First Item : "+price);
		Thread.sleep(3000);
		
		//4. Print the number of customer ratings for the first displayed product.
		driver.findElement(By.xpath("//span[contains(text(),'out of 5 stars')]/following::i")).click();	
			
		String rating  = driver.findElement(By.xpath("//span[contains(text(),'global ratings')]")).getText();
		System.out.println("Rating of First Item: "+rating);
		

		//5. Click the first text link of the first image.

		driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]")).click();
		Thread.sleep(3000);
		
		//Create WindowHandles
        Set<String> window1 = driver.getWindowHandles();
        //Convert to list
        List<String> window2 = new ArrayList<String>(window1);
        String parent = window2.get(0);
        String child = window2.get(1);
        driver.switchTo().window(child);
		Thread.sleep(3000);
		
		//6. Take a screenshot of the product displayed.
		WebElement usernamefield = driver.findElement(By.xpath("//body[contains(@class,'a-aui_')]"));
		File source = usernamefield.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Snaps/amazonproduct.png");
		FileUtils.copyFile(source, destination);
		
		//7. Click the 'Add to Cart' button.
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		act.scrollToElement(element).perform();
		element.click();
		Thread.sleep(6000);
		
		//8. Get the cart subtotal and verify if it is correct.
		String cartSubTotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println("Cart Subtotal : "+cartSubTotal);
		
		if(cartSubTotal.contains(price)) 
		{
			System.out.println("Price is Verified");
		}
		else
		{
			System.out.println("Price is not Verified");
		}
		driver.quit();
	}
	
}
