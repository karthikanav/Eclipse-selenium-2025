package alertHandlingusingXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLoctor_Frame {

	public static void main(String[] args) {
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/frame.xhtml");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Frame example of method overloading
		// switch to frame
		//3 ways to handle the frame
		//1. using Index 2. using attributes - description of using id/ name 3. Using frame as web element
		
		Driver.switchTo().frame(0); // frame index starts with Zero
		
		
		// default content take out all the frames to the main content of the page
		
		Driver.switchTo().defaultContent();
		Driver.findElement(By.id("Click")).click(); //present inside the frame
		String element = Driver.findElement(By.tagName("h5")).getText();
		System.out.println(element);
		// To handle the nested frame
		//Get into the first frame
		//Get into the second frame
		//Act on the element
		Driver.switchTo().frame(2); // Outer frame
		Driver.switchTo().frame("frame2"); // Inner frame and used attribute id as an argument
		Driver.findElement(By.id("Click")).click();
		
		Driver.switchTo().defaultContent();
		Driver.switchTo().parentFrame();
		
		
		
		
		
	}

}
