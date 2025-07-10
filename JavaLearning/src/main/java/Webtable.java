import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtable {

	public static void main(String[] args) {

		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/window.xhtml");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.findElement(By.xpath("//span[text()='Table']")).click();
		
		// Use WebDriverWait to wait until clickable
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Table']"))).click();
		
		//find the table
		WebElement testOne = Driver.findElement(By.xpath("//table[@role='grid']"));
		
		// using table find the number of rows
		List<WebElement> row = Driver.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		WebElement col = Driver.findElement((By.xpath("//table[@role='grid']/thread/tr/th")));
		System.out.println(col.getSize());
		//real data
		WebElement allrows = Driver.findElement(By.xpath("//table[@role='grid']/tbody/tr"));
		System.out.println("No of rows in tbody:"+allrows.getSize());
		
		String text = Driver.findElement(By.xpath("table[@role='grid']//tr[2]/td[3]")).getText();
		System.out.println(text);
		
		//Finding values in each rows of all first columns
		
		
		for(int i=1;i<= all.size();i++) {
			String firstcoldata = Driver.findElement(By.xpath("table[@role='grid']//tr["+i+"]/td[1]")).getText();
			System.out.println(firstcoldata);
			
			// To get all data from all the column values in the first row
			for (int i=1; i<col.size(); i++) {
				String firstrowdata = Driver.findElement(By.xpath("table[@role='grid']//tr[1]/td["+i+"]")).getText();

				// To retrive all the data
				for(int i=1;i<testOne.size();i++) {
					for(int j=1; j<col.size();j++) {
						String alldata = Driver.findElement(By.xpath("table[@role='grid']//tr["+i+"]/td["+j+"]")).getText();
                System.out.println(alldata);
						
					}
				}
				
				
				
			}

			
		}
		
		

	}

}
