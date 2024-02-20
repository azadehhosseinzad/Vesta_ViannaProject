package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_VirClass;
import org.testng.annotations.Test;
import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TestCase_VirClass {
	WebDriver driver;
  @Test(dataProvider="InsertVirClass_TC1",dataProviderClass= DataProviderMinimal.class)
  public void f(String groupname,String title,String capacity,String Titlevirclass,String startdate,String starttime,String duration) throws InterruptedException {
 
  
	  PageObject_VirClass createvirclass=PageFactory.initElements(driver, PageObject_VirClass.class);
	  createvirclass.CraeteVirCalss(driver, groupname, title, capacity, Titlevirclass, startdate, starttime, duration);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException{
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
