import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class AmazonListCollections {

	public static void main(String[] args) {
		
		SafariDriver driver=new SafariDriver();
		driver.get("http://www.Amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
		 List<WebElement> MobilePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = MobilePrice.size();
		
		
		List<String> MobPrice=new ArrayList<String>();
		
		
		System.out.println(MobilePrice);
		for (int i=0;i<size;i++) {
			String text=MobilePrice.get(i).getText();
			MobPrice.add(text);
			
		}
		System.out.println(MobPrice);
		// set -->as like List--> by default--> not allow the duplicates
		
		//***code***--> Collections.sort(MobPrice); // here sort, min, max is throwing an error
		// so covert the list<WebElement>---> into List of anything, List<String> or any datatype
		// and in for loop .getText is added
		// Refer line 23 converted into 27, now we can sort the price
		//***code***--> String min = Collections.min(MobPrice);
		//***code***--> System.out.println(min);
		
		//Remove all the duplicate and print the one which I want
		
		Set<String> uniqueprice=new LinkedHashSet<String>(MobPrice);
		System.out.println(uniqueprice); // Avoid the duplications
		
		if(MobPrice.size()==uniqueprice.size()) {
			System.out.println("No Duplicates");
		}else
			System.out.println("Found Duplicates");

	}

}
