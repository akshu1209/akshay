package selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.firebox.driver", "C:\\Users\\Admin\\Desktop\\akii java\\17 may\\FireforDriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String Title=driver.getTitle();
		System.out.print(Title);
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@class='caret'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("akshaydhumal.ad95@gmail.com") ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='sign_user_password']")).sendKeys("@kki1234$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		driver.close();
		driver.getTitle();
	}

}
