package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectstable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> select=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size=select.size();
		System.out.println(size);
		
		//Actions act=new Actions (driver);
		//act.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).click(select.get(2)).build().perform();
		
		Actions act1=new Actions(driver);
		act1.clickAndHold(select.get(0));
		act1.clickAndHold(select.get(1));
		act1.clickAndHold(select.get(2));
		act1.build().perform();
		
		
		
		

	}

	private static void bulid() {
		// TODO Auto-generated method stub
		
	}

}
