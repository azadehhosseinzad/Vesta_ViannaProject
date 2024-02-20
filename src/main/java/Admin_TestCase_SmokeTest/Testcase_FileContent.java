package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_FileContent;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_FileContent {
	WebDriver driver;
  @Test(dataProvider="InsertFilecontent",dataProviderClass= DataProviderMinimal.class)
  public void f(String Title,String description,String Startdate,String frometime,String enddate,String totime,String Upload) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	  
	  PageObject_FileContent createfcontent=PageFactory.initElements(driver,PageObject_FileContent  .class);
	  createfcontent.createFileContent(driver, Title, description, Startdate, frometime, enddate, totime, Upload);
	  
	  Assert.assertEquals(driver.getTitle(), "مسیر یادگیری smoke");
	  driver.quit();

  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	  driver =new ChromeDriver();
	//Resize current window to the set dimension
     driver.manage().window().maximize();   
	 // Dimension d = new Dimension(1300,780);
   	  // driver.manage().window().setSize(d);

 	 //To Delay execution for 10 sec. as to view the resize browser
 	 Thread.sleep(1000);
 	AdminDev_Login Admin_Login=PageFactory.initElements(driver, AdminDev_Login.class);
	  Admin_Login.login();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
