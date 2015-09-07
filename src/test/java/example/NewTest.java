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
	  driver.get("https://beta.deltamktgresearch.com/");
	  driver.findElement(By.id("inputPassword")).sendKeys("nexsales");
	  driver.findElement(By.id("inputUsername")).sendKeys("superpro");
	  driver.findElement(By.id("log_in")).click();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Sessions")).click();
	  System.out.println("rajnish");
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
