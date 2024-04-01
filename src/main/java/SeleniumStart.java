import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumStart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		// below statement is optional now after selenium 4.6.0 release
		System.setProperty("webdriver.chrome.driver","F:/java selenium/chromedriver-win64/chromedriver.exe");
		 
		WebDriver ms = new ChromeDriver();
		ms.manage().window().maximize();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		// ms.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		 
		// CSS Selector using tag name and id
		 //ms.findElement(By.cssSelector("input#teachable_account_email")).sendKeys("ms@gmail.com");
		// CSS Selector using tag name and attribute
		//ms.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("12345678");
		// CSS Selector using tag name and class
		 // ms.findElement(By.cssSelector("input.password")).sendKeys("123456789555555");
		// CSS Selector using tag name and class & attribute
		//ms.findElement(By.cssSelector("input.password[type=password]")).sendKeys("12");
	   
		
	// using relative xpath 
	//ms.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		
		// static dropdown
		WebElement drpdwn = ms.findElement(By.id("dropdown-class-example"));
		Select msdrp = new Select(drpdwn);
		//msdrp.selectByIndex(3);
		// Thread.sleep(2000);
		//ms.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		msdrp.selectByVisibleText("Option2");
		
		// Radio button
		
		ms.findElement(By.cssSelector("input[value=radio1]")).click();
		
		//Suggession Class Example
		
 /*
	WebElement Form = ms.findElement(By.xpath("//input[@id='autocomplete']"));
	 Form.sendKeys("ins");
	 ms.findElement(By.xpath("//body//ul//li//div[contains(text(),'Argentina')]")).click();
  */
		// Checkbox Example
		ms.findElement(By.id("checkBoxOption1")).click();
		ms.findElement(By.id("checkBoxOption2")).click();
		
		
		// Switch Window
		// ms.findElement(By.id("openwindow")).click();
		
		// Switch Tab Example
		
		// ms.findElement(By.id("opentab")).click();
		
		//Switch To Alert Example

		ms.findElement(By.name("enter-name")).sendKeys("MS Ji");
		//ms.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		// ms.switchTo().alert().accept();
		ms.findElement(By.id("confirmbtn")).click();
		 ms.switchTo().alert().dismiss();
		 
		String test = ms.findElement(By.xpath("//td[contains(text(),'Selenium Webdriver with Java Basics + Advanced + I')]")).getText();
	  System.out.println(test);
	  String tb= ms.getTitle();
	  System.out.println(tb);
	  
	  List <WebElement> lst = ms.findElements(By.tagName("a"));
	    System.out.println("no of links: " + lst.size()); 
	    System.out.println("MS change");
	    WebElement ll= ms.findElement(By.xpath("//button[@id='mousehover']"));
		 Actions action = new Actions(ms);
		 action.moveToElement(ll).perform();
		 
		 
		 
	}

}
