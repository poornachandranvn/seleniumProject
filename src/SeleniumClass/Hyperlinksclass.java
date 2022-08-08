package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinksclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		 
		WebElement homelink=driver.findElement(By.linkText("Go to Home Page"));
		homelink.click();
		
		driver.navigate().back();
		
		WebElement gothere=driver.findElement(By.partialLinkText("Find where"));
		String particularOnly=gothere.getAttribute("href");
		System.out.println("getting the link:"+particularOnly);
		
		WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		String title=driver.getTitle();
		if (title.contains("404")) 
		{
			System.out.println("link is broken");	
		}
		driver.navigate().back();
		
		WebElement homelink2=driver.findElement(By.linkText("Go to Home Page"));
		homelink2.click();
	    driver.navigate().back();
		
		List<WebElement> totallink=driver.findElements(By.tagName("a"));
		int link=totallink.size();
		System.out.println("Toatal Link"+link);
		
		
		

	}

}
