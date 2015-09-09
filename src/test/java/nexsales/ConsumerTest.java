package nexsales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ConsumerTest {
	WebDriver driver;
	
    @BeforeTest
    public void beforeTest() {  
    	
    	//System.setProperty("webdriver.chrome.driver", "/home/rajnish/chromedriver");
    	//driver = new ChromeDriver();
    	driver = new FirefoxDriver();
  	  	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  	  	driver.get("https://beta.deltamktgresearch.com/");
    }
	    
    @Test(priority=0)             
    public void testLogin() {   
	  driver.findElement(By.id("inputPassword")).sendKeys("nexsales");
	  driver.findElement(By.id("inputUsername")).sendKeys("consumer");
	  driver.findElement(By.id("log_in")).click();
	  String breadCrumb = driver.findElement(By.className("breadcrumb")).getText();
	  Assert.assertEquals("Home", breadCrumb);
    }  
    
    @Test(priority=1)               
    public void testIsOnline() {   
    	
    	String networkStatus = driver.findElement(By.className("network-status")).getText();
   	  	Assert.assertEquals("Network: offline", networkStatus);
    } 
    
    @Test(priority=2)             
    public void testMenuPresent() {   
    	
    	boolean isPresent = driver.findElements(By.linkText("Sessions")).size()> 0;
  	  	Assert.assertEquals(true, isPresent);
    } 
       
    @AfterTest
    public void afterTest() {
    	driver.quit();
              
    }   

}