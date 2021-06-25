package selenium1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\akii java\\17 may\\chromedriver_win32");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String Title=driver.getTitle();
		System.out.print(Title);
		Thread.sleep(1000);
		
		Dimension count=driver.findElement(By.tagName("a")).getSize();
	     System.out.println(count);
	     
	 int count1=driver.findElements(By.tagName("a")).size();
	     System.out.println(count1);
	     
	String s=driver.findElement(By.xpath("(//a[@class='font14'])[8]")).getText();
	System.out.println(s);
	String url=driver.getCurrentUrl();
      System.out.println(url);
		
      
      driver.close(); 
		
		driver.get("https://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='caret'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("akshaydhumal.ad95@gmail.com") ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("@kki1234$") ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		driver.close();
		driver.getTitle();
	}

}
