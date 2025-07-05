package week1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		SafariDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		 WebElement userName = driver.findElement(By.id("email"));
		 userName.sendKeys("21karthika@gmail.com");
		 driver.findElement( By.id("pass")).sendKeys("Kevsuj@123");
		 driver.findElement(By.name("login")).click();
		 
		 
		
				 

	}

}
