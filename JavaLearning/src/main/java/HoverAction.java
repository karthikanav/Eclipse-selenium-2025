import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAction {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Locate the element and hover on it
		
		WebElement mentab = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act=new Actions(driver);
		//to hover
		act.moveToElement(mentab).perform();
		// Scrolldown to top to bottom
		act.scrollByAmount(0, 1000).perform();
		// Positive - Scroll down
		// Negative - Scroll up
		
		// Scroll down and click contact element
		WebElement Contactclick = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		act.scrollToElement(Contactclick).click(Contactclick).perform();
		
		
		
	}

}
