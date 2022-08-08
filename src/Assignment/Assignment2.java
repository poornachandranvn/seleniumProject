package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String BrowserURL = driver.getCurrentUrl();
		
		if (BrowserURL.equalsIgnoreCase(BrowserURL)) {
			
			System.out.println("Yes");
			
		} else {
			
			System.out.println("NO");

		}
		
		
		WebElement CreateNewAccount=driver.findElement(By.xpath("//*[@id=\'u_0_2_Au\']/div[5]"));
		CreateNewAccount.click();
		
		
		WebElement SignUpHeading=driver.findElement(By.xpath("//*[@id=\'facebook\']/body/div[3]/div[2]/div/div/div[1]/div[1]"));
		
		if (SignUpHeading.isDisplayed()) {
			
			System.out.println("PASS");
			
		} else {
			System.out.println("No");

		}
		
		driver.findElement(By.name("firstname")).sendKeys("Poorna");
		driver.findElement(By.name("lastname")).sendKeys("chandran");
		driver.findElement(By.name("reg_email__")).sendKeys("chandru@ampstek.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("P12345678");
		
		WebElement datesBox =driver.findElement(By.id("day"));
		WebElement monthBox =driver.findElement(By.id("month"));
		WebElement yearBox =driver.findElement(By.id("year"));
		
		Select date = new Select(datesBox);
		date.selectByVisibleText("4");
		Select month = new Select(datesBox);
		month.selectByVisibleText("4");
		Select year = new Select(datesBox);
		year.selectByVisibleText("1994");
		
		driver.findElement(By.id("u_8_5_29")).clear();
		
		
	}

}
