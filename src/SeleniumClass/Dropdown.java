package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html"); 
		
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		select.selectByValue("2");
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listoption = select.getOptions();
		int option=listoption.size();
		System.out.println("Total size:"+option);
		dropdown1.sendKeys("Loadrunner");
		
		WebElement multiselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select2 = new Select (multiselect);
		select2.selectByIndex(2);
		//select2.selectByIndex(3);

	}

}
