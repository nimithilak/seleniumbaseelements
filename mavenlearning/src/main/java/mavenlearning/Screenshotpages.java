package mavenlearning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshotpages {
		static WebDriver driver;
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thilak\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		screenshot3("ss");
	}
		public static void screenshot3(String filename) throws IOException{
			
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File soucefile=scrshot.getScreenshotAs(OutputType.FILE);
		File desfile=new File("C:\\Users\\Thilak\\Documents\\ws\\mavenlearning\\src\\main\\java"+filename+".png");
		FileHandler.copy(soucefile, desfile);
}}