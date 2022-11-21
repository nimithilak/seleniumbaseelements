package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGNewTest2 {
	WebDriver driver;
	Long timeStart;
	Long endTime;
	
  @Test
  public void textbox() {
	  driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.id("j_idt88:name")).sendKeys("nimi");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("canada");
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		WebElement getatt = driver.findElement(By.id("j_idt88:j_idt97"));
		String value=getatt.getAttribute("value");
		System.out.println(value);
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("nn@gmail.com"+Keys.TAB);
		WebElement disable = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enable=disable.isEnabled();
		System.out.println(enable);
		
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
  

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  timeStart=System.currentTimeMillis();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thilak\\Desktop\\chromedriver.exe");
	  driver =new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
	 endTime= System.currentTimeMillis();
	 Long totaltime= endTime-timeStart;
	 System.out.println("totaltime"+totaltime);
	 
  }

}
