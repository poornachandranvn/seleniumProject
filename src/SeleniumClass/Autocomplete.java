package SeleniumClass;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
	WebElement input=driver.findElement(By.id("tags"));
	input.sendKeys("s");
	Thread.sleep(4000);
	List< WebElement> option=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	System.out.println(option.size());
	for (WebElement webElement : option) {
		if(webElement.getText().equals("Web Services"))
		{
			webElement.click();
			System.out.println("selecting"+webElement.getText());
			//System.out.println("if");
			break;
			
		}	
	}
	}
}
