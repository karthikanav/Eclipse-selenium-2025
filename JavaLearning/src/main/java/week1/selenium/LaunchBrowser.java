package week1.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		SafariDriver Driver=new SafariDriver();
		Driver.get("https://www.google.com");		

	}

}
