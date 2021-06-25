package selenium1st;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class K {
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webDriver.chrome,driver","C:\\Users\\Admin\\Desktop\\akii java\\17 may\\chromedriver_win32");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			Thread.sleep(2000);
			
			String Parent=driver.getWindowHandle();
			System.out.println(Parent);
			
			
			Set<String> li=driver.getWindowHandles();
			System.out.println(li);
			driver.close();
			
             int b=li.size();
			for (int a=0;a<=b;a++)
					{
				        driver.switchTo().window(b);
				
				
					}
	}


}
