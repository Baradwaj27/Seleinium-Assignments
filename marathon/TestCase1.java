package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args)  throws InterruptedException {
		 
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com/");
		
		
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
        //Choose Your location as "Chennai" (sometimes it will be located automatically)
		driver.findElement(By.xpath("//div[@class='p-hidden-accessible p-dropdown-hidden-select']/following-sibling::span")).click();
		driver.findElement(By.xpath("//div[@class='cities-names']/h6[text()='Chennai']")).click();
		Thread.sleep(3000);
		
		//Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(3000);
		
		//Select Your Cinema
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		Thread.sleep(3000);
		
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[3]/following::span[text()='Tomorrow']")).click();
		Thread.sleep(3000);
		
		 // Select Your Movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]/span")).click();
		Thread.sleep(3000);
		
		 //Select Your Show Time
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[text()='09:00 AM']")).click();
		
		//Click on Book Button
		driver.findElement(By.xpath("//div[@class='quick-lefts ']//button[1]")).click();
		Thread.sleep(3000);
		
		// Click Accept on Term and Condition
		driver.findElement(By.xpath("//div[contains(@class,'accpet')]/button[2]")).click();
		Thread.sleep(3000);
		
		// Click any one available seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|K:1']")).click();
		
		 // Print the Seat info under book summary
		driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();		
		System.out.println("Seat Number:" +seatNumber);
		
		 // Print the grand total under book summary 
		//String grandTotal = driver.findElement(By.xpath("//div[@id='root']/section[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[1]/div[1]/div[1]/h6[2]/span")).getText();
		//System.out.println("Grand Total :"+grandTotal );
		
		// Click Proceed Button
		driver.findElement(By.xpath("//div[@class='register-btn col-md-3']/button")).click();		
		Thread.sleep(3000);
		
		 // Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])")).click();
		
		 // Print Your Current Page title
		System.out.println(driver.getTitle());
		
		//Close Browser
		driver.close();
	}

}
