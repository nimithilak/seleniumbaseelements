package mavenlearning;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mvn {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thilak\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		  
		  // textbox.....
		  
		  
		  driver.get("https://www.leafground.com/input.xhtml");
		  driver.findElement(By.id("j_idt88:name")).sendKeys("nimi");
		  driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("canada");
		  driver.findElement(By.id("j_idt88:j_idt95")).clear();
		  screenshot3("textbox");
		  
		  WebElement getatt = driver.findElement(By.id("j_idt88:j_idt97")); String
		  value=getatt.getAttribute("value"); System.out.println(value);
		  screenshot3("textbox2");
		  
		  driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("nn@gmail.com"+Keys.TAB);
		  WebElement disable = driver.findElement(By.id("j_idt88:j_idt93")); 
		  boolean enable=disable.isEnabled(); System.out.println(enable);
		  screenshot3("textbox3");
		  
		 //button....
		  
		  driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01ejvnil0um08cztm14jz6bf1w380136.node0"); 
		  WebElement buttonsize1=driver.findElement(By.id("j_idt88:j_idt98")); 
		  int hight1=buttonsize1.getSize().getHeight(); 
		  int width1=buttonsize1.getSize().getWidth();
		  System.out.println("buttonhight"+hight1+"buttonwidth"+width1);
		  
		  WebElement buttonposition1=driver.findElement(By.id("j_idt88:j_idt94")); 
		  Point xypointer1=buttonposition1.getLocation();
		  int xvalue1=xypointer1.getX();
		  int yvalue1=xypointer1.getY();
		  screenshot3("button");
		  System.out.println("position"+xvalue1+yvalue1);
		  
		  WebElement buttoncolor1=driver.findElement(By.id("j_idt88:j_idt96")); 
		  String color1=buttoncolor1.getCssValue("background"); 
		  screenshot3("button2");
		  System.out.println(color1);
		  
		  WebElement buttondisable1=driver.findElement(By.id("j_idt88:j_idt92"));
		  boolean enable11=buttondisable1.isEnabled(); 
		  screenshot3("button3");
		  System.out.println(enable11);
		  
		  driver.findElement(By.id("j_idt88:j_idt90")).click(); 
		  String text1=driver.getTitle();
		  screenshot3("button4");
		  System.out.println(text1);
		  driver.navigate().back();
		  screenshot3("buttonhomepage");
		  
		//alert.. alert is a interface
		  
		  driver.get("https://www.leafground.com/alert.xhtml"); 
		  WebElement alert1=driver.findElement(By.id("j_idt88:j_idt91")); 
		  alert1.click();
		  //screenshot3("alert");
		  Alert alertt= driver.switchTo().alert(); alertt.accept();
		  
		  WebElement alert2=driver.findElement(By.id("j_idt88:j_idt93"));
		  alert2.click();
		  
		  Alert alertd=driver.switchTo().alert(); 
		  alertd.dismiss();
		  
		  WebElement alert3=driver.findElement(By.id("j_idt88:j_idt104"));
		  alert3.click();
		  Alert alertskey = driver.switchTo().alert();
		  alertskey.sendKeys("nimi"); 
		  alertskey.accept();
		  screenshot3("alert2");
		  
		//radiobutton.. ---is selected or click
		  
		  driver.get("https://www.leafground.com/radio.xhtml"); 
		  WebElement radiocheck=driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[1]/div")); 
		  radiocheck.click();//checked
		  radiocheck.click();//unchecked
		  screenshot3("radiobutton");
		  
		  WebElement defaultchecked=driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div"));
		  boolean yes=defaultchecked.isSelected();
		  System.out.println(yes);
		  screenshot3("radiobutton2");

		//check box
		  
		  driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0uhya84rekl3yi238zxybrzfj380558.node0"); 
		  WebElement checkbox=driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
		  checkbox.click();
		  screenshot3("checkbox");
		  
		  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[2]/div/div[2]")).click();
		  
		//Windows Handling..use driver.getWindowHandles()--- remember to back page driver.switchTo().window(spcific window) or switchTo().defaultContent();
		  
		  driver.get("https://www.leafground.com/window.xhtml");
		  String parentwindow=driver.getWindowHandle();
		  WebElement parent=driver.findElement(By.id("j_idt88:new"));
		  parent.click();
		  String text11=driver.getTitle(); 
		  System.out.println(text11);
		  screenshot3("windowshandle");
		  
		  
		  WebElement findsize=driver.findElement(By.id("j_idt88:j_idt91"));
		  findsize.click(); 
		  int size1=driver.getWindowHandles().size();
		  System.out.println(size1);
		  Thread.sleep(3000);
			 WebElement multiwin2=driver.findElement(By.id("j_idt88:j_idt95"));
			 multiwin2.click();
			  
		  
		  WebElement multiwin=driver.findElement(By.id("j_idt88:j_idt93"));
		  multiwin.click(); 
		  Set<String> multiwindows=driver.getWindowHandles();
		  for(String multi : multiwindows) { 
			  if(!multi.equals(parentwindow)) {
				  driver.switchTo().window(multi);
				  	//driver.close(); 
				  	}
			  }
		  
		//Frame Handling.. remember to back page driver.switchTo().defaultContent();
		  driver.get("https://www.leafground.com/frame.xhtml");
		  driver.switchTo().frame(0); WebElement
		  frame1=driver.findElement(By.xpath("//*[@id=\'Click\']")); 
		  frame1.click();
		  //screenshot3("frame");
		  
		  WebElement frametext=driver.findElement(By.xpath("//*[@id=\'Click\']"));
		  String textgetting=frametext.getText(); System.out.println(textgetting);
		  
		  driver.switchTo().defaultContent();
		  
			/*
			 * List<WebElement> framesize=driver.findElements(By.tagName("iframe")); int
			 * text3=framesize.size(); System.out.println(text3);
			 */
		  
		  //Mouse action-----drag and drop.. we use action class... in action class we have to pass (driver)
		  driver.get("https://www.leafground.com/drag.xhtml");
		  WebElement drag1=driver.findElement(By.id("form:conpnl_header"));
		  Actions  action = new Actions(driver); 
		  action.dragAndDropBy(drag1, 20, 40).build().perform();
		  screenshot3("draganddrop");
		  WebElement drag2=driver.findElement(By.id("form:drag_content")); WebElement
		  drop2=driver.findElement(By.id("form:drop_header"));
		  
		  Actions action1 = new Actions(driver); action1.dragAndDrop(drag2,
		  drop2).build().perform();
		  
		//Links
		  driver.navigate().to("https://www.leafground.com/link.xhtml");
		  WebElement link1=driver.findElement(By.linkText("Go to Dashboard"));
		  link1.click(); driver.navigate().back();
		  screenshot3("link");
		  
		  WebElement link2=driver.findElement(By.linkText("Go to Dashboard"));
		  link2.click(); driver.navigate().back();
		  
		//Calander.. 
		  driver.get("https://www.leafground.com/calendar.xhtml");
		  List<WebElement> calender=driver.findElements(By.tagName("td")); 
		  int countcolumn=calender.size();
		  System.out.println(countcolumn);
		  screenshot3("calender");
		  
		  List<WebElement> calenderrow=driver.findElements(By.tagName("tr")); 
		  int countrow=calenderrow.size(); 
		  System.out.println(countrow);
		  
		  driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'7')]")).click();
	
		  driver.quit();
	}
	public static void screenshot3(String filename) throws IOException{
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File soucefile=scrshot.getScreenshotAs(OutputType.FILE);
		File desfile=new File("C:\\Users\\Thilak\\Documents\\ws\\mavenlearning\\src\\main\\java\\Screenshots\\"+filename+".png");
		FileHandler.copy(soucefile, desfile);
	}

}
