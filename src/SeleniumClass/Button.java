package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html"); 
		
		WebElement getpositionButton=driver.findElement(By.id("position"));
		
		Point xypoint=getpositionButton.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println(xvalue);
		System.out.println(yvalue);
		
		WebElement ButtonColor=driver.findElement(By.id("color"));
		String color=ButtonColor.getCssValue("background-color");
		System.out.println(color);
				
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		
		WebElement homeButton= driver.findElement(By.id("home"));
	    homeButton.click();
		

	}

}
