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

public class ProducerTest {
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
	  driver.findElement(By.id("inputUsername")).sendKeys("producer");
	  driver.findElement(By.id("log_in")).click();
  		String networkStatus = driver.findElement(By.className("network-status")).getText();
	  	Assert.assertEquals("Network: online", networkStatus);
    }  
    
       @AfterTest
    public void afterTest() {
    	driver.quit();
              
    }   

}