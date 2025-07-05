import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class CollectionListandSet {

	public static void main(String[] args) {
		
		SafariDriver driver=new SafariDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// In xpath I found 2 class matches input login
		List<WebElement> userinputbox = driver.findElements(By.xpath("//input[@class='inputLogin']"));
		System.out.println(userinputbox.size());
		
		//If I want to reach first index of the userinput box I have to go with O
		// so get (0) 
		
		userinputbox.get(0).sendKeys("DemosalesManager");
		userinputbox.get(1).sendKeys("crmsfa");
		
		
		

	}

}
