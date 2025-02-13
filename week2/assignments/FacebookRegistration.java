package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistration {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//- Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//- Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Baradwaj");
		
		//- Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("M R");
		
		//- Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("waj@gmail.com");
		
		//- Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("Asdf@1234");
		
		//- Handle all three dropdowns in Date of birth
		//dropdowns for day
		WebElement a = driver.findElement(By.id("day"));
		Select d1 = new Select(a);
		d1.selectByValue("27");
		
		//dropdowns for month
		WebElement b = driver.findElement(By.id("month"));
		Select d2 = new Select(b);
		d2.selectByValue("7");
		
		//dropdowns for year
		WebElement c = driver.findElement(By.id("year"));
		Select d3 = new Select(c);
		d3.selectByValue("2000");
		
		//- Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Male']")).click();

		//driver.close();
	}

}
