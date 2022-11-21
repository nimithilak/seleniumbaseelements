package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testNGNewTest {
	WebDriver driver;
	Long timeStart;
	Long endTime;

	@Test(groups= {"google"})
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}
	@Test(groups= {"bingo"})
	public void bingo() {
		driver.get("https://bingo.com//");
	}
	@Test(groups= {"yahoo"})
	public void yahoo() {
		driver.get("https://www.yahoo.com/");
	}
	@Test(groups= {"point"})
	public void point() {
		driver.get("https://www.tutorialspoint.com/index.htm/");
	}
	@Test(groups= {"names"})
	@Parameters("Name")
	public void names(String name) {
		System.out.println("my name is"+name);
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
