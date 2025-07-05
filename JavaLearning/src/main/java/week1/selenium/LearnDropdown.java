package week1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafariDriver Driver=new SafariDriver();
		Driver.get("https://www.amazon.com");	
		//Maximize the window
		Driver.manage().window().maximize();
		
		//Instantiate the select class
		
		WebElement mc = Driver.findElement(By.id("searchDropdownBox"));
		Select list=new Select(mc);
		//select "text"Amazon Fresh from the drop down 
		list.selectByVisibleText("Amazon Fresh");
		//select by attribute value
		list.selectByValue("search-alias=vehicles");
		//select by Index
		list.selectByIndex(9);
		

	}

}
