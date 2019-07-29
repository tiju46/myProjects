
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
 
public class NewTest {
 
	WebDriver driver;
 
  
  @BeforeClass
  public void beforeClass() {
   
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\tiju thomas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  FirefoxOptions options = new FirefoxOptions();
	  options.setCapability("marionette", false);
	  driver = new FirefoxDriver(options);
  }
  
    
 @BeforeMethod
  public Void bmthd() {
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return null;
	// TODO Auto-generated method stub

}
  
  @Test
  public void openMyBlog() {
 	  driver.get("https://www.google.com/");
 	  
  }
 // @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}