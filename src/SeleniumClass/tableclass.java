package SeleniumClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> colums=driver.findElements(By.tagName("th"));
		int columcount=colums.size();
		System.out.println("No of Colums:"+columcount);
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowssize=rows.size();
		System.out.println("No Of Rows:"+rowssize);
		
		WebElement learn=driver.findElement(By.xpath("//td[normalsize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent=learn.getText();
		System.out.println("Percentage:"+percent);
		
		List<WebElement> leastvalue=driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberlist=new ArrayList<Integer>();
		
		for ( WebElement webElement : leastvalue) 
		{
			
			String singlevalue=webElement.getText().replace("%","");
			numberlist.add(Integer.parseInt(singlevalue));
			
		}
		
		System.out.println("FinalLIST:"+numberlist);
		int smallvalue=Collections.min(numberlist);
		System.out.println(smallvalue);
		
		String smallvaluestring=Integer.toString(smallvalue)+"%";
		
		String path="//td[normalize-space()="+"\""+smallvaluestring +"\""+"]"+"//following::td[1]";
		System.out.println(path);
		WebElement check=driver.findElement(By.xpath("//td[normalize-space()=\"20%\"]//following::td[1]"));
		check.click();
	}

}
