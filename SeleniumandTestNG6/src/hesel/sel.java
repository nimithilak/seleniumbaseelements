
  package hesel;
  
  import java.awt.AWTException; import java.awt.Robot; import java.awt.Toolkit;
  import java.awt.datatransfer.StringSelection; import java.awt.event.KeyEvent;
  import java.io.File; import java.util.ArrayList; import java.util.List;
  import java.util.Set; import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.Alert; import org.openqa.selenium.By; import
  org.openqa.selenium.Keys; import org.openqa.selenium.Point; import
  org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.interactions.Actions; import
  org.openqa.selenium.support.ui.Select;
  
  import com.google.common.io.ByteStreams;
  
  public class sel {
  
  @SuppressWarnings("deprecation") public static void main(String[] args) throws InterruptedException, AWTException
  { // TODO Auto-generated method
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Thilak\\Desktop\\chromedriver.exe");
  WebDriver driver = new
  ChromeDriver(); // driver.get("https://www.google.com/");
  
  driver.findElement(By.xpath("//*[@class='gLFyf //gsfi']")).sendKeys("good"+Keys.ENTER); 
  driver.findElement(By.linkText("Good Definition & MeaningMerriam-Webster")).
  click();
  
  // textbox.....
  
  
  driver.get("https://www.leafground.com/input.xhtml");
  driver.findElement(By.id("j_idt88:name")).sendKeys("nimi");
  driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("canada");
  driver.findElement(By.id("j_idt88:j_idt95")).clear();
  
  WebElement getatt = driver.findElement(By.id("j_idt88:j_idt97")); String
  value=getatt.getAttribute("value"); System.out.println(value);
  
  driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("nn@gmail.com"+Keys.TAB
  ); WebElement disable = driver.findElement(By.id("j_idt88:j_idt93")); boolean
  enable=disable.isEnabled(); System.out.println(enable);
  
  //button....
  
  driver.get(
  "https://www.leafground.com/button.xhtml;jsessionid=node01ejvnil0um08cztm14jz6bf1w380136.node0"
  ); WebElement buttonsize=driver.findElement(By.id("j_idt88:j_idt98")); int
  hight=buttonsize.getSize().getHeight(); int
  width=buttonsize.getSize().getWidth();
  System.out.println("buttonhight"+hight+"buttonwidth"+width);
  
  WebElement buttonposition=driver.findElement(By.id("j_idt88:j_idt94")); Point
  xypointer=buttonposition.getLocation(); int xvalue=xypointer.getX(); int
  yvalue=xypointer.getY(); System.out.println("position"+xvalue+yvalue);
  
  WebElement buttoncolor=driver.findElement(By.id("j_idt88:j_idt96")); String
  color=buttoncolor.getCssValue("background"); System.out.println(color);
  
  WebElement buttondisable=driver.findElement(By.id("j_idt88:j_idt92"));
  boolean enable1=buttondisable.isEnabled(); 
  System.out.println(enable1);
  
  driver.findElement(By.id("j_idt88:j_idt90")).click(); String
  text=driver.getTitle(); System.out.println(text); driver.navigate().back();
  
  //dropdown... value.index,visible text
  
  driver.get("https://www.leafground.com/select.xhtml"); WebElement
  dropdownindex=driver.findElement(By.className("ui-selectonemenu")); Select
  select=new Select(dropdownindex); select.selectByIndex(1);
  select.selectByIndex(2); select.selectByIndex(3);
  select.selectByVisibleText("Cypress");
  
  dropdownindex.sendKeys("Selenium");
  
  WebElement multidropdownselect=driver.findElement(By.className("ui-selectonemenu-items-wrapper")); 
  Select select2=new Select(multidropdownselect); 
  select2.selectByIndex(1);
  select2.selectByIndex(2); select2.selectByIndex(3);
  
  List<WebElement> list=select.getOptions(); //get list of dropdown options 
  int size=list.size(); System.out.println(size);
  
  WebElement dropdownvalue =
  driver.findElement(By.id("j_idt87:country_input")); Select select1=new
  Select(dropdownvalue); select1.selectByValue("Germany");
  
  //alert.. alert is a interface
  
  driver.get("https://www.leafground.com/alert.xhtml"); WebElement
  alert1=driver.findElement(By.id("j_idt88:j_idt91")); 
  alert1.click(); 
  Alert alertt= driver.switchTo().alert(); alertt.accept();
  
  WebElement alert2=driver.findElement(By.id("j_idt88:j_idt93"));
  alert2.click();
  
  Alert alertd=driver.switchTo().alert(); alertd.dismiss();
  
  WebElement alert3=driver.findElement(By.id("j_idt88:j_idt104"));
  alert3.click(); Alert alertskey = driver.switchTo().alert();
  alertskey.sendKeys("nimi"); alertskey.accept();
  
  WebElement
  alert4=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']"));
  alert4.click(); Alert alertc=driver.switchTo().alert(); alertc.dismiss();
  
  //radiobutton.. ---is selected or click
  
  driver.get("https://www.leafground.com/radio.xhtml"); WebElement
  radiocheck=driver.findElement(By.xpath(
  "//*[@id=\'j_idt87:city2\']/div/div[1]/div")); radiocheck.click();//checked
  radiocheck.click();//unchecked
  
  WebElement defaultchecked=driver.findElement(By.xpath(
  "//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div")); boolean
  yes=defaultchecked.isSelected(); System.out.println(yes);
  
  //check box
  
  driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0uhya84rekl3yi238zxybrzfj380558.node0"); 
  WebElement checkbox=driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
  checkbox.click();
  
  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]")).click();
  
  driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[2]/div/div[2]")).click();
  
  //Windows Handling..use driver.getWindowHandles()--- remember to back page driver.switchTo().window(spcific window) or switchTo().defaultContent();
  
  driver.get("https://www.leafground.com/window.xhtml");
  String parentwindow=driver.getWindowHandle(); WebElement
  parent=driver.findElement(By.id("j_idt88:new")); parent.click();
  String text1=driver.getTitle(); System.out.println(text1);
  
  
  WebElement findsize=driver.findElement(By.id("j_idt88:j_idt91"));
  findsize.click(); 
  int size1=driver.getWindowHandles().size();
  System.out.println(size1);
  
  
  WebElement multiwin=driver.findElement(By.id("j_idt88:j_idt93"));
  multiwin.click(); 
  Set<String> multiwindows=driver.getWindowHandles();
  for(String multi : multiwindows) { 
	  if(!multi.equals(parentwindow)) {
		  driver.switchTo().window(multi);
		  	driver.close(); } } Thread.sleep(3000);
  
  WebElement multiwin2=driver.findElement(By.id("j_idt88:j_idt95"));
  multiwin2.click();
  
  
  //Frame Handling.. remember to back page driver.switchTo().defaultContent();
  driver.get("https://www.leafground.com/frame.xhtml");
  driver.switchTo().frame(0); WebElement
  frame1=driver.findElement(By.xpath("//*[@id=\'Click\']")); frame1.click();
  
  WebElement frametext=driver.findElement(By.xpath("//*[@id=\'Click\']"));
  String textgetting=frametext.getText(); System.out.println(textgetting);
  
  driver.switchTo().defaultContent();
  
  List<WebElement> framesize=driver.findElements(By.tagName("iframe")); int
  text3=framesize.size(); System.out.println(text3);
  
  
  //for nested frame two time switchTo().frame(frame value);
  driver.switchTo().frame(2); driver.switchTo().frame("frame2");
  WebElement framenext1=driver.findElement(By.id("//*[@id=\'Click\']"));
  framenext1.click();
  
  WebElement framenext=driver.findElement(By.xpath("//*[@id=\'Click\']"));
  String text2=framenext.getText(); System.out.println(text2);
  
  //Mouse action-----drag and drop.. we use action class... in action class we have to pass (driver)
  driver.get("https://www.leafground.com/drag.xhtml");
  WebElement drag1=driver.findElement(By.id("form:conpnl_header"));
  Actions  action = new Actions(driver); action.dragAndDropBy(drag1, 20, 40).build().perform();
  
  WebElement drag2=driver.findElement(By.id("form:drag_content")); WebElement
  drop2=driver.findElement(By.id("form:drop_header"));
  
  Actions action1 = new Actions(driver); action1.dragAndDrop(drag2,
  drop2).build().perform();
  
  WebElement dragcoloum=driver.findElement(By.xpath("//td[2]")); WebElement
  dropcoloum=driver.findElement(By.xpath("//td[3]"));
  
  Actions action3 = new Actions(driver); action3.dragAndDrop(dragcoloum,
  dropcoloum).build().perform();
  
  //perform tool tip we to do get attribute Title
  
  //Selectable.. to the multi-select drop down but with a different HTML background like jQuery based.
  //we use action class to interact with Selectable element using selenium-- we use action class to multi select
  
  //Auto completion selection driver.get("https://www.google.com/");
  WebElement
  selection1=driver.findElement(By.xpath(
  "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
  selection1.sendKeys("s");
  
  List<WebElement> listing=driver.findElements(By.xpath("/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]"));
  for(WebElement webElement : listing) {
  if(webElement.getText().equals("selenium")) { webElement.click(); break; } }
  
  //file download and verify
  
  driver.get("https://www.leafground.com/file.xhtml"); WebElement
  filedl=driver.findElement(By.id("j_idt93:j_idt95")); filedl.click();
  
  File download=new File("C:\\Users\\Thilak\\Downloads");
  
  File[] filetotal=download.listFiles(); for (File file : filetotal) {
  if(file.getName().equals("TestLeaf Logo.png")) { System.out.println("yes");
  break; } }
  
  
  //upload file ---remember toolkit.getdefaulttoolkit remember for passing capacity in string selection
  driver.get("https://www.leafground.com/file.xhtml"); 
  WebElement filed=driver.findElement(By.id("j_idt88:j_idt89")); 
  filed.click();
  
  String pathlo="C:\\Users\\Thilak\\Downloads\\TestLeaf.png";
  
  StringSelection path=new StringSelection(pathlo);
  
  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
  
  Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
  robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
  robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
  
  
  //working with Image... remember if want to find broken image we getattributes(nathualwidth) value =0
  
  //Links driver.navigate().to("https://www.leafground.com/link.xhtml");
  WebElement link1=driver.findElement(By.linkText("Go to Dashboard"));
  link1.click(); driver.navigate().back();
  
  WebElement link2=driver.findElement(By.linkText("Go to Dashboard"));
  link2.click(); driver.navigate().back();
  
  WebElement findwhere=driver.findElement(By.partialLinkText("Find the URL"));
  String togo=findwhere.getAttribute("href");
  System.out.println("whare i am going"+togo);
  
  WebElement broken=driver.findElement(By.linkText("Broken?")); broken.click();
  String title=driver.getTitle(); if (title.contains("404")) {
  System.out.println("linkbroke"); } driver.navigate().back();
  
  List<WebElement> linkcount=driver.findElements(By.tagName("a")); int
  count=linkcount.size(); System.out.println(count);
  
  
  //Dynamic tables.. 
  driver.get("https://www.leafground.com/dynamicgrid.xhtml;jsessionid=node01wdd69fwzoctc13gurogwecucq383059.node0");
  List<WebElement> namelist=driver.findElements(By.xpath("//td/td[1]"));
  
  	List<String> nametake= new ArrayList<String>(); 
  		for (WebElement webElement : namelist) { 
  				String name=webElement.getText(); 
  					System.out.println(nametake); }
  
  ////td[normalize-space()='Julie David']//following::td[1]" for dynamic value for the we have write xpath according 
  WebElement dynamicvalue=driver.findElement(By.xpath("//td[normalize-space()='Julie David']//following::td[1]")); 
  String text=dynamicvalue.getText(); System.out.println(text);
  
  
  //Calanden.. driver.get("https://www.leafground.com/calendar.xhtml");
  List<WebElement> calender=driver.findElements(By.tagName("td")); int
  countcolumn=calender.size(); System.out.println(countcolumn);
  
  List<WebElement> calenderrow=driver.findElements(By.tagName("tr")); int
  countrow=calenderrow.size(); System.out.println(countrow);
  
  driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
  driver.findElement(By.xpath("//a[contains(text(),'7')]")).click();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); driver.get(
  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
  WebElement username=driver.findElement(By.xpath(
  "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"
  )); username.sendKeys("Admin"); WebElement
  password=driver.findElement(By.xpath(
  "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"
  )); password.sendKeys("admin123"); WebElement
  loginbutton=driver.findElement(By.xpath(
  "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
  loginbutton.click();
  
  
  driver.get("https://www.ooktechnologies.com/"); WebElement rbc =
  driver.findElement(By.xpath("///*[@id=\"side-nav-1\"]/ul/li[4]/a")); Select
  select = new Select(rbc); select.selectByIndex(2);
  System.out.println(select.getFirstSelectedOption());
  
  driver.get("https://www.leafground.com/select.xhtml"); WebElement
  dropdownindex=driver.findElement(By.className("ui-selectonemenu")); Select
  select=new Select(dropdownindex); select.selectByIndex(1);
  select.selectByIndex(2); select.selectByIndex(3);
  select.selectByVisibleText("Cypress"); dropdownindex.sendKeys("Selenium");
  
  
  driver.get("https://www.leafground.com/select.xhtml"); WebElement
  dropdownindex=driver.findElement(By.className("ui-selectonemenu")); Select
  select=new Select(dropdownindex); select.selectByIndex(1);
  select.selectByIndex(2);
  System.out.println(select.getFirstSelectedOption().getText());
  
  // driver.quit();
  
  }
  
  }
 