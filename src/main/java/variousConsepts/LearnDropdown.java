package variousConsepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
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
		// Storing WebElement using WebElement Class
		// type Name = Value
		//WebElement userNameElement = driver.findElement(By.xpath("//input[@id='username']"));
		//WebElement passWordElement = driver.findElement(By.xpath("//input[@id='password']"));
		//WebElement signinbuttonElement = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		// WebElement dashboardHeaderElement =
		// driver.findElement(By.xpath("//h2[contains(), 'Dashboard' ]"));
		// Strong WebElement using By Class
		By userNameLocator = By.xpath("//input[@id='username']");
		By passWordLocator = By.xpath("//input[@id='password']");
		By signinbuttonLocator = By.xpath("/html/body/div/div/div/form/div[3]/button");
		By dashboardHeaderLocator = By.xpath("//h2[contains(text(), 'Dashboard')]");
		By customermenuLocator = By.xpath("//span[contains(text(),'Customers')]");
		By addcustomermenuLocator = By.xpath("//a[contains(text(),'Add Customer')]");
		By companyDropdownLocator = By.xpath("//select[@id='cid']");
		
		driver.findElement(userNameLocator).sendKeys("demo@techfios.com");
		driver.findElement(passWordLocator).sendKeys("abc123");
		driver.findElement(signinbuttonLocator).click();
		
		//Assert.assertTrue("Dashboard page not found!!", driver.findElement(dashboardHeaderLocator).isDisplayed());
		String Dashboardheader = driver.findElement(dashboardHeaderLocator).getText();
		System.out.println(Dashboardheader);
		Assert.assertEquals("Dashboard page not found!!", "Dashboard", Dashboardheader);
		
		driver.findElement(customermenuLocator).click();
		driver.findElement(addcustomermenuLocator).click();
		//add assert
		//add explicitywait
		Select sel = new Select(driver.findElement(companyDropdownLocator));
		//we added driver.beacause for this element on top we never used driver
		sel.selectByVisibleText("Techfios");
		//sel.getOptions();// to get all the options from dropdown
    }
		public void teardown() {
			driver.close();
			driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

