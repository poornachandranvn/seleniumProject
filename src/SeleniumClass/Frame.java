package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		String gettext=driver.findElement(By.id("Click")).getText();
		System.out.println(gettext);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement button2= driver.findElement(By.id("Click1"));
		button2.click();
		String gettext1=driver.findElement(By.id("Click1")).getText();
		System.out.println(gettext1);
		
		driver.switchTo().defaultContent();
		 
	   List<WebElement>total= driver.findElements(By.tagName("iframe"));
	   int size=total.size();
	   System.out.println(size);
	    
	}

}
