package SeleniumClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html"); 
	
		/*WebElement alert=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alert.click();
		Alert alertbox=driver.switchTo().alert();
		//Thread.sleep(7000);
		alertbox.accept();
		
		WebElement confirmthat=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmthat.click();
		Alert alert1=driver.switchTo().alert();
		//Thread.sleep(7000);
		alert1.dismiss();
		*/
		WebElement promt=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promt.click();
		
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("hellking");
		//Thread.sleep(7000);
		alert2.accept();
		
		
		

	}

}
