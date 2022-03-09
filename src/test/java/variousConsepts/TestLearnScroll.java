package variousConsepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearnScroll {
	
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
    public void ScrollTest() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("scroll(0,6000)"); //scrolldown
    	
    	
    	
    	
    }
    
    

}
