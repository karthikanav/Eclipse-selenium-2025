import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ListAutomation {

	public static void main(String[] args) {
		
		SafariDriver driver=new SafariDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// To find all the elements with common attribute -->link tag has a
		// To find all the a elements tag in the page
		// ***here I use elements not element
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size()); // to find the length 
		
		
		// To bring and print all the a tag links, we have to go for loop here
		for(int i=0; i<links.size();i++) {
			links.get(i).getText();  // To bring the all the 42 a link tag
		}
		
		                                     // Please refer CollecctionListandSet
		// From the 42 a link tag to click a particular 4th link the use get(4)
		links.get(4).click();
		
		
		
		
		

	}

}
