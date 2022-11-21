package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class buttontest {
	WebDriver driver;
	Long timeStart;
	Long endTime;
	
  @Test
  public void button() {
	  driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01ejvnil0um08cztm14jz6bf1w380136.node0");
		WebElement buttonsize=driver.findElement(By.id("j_idt88:j_idt98"));
		int hight=buttonsize.getSize().getHeight();
		int width=buttonsize.getSize().getWidth();
		System.out.println("buttonhight"+hight+"buttonwidth"+width);

		WebElement buttonposition=driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypointer=buttonposition.getLocation();
		int xvalue=xypointer.getX();
		int yvalue=xypointer.getY();
		System.out.println("position"+xvalue+yvalue);

		WebElement buttoncolor=driver.findElement(By.id("j_idt88:j_idt96"));
		String color=buttoncolor.getCssValue("background");
		System.out.println(color);

		
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
