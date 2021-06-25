package selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\akii java\\17 may\\chromedriver_win32");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/gp/yourstore/home?ie=UTF8&action=sign-out&path=%2Fgp%2Fyourstore%2Fhome&ref_=nav_AccountFlyout_signout&signIn=1&useRedirectOnSuccess=1&");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshaydhumal.ad95@gmail.com") ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("akshay@13") ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		Thread.sleep(3000);
		Dimension count=driver.findElement(By.tagName(Title)).getSize();
		System.out.println(count);
}
}