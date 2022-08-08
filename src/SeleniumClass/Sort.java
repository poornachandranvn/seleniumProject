package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> sorttable=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		WebElement fromt= sorttable.get(6);
		WebElement tot= sorttable.get(0);
		
		Actions act= new Actions (driver);
		act.clickAndHold(fromt);
		act.moveToElement(tot);
		act.release(tot);
		act.build().perform();
		
		

	}

}
