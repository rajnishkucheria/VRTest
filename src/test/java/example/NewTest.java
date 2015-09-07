package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	    
    @Test              
    public void testEasy() {   
    	WebDriver driver = new FirefoxDriver();
    	
        driver.get("http://www.guru99.com/selenium-tutorial.html");  
        String title = driver.getTitle();                
        Assert.assertTrue(title.contains("Free Selenium Tutorials"));   
        driver.quit();
    }   
    @BeforeTest
    public void beforeTest() {  
    
    }       
    @AfterTest
    public void afterTest() {
              
    }   

}
