package SeleniumClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow=driver.getWindowHandle();
		Thread.sleep(2000);
		WebElement fwindow=driver.findElement(By.id("home"));
        fwindow.click();
        
		Set<String> handles=driver.getWindowHandles();
		for (String newwindow : handles) {
		//	Thread.sleep(2000);
			driver.switchTo().window(newwindow);
		}
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
	    editbox.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		
		WebElement multiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiple.click();
		int noofwindows=driver.getWindowHandles().size();
		System.out.println("Number of Windows:"+noofwindows);
		
		WebElement closewindow=driver.findElement(By.id("color"));
		closewindow.click();
		 Set<String> newhandle=driver.getWindowHandles();
		 for (String Allwindow : newhandle) {
			 if(!Allwindow.equals(oldwindow))
			 {
				 driver.switchTo().window(Allwindow);
				 driver.close();
			 }
			
		}

	}

}
