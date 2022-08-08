package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String praentwindow =driver.getWindowHandle();
		WebElement firstwindow=driver.findElement(By.id("home"));
		firstwindow.click();
		
		Set<String>handles=driver.getWindowHandles();
		 for (String newwindows : handles) 
		 {
			 driver.switchTo().window(newwindows);
		}
		 
		 WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		 editbox.click();
		 driver.close();
		 driver.switchTo().window(praentwindow);
		 
		 WebElement multiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		 multiple.click();
		 int NOofWindows=driver.getWindowHandles().size();
		 System.out.println("Number of Windows:"+NOofWindows);
		 
		 WebElement closewindow=driver.findElement(By.id("color"));
		 closewindow.click();
		 
		 Set<String> newhandle=driver.getWindowHandles();
		 for (String Allwindow : newhandle) {
			 if(!Allwindow.equals(praentwindow))
			 {
				 driver.switchTo().window(Allwindow);
				 driver.close();
			 }
	}

  }
}
