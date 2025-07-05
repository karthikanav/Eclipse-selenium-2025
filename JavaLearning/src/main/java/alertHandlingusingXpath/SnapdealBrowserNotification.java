package alertHandlingusingXpath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SnapdealBrowserNotification {

	public static void main(String[] args) {

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable--notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.snapdeal.com");
		
	}

}
