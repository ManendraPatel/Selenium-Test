import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException 
	{
		
		WebDriver ms= new ChromeDriver();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
	    WebElement mslink=	ms.findElement(By.xpath("//div[@id='gf-BIG']"));
	    List <WebElement> links= mslink.findElements(By.tagName("a"));
		//List <WebElement> links=ms.findElements(By.tagName("a"));
		System.out.println("count"+links.size());
		Thread.sleep(1000);
		//ms.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(WebElement link : links)
		{
			
			//System.out.println(link.getText());
			String url = link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescod = conn.getResponseCode();
			
			if(rescod > 400)
			{
				System.out.println("link is not working"+link.getText()+"is code" +rescod);	
				
			}
		}
		
	}

}
