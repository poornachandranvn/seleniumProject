package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement date=driver.findElement(By.id("datepicker"));
		date.click();
		
		//date.sendKeys("09/04/2023"+Keys.ENTER);
		////*[@id="ui-datepicker-div"]/div/a[2]/span
		////*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[4]/a
		
		WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[1]/a"));
		nextbutton.click();
		
		WebElement dateto=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[1]/a"));
		dateto.click();
		
	}

}
