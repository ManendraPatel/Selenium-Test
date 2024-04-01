import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.html5.*;

public class LearnSelenium {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver ms = new ChromeDriver();

		ms.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		ms.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		
		//String s = ms.getWindowHandle();
		
		//System.out.println(s);
	
		Set <String> winid = ms.getWindowHandles();
		
		List <String> winlist = new ArrayList(winid);
	 
		for(String m: winlist)
		{
			String title=ms.switchTo().window(m).getTitle();
			System.out.println(title);
			if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				ms.close();
			}
		}
		

	}

}
