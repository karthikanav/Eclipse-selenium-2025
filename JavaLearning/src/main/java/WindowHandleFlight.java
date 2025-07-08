import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleFlight {

	public static void main(String[] args) {
		
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/window.xhtml");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.get("https://www.irctctourism.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.findElement(By.linkText("Flights")).click();
		Set<String> windowHandles = Driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandles);
		Driver.switchTo().window(win.get(1));
		System.out.println(Driver.getTitle());
		Driver.switchTo().window(win.get(0));
		Driver.close();

		
		
		
	}

}
