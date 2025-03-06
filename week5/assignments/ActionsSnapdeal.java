package week5.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapdeal {

	public static void main(String[] args) throws IOException {
		
		//Launch website
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		Actions act=new Actions(driver);
		
		//2. Go to "Men's Fashion".
		WebElement mo1 = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		act.moveToElement(mo1).perform();
		
		//3. Go to "Sports Shoes".
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		//4. Get the count of sports shoes.
		String countShoes = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println("Count of Sports Shoes : "+countShoes);
		
		//5. Click on "Training Shoes".
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		
		//6. Sort the products by "Low to High".
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		
		//7. Check if the displayed items are sorted correctly.
		String sort = driver.findElement(By.className("sort-selected")).getText();
		if(sort.contains("Price Low To High"))
		{
			System.out.println("Items Sorted Correctly");
		}
		else
		{
			System.out.println("Items Not Sorted");
		}
		//8. Select any price range ex:(500-700).
		WebElement fromVal = driver.findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("500");
		WebElement toVal =driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		//9. Filter by any colour.
		WebElement element = driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]/label"));
		act.scrollToElement(element).perform();
		element.click();
		//10. Verify all the applied filters.
		
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list active-filter'])[1]/label"));
		String color = element.getText();
		if(color.contains("White"))
		{
			System.out.println("Color is selected");
		}
		else
		{
			System.out.println("Color is not selected");
		}
		
		
		String text = driver.findElement(By.xpath("(//div[@class='clear'])[5]")).getText();
		if(text.contains("500"))
		{
			System.out.println("Price Range Filter Verified");
		}
		else
		{
			System.out.println("Price Range Filter not Verified");
		}
		
		//11. Mouse hover on the first resulting "Training Shoes".
		WebElement element3 = driver.findElement(By.xpath("(//div[@class='product-tuple-image '])[1]"));
		act.moveToElement(element3).perform();
		//12. Click the "Quick View" button.
		WebElement element4 = driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
		act.scrollToElement(element4).perform();
		act.moveToElement(element4).perform();
		element4.click();
		
		//13. print the cost and the discount percentage.
		String price = driver.findElement(By.className("payBlkBig")).getText();
		System.out.println("Cost of the item : "+price);
		String discount = driver.findElement(By.className("percent-desc")).getText();
		System.out.println("Discount of the item : "+discount);
		
		//14. Take a snapshot of the shoes.
		 WebElement shoes = driver.findElement(By.xpath("//div[@class='sidebaroverlay']"));
		 File source = shoes.getScreenshotAs(OutputType.FILE);
		 File destination=new File("./Snaps/snapdeal.png");
		 FileUtils.copyFile(source, destination);
		 
		driver.close();
	}

}
