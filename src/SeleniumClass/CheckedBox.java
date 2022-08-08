package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckedBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html"); 
		
		WebElement NotSelcted=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		NotSelcted.click();
		
		WebElement checkedbox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		boolean select=checkedbox2.isSelected();
		System.out.println(select);
		
		WebElement Notselct2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(Notselct2.isSelected())
		{
			Notselct2.click();
			
		}
		else
		{
			System.out.println("Hellking");
			
		}
		WebElement slecheck=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if (slecheck.isSelected())
		{
			slecheck.click();
		}
		
	}

}
