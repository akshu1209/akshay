package selenium1st;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome,driver","C:\\Users\\Admin\\Desktop\\akii java\\17 may\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String login=driver.findElement(By.xpath("//span[@class='_36KMOx']/span")).getText();
		System.out.println("login");
		
		boolean True=driver.findElement(By.xpath("//span[@class='_36KMOx']/span")).isDisplayed();
		

		

		if(True)
		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
			Thread.sleep(3000);
			String Parent=driver.getWindowHandle();
			System.out.println(Parent);
			
			
			Set<String> li=driver.getWindowHandles();
			System.out.println(li);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("yamaha piano");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@alt='YAMAHA PSR-E463//IN YAMAHA Keyboard PSR-E463 Digital Portable Keyboard']")).click();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			Thread.sleep(3000);
			
		}
		
	


	}

}



