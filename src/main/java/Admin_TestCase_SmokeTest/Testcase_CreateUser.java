package Admin_TestCase_SmokeTest;


import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_CreateUser;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_CreateUser {
	WebDriver driver;
  @Test(dataProvider="InsertUser",dataProviderClass= DataProviderMinimal.class)
  public void f(String user,String Password) throws InterruptedException {
  
	  PageObject_CreateUser createuser=PageFactory.initElements(driver, PageObject_CreateUser.class);
	  createuser.CreateUser(driver,user, Password);
	 
	 Assert.assertEquals(driver.getTitle(), "لیست کاربران");
	  driver.quit();
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
