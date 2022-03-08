package variousConsepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LearnKeyBoardEvent {
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
    @Test
	public void loginTest() {
		
		By userNameLocator = By.xpath("//input[@id='username']");
		By passWordLocator = By.xpath("//input[@id='password']");
		By signinbuttonLocator = By.xpath("/html/body/div/div/div/form/div[3]/button");
		
		driver.findElement(userNameLocator).sendKeys("demo@techfios.com");
		driver.findElement(passWordLocator).sendKeys("abc123");
		//driver.findElement(signinbuttonLocator).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform(); //build perform helps the action class to build during the run time
		//action.sendKeys(Keys.RETURN).build().perform(); //also can be used same as ENTER
		
    }
		public void teardown() {
			driver.close();
			driver.quit();
		}
		
		
		
		

}
