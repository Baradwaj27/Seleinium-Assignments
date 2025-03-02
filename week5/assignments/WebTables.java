package week5.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		//Launch Browser
		ChromeDriver driver =new ChromeDriver();
		//Launch URL
		driver.get("https://erail.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter "MAS" as the "From" station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
        fromStation.sendKeys("MAS");
        driver.findElement(By.xpath("(//div[@class='autocomplete'])[1]/div[1]")).click();
        // Enter "MDU" in the "To" station field
        WebElement toStation = driver.findElement(By.id("txtStationTo"));
        toStation.clear();
        toStation.sendKeys("MDU");
        driver.findElement(By.xpath("(//div[@class='autocomplete'])[2]/div[1]")).click();
        // Uncheck the "Sort on Date" checkbox
        WebElement sortOnDate = driver.findElement(By.id("chkSelectDateOnly"));
        if (sortOnDate.isSelected()) {
            sortOnDate.click();
        }
        
        //Retrieve the train names from the web table
        //Step1: Locate the table as WebElement
        WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody"));
        //To find the number of rows
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
  		int rowCount = allRows.size();
  		System.out.println("Row count is: "+rowCount);
  		//To find the column count
  		List<WebElement> allColumn = table.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[2]/td"));
		int columnCount = allColumn.size();
		System.out.println("Column count is :"+columnCount);
  		
		//To retrieve particular column 
		List<WebElement> col2data = table.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody[1]/tr/td[2]"));
        // Store train names in a Set and List to check for duplicates
        Set<String> trainSet = new HashSet<>();
        List<String> trainList = new ArrayList<>();
        
        for (int i = 0; i < col2data.size() ; i++) {
			String trainName = col2data.get(i).getText().trim();
            trainList.add(trainName);
            trainSet.add(trainName);
        }
        
        // Print train names
        System.out.println("Train Names:");
        for (String train : trainList) {
            System.out.println(train);
        }
        
        // Check for duplicates
        if (trainList.size() > trainSet.size()) {
            System.out.println("There are duplicate train names in the list.");
        } else {
            System.out.println("No duplicate train names found.");
        }
	}
}
