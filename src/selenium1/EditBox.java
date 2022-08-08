package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
	WebElement emailBox=driver.findElement(By.id("email"));
	emailBox.sendKeys("chandru@ampstek.com");
	
	WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
	appendBox.sendKeys("office");
	
	WebElement getTextBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
	getTextBox.getAttribute("value");
	
	System.out.println("value");

	WebElement clearBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	clearBox.clear();
	
	WebElement disableBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
	boolean enable= disableBox.isEnabled();
	System.out.println(enable);

	}

}