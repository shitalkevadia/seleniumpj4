package variousConsepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHoverOver {
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
    	By productLocater = By.xpath("//span[text()= 'Products']");
    	//By productLocater = By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span");
    	
    	By monitorsLocator = By.xpath("//a[contains(text(), 'Monitors')]");
         //By monitorLocator = By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[13]/a");
    	
    	By monitorsForHomeLocator = By.xpath("//a[contains(text(), 'monitors')]/parent::li/descendant::a[3]");
    	//By homeLocator = By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[11]/ul/li[3]/a");
    	
    	Actions action = new Actions(driver);
    	action.moveToElement(driver.findElement(productLocater)).build().perform();
    	action.moveToElement(driver.findElement(monitorsLocator)).build().perform();
    	driver.findElement(monitorsForHomeLocator).click();
    }
    
    
}
