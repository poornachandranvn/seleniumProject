package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttuon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getPositionButton=driver.findElement(By.id("position"));
		
		//getPosition
		
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is :"+xValue+"Y value is :"+yValue);
		
		//find the color
		
		WebElement colorButton= driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("backdround-color");
		System.out.println("Button color is:"+color );
		
		//find the size
		
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is :"+ height+ "widht is :" + width);
		
		//go to home
		
	    WebElement homeButton= driver.findElement(By.id("home"));
	    homeButton.click();
	    
	    
	}

}
