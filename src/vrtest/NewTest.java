package vrtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://beta.deltamktgresearch.com/");
	  driver.findElement(By.id("inputPassword")).sendKeys("nexsales");
	  driver.findElement(By.id("inputUsername")).sendKeys("superpro");
	  driver.findElement(By.id("log_in")).click();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Sessions")).click();
	  System.out.println("rajnish");
	  driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		//selenium.click("//div[@id='grid']/ul/li/div/i");
		//selenium.click("xpath=(//button[@type='button'])[5]");
		//selenium.click("//div[@id='s2id_autogen5']/ul/li[2]/a");
		//selenium.click("css=button.btn.btn-default");
	  //driver.quit();
	  //Assert.assertEquals("yes", "yes");
	  //driver.findElement(By.linkText("Logout"));
	  
  }
}