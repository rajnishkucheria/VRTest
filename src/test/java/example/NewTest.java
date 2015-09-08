package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class NewTest {
	    
    @Test              
    public void testEasy() {   
    	WebDriver driver = new FirefoxDriver();
	  driver.get("loginURL");
	  driver.findElement(By.id("inputPassword")).sendKeys("loginId");
	  driver.findElement(By.id("inputUsername")).sendKeys("password");
	  driver.findElement(By.id("log_in")).click();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Sessions")).click();
	  driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();  
        driver.quit();
    }   
    @BeforeTest
    public void beforeTest() {  
    
    }       
    @AfterTest
    public void afterTest() {
              
    }   

}
