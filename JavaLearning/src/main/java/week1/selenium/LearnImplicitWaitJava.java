package week1.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class LearnImplicitWaitJava {

	public static void main(String[] args) throws InterruptedException {
		

		SafariDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		 WebElement userName = driver.findElement(By.id("identifierId"));
		 userName.sendKeys("21karthika@gmail.com");
		 driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		 driver.findElement( By.id("pass")).sendKeys("Kevsuj@123");
		 driver.findElement(By.name("login")).click();
		 
		 Thread.sleep(3000); // java explicit wait
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 System.out.println("Please solve the CAPTCHA manually...");
		 Thread.sleep(30000); // Wait 30 seconds
		 
		 
		 Thread.sleep(3000);

	}

}
