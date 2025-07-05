package alertHandlingusingXpath;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Show']")).click();// first alert box
		
		//bringing the driver focus to alert box
		// switch your method to alert box + ctrl=shift+1 = class will be created as a alert 
		// here the class alert it is an interface, move over and see 
		// this implementation class is remote alert and only 4 methods can be accessed
		//1. accept 2. dismiss 3. sendkeys 4. getText()
		Alert A = driver.switchTo().alert();
		System.out.println(A.getText());
		A.accept();
		
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		// second alert box
		System.out.println(A.getText());
		A.dismiss();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert B = driver.switchTo().alert();
		B.sendKeys("K");
		System.out.println(B.getText());
		B.accept();
		
		
		
		
		
	}

}
