import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/window.xhtml");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String windowHandle = Driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(Driver.getTitle());
		
	}

}
