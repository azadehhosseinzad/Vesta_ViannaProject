package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_Main;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Testcase_Main {
	WebDriver driver;
  @Test(dataProvider="InsertPresentedLesson",dataProviderClass= DataProviderMinimal.class)
  public void f(String lessontitle,String takecourse,String capacity) throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  PageObject_Main presented=PageFactory.initElements(driver, PageObject_Main .class);
	  presented.PressentedLesson(driver, lessontitle,takecourse, capacity);
	  
//	  Assert.assertEquals(driver.getTitle(), "مسیر یادگیری smoke");
//	  driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	  driver =new ChromeDriver();
     driver.manage().window().maximize();   
 	 Thread.sleep(1000);
 	AdminDev_Login Admin_Login=PageFactory.initElements(driver, AdminDev_Login.class);
	  Admin_Login.login();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
