package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_Video;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_Video {
	WebDriver driver;
  @Test(dataProvider="InserVideo",dataProviderClass= DataProviderMinimal.class)
  public void f(String title,String description,String stardate,String fromTime,String endDate,String toTime,String Upload) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  PageObject_Video NewVideo=PageFactory.initElements(driver, PageObject_Video .class);
	  NewVideo.CreateVideo(driver, title, description, stardate, fromTime, endDate, toTime, Upload);
	  
	 Assert.assertEquals(driver.getTitle(), "مسیر یادگیری smoke");
	  driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	  driver =new ChromeDriver();
	//Resize current window to the set dimension
     driver.manage().window().maximize();   

 	 Thread.sleep(1000);
 	
 	AdminDev_Login Admin_Login=PageFactory.initElements(driver, AdminDev_Login.class);
	  Admin_Login.login();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
