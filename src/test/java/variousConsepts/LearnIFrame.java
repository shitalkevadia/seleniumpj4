package variousConsepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIFrame {
	WebDriver driver;
	
    @Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
   public void iFrame() {
	   driver.switchTo().frame("packageListFrame");
	   driver.findElement(By.xpath("java.awt.color")).click();
	   driver.switchTo().parentFrame();
	   driver.switchTo().frame("packageFrame");
	   driver.switchTo().parentFrame();
	   driver.switchTo().frame("classFrame");
	   driver.findElement(By.linkText("ColorSpace")).click();
	   
   } 

}
