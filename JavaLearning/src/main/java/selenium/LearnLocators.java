package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnLocators {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/crmsfa/control/myHomeMain");
WebElement	username=	driver.findElement(By.className("USERNAME"));
username.sendKeys("DemoSalesManager");
WebElement dd = driver.findElement(By.className("PASSWORD"));
dd.sendKeys("Sukku@123");

driver.findElement(By.className("loginButton")).click();

driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KK PVT Ltd");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nav");
 Select asdf = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
 asdf.selectByIndex(4);
 
WebElement we=  driver.findElement(By.id("createLeadForm_dataSourceId"));

Select test1= new Select(we);
test1.selectByValue("LEAD_PR");
String titleName =driver.getTitle();
System.out.println(titleName);

		

	}

	

}
