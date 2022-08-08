package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://qatechhub.com/");
	
	driver.manage().window().maximize();
	
	String titleOfThePage = driver.getTitle();
	
	if (titleOfThePage.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
		
	System.out.println("PASS");
		
	} else {
		
		System.out.println("faild");

	}
	
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().back();
	
	String URLpage=driver.getCurrentUrl();
	System.out.println(URLpage);
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	driver.quit();
	

	

	}

}
