package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;


public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
	 
	  String acutal_title_value = "Facebook Sign up";
	  String relative_title_value = driver.getTitle();
	  System.out.println("the actual value should be = "+acutal_title_value);
	  System.out.println("The relative value should be ="+relative_title_value);
	 
	  boolean done = acutal_title_value.equals(relative_title_value);
	  System.out.println();
	  System.out.println("Your value is verified ="+ done);
	  assertTrue(done, "Mismatches in the page title");
	  
	
	  Reporter.log(relative_title_value, done);
	  Reporter.log(acutal_title_value, done);
  }
  
  @Test
  public void f1() {
	  
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  
	  email.sendKeys("aannamalai@gmail.com");
	  
	  System.out.println("My name is annamalai");
  }
  
  @Test
  public void f2() {
	  
	  System.out.println("My name is annamalai");
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }

}
