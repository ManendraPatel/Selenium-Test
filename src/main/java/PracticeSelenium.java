import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.javac.util.List;

public class PracticeSelenium {

	public static void main(String[] args) 
	{
		WebDriver ms =new ChromeDriver();
		
		//ms.navigate().to("https://www.google.com/");
		ms.get("https://www.google.com/");
		ms.findElement(By.name("q")).sendKeys("Patel Films");
	WebElement m=	ms.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']"));
	Actions a=new Actions(ms);
	a.click(m).perform();
	String wid= ms.getWindowHandle();
	System.out.println("Window id ---->:" +wid);
	
	ms.manage().window().maximize();
	//implicitwait
	ms.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 List <WebElement> lst = ms.findElements(By.tagName("a"));
	System.out.println("Total Links on Page --->"+lst.size());
	System.out.println("Total Links on Page ");
	 for(WebElement mg:lst)
	 {
		 
		 System.out.println("List"+mg.getText());
		  if(mg.getText().equals("IndiaTimes"))
		  {
			  mg.click();
			  break;
		  }
	 }
	ms.close();

	}

}
