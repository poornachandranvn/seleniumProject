package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageprocess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement findimg=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		findimg.click();
		
		driver.navigate().back();
		
		WebElement brokenimg=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if (brokenimg.getAttribute("naturalWidth").equals("0")) 
		{
			System.out.println("image is broken");
		} 
		else 
		
		{
			
			System.out.println("not");

		}
		

	}

}
