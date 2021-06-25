package selenium1st;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class C {

	public static void main(String[] args) throws InterruptedException, IOException {
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
      WebElement w=driver.findElement(By.id("themes"));
      Select s1=new Select(w);
     s1.selectByVisibleText("Visa Free");
      Actions a=new Actions(driver);
      a.moveToElement(driver.findElement(By.id("dphh1"))).clickAndHold().build().perform();
      Thread.sleep(1000);
      
     
      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\SS"));
  
      
		
      
      driver.close(); 

	}

}
