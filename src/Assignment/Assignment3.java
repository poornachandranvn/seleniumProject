package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on a page :: "+allLink.size());
		
		List<WebElement> allLink2 = driver.findElements(By.tagName("a"));
		
		
		for (WebElement link2:allLink) {
			
			System.out.println("Link Text :: "+ link2.getText());
			System.out.println("Link URL  :: "+ link2.getAttribute("href"));
			System.out.println("----------------------------");
			
		} 

	}

}
