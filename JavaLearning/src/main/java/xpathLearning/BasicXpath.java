package xpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/crmsfa/control/myHomeMain");
		driver.findElement(By.xpath(("//input[@class='inputBox'])[1]")));
		

	}

}
