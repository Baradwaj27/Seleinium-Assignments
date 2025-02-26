package week4.assignments.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
				
		//Load URL
		driver.get("https://www.ajio.com/");

		//Maximize Window
		driver.manage().window().maximize();
				
		//In the search box, type as "bags" and press enter
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Bags");
		search.sendKeys(Keys.ENTER);
		
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men ')]")).click();
		Thread.sleep(3000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		
		//Print the count of the items found
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Count of the items:"+count);
		
		System.out.println("-----------------------------------");
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		int sizeofBrands = brands.size();
		System.out.println("Total Number of Brand Name: "+sizeofBrands);

		for (int i = 0; i < brands.size(); i++) {
			String brandNames = brands.get(i).getText();
			System.out.print(brandNames+",");	
		}
		
		
		//Get the list of names of the bags and print it
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int sizeofbags = bags.size();
		System.out.println("Total Number of Bags: "+sizeofbags);

		for (int i = 0; i < bags.size(); i++) {
			String bagNames = bags.get(i).getText();
			System.out.print(bagNames+",");		
		}
		
		//driver.close();
		

	}

}
