import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class seleniumtest {

	public static void main(String[] args) throws Exception
	{
		// below statement is optional now after selenium 4.6.0 release
		// System.setProperty("webdriver.chrome.driver","F:/java selenium/chromedriver-win64/chromedriver.exe");
		 
		WebDriver ms = new ChromeDriver();
		ms.manage().window().maximize();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 ms.findElement(By.id("autocomplete")).sendKeys("ind");
		 ms.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List <WebElement> m1= ms.findElements(By.xpath("//li[@class='ui-menu-item']//div[@class='ui-menu-item-wrapper']"));
		
		System.out.println("Size of list :"+ m1.size());
                  	
		for (WebElement lst : m1) 
		{
		
			System.out.println("List " +lst.getText());
			if(lst.getText().equals("India"))
			{
				lst.click();
				break;
			}
			
		}
		
     //    ms.close();
		 
		 
		 
		 
		 
	}
}