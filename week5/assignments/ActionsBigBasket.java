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

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		
		//Create Object for Actions Class
		Actions act=new Actions(driver);
		
		//To locate the element
		WebElement mouseOver1 = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		
		//mouseHover - moveToElement
		act.moveToElement(mouseOver1).perform();
		
		Thread.sleep(3000);
		WebElement mouseOver2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(mouseOver2).perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		Thread.sleep(3000);
		WebElement scrollElement1 = driver.findElement(By.id("i-BBRoyal"));
		act.scrollToElement(scrollElement1).perform();
		scrollElement1.click();
		Thread.sleep(3000);
		
		WebElement scrollElement2 = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
		act.scrollToElement(scrollElement2).perform();
		scrollElement2.click();
		Thread.sleep(3000);
		
		//Create WindowHandles
        Set<String> window1 = driver.getWindowHandles();
        //Convert to list
        List<String> window2 = new ArrayList<String>(window1);
        String parent = window2.get(0);
        String child = window2.get(1);
        driver.switchTo().window(child);
		Thread.sleep(3000);
		
		WebElement scrollElement3 = driver.findElement(By.xpath("//span[text()='5 kg']"));
		act.scrollToElement(scrollElement3).perform();
		scrollElement3.click();
		
		String price = driver.findElement(By.xpath("(//span[text()='₹'])[5]")).getText();
		System.out.println("Price:"+price);
		
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		
		String cart = driver.findElement(By.id("add-button")).getText();
		if(cart.equals("1"))
		{
			System.out.println("Item Successfully added to your cart");
		}
		else
		{
			System.out.println("Item not added to your cart");
		}
		
		 WebElement carts = driver.findElement(By.xpath("//body[@class='relative']"));
		 File source = carts.getScreenshotAs(OutputType.FILE);
		 File destination=new File("./Snaps/bigbasket.png");
		 FileUtils.copyFile(source, destination);
			        		 
	}

}
