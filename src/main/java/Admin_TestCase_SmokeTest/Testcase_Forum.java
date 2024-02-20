package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_Forum;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_Forum {
	WebDriver driver;
	@Test(dataProvider="InsertForum_1",dataProviderClass= DataProviderMinimal.class)
  public void f(String title,String postcount,String start_date,String start_time,String end_date,String end_time) throws InterruptedException { 
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  PageObject_Forum createforum=PageFactory.initElements(driver, PageObject_Forum.class);
		  createforum.CreateForum(driver, title, postcount, start_date, start_time, end_date, end_time);
		  
		  //Assert
		  Assert.assertEquals(driver.getTitle(), "لیست بحث ها smoke");
		  driver.quit();

	 }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	
	 		
	  System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	  driver =new ChromeDriver();
      //Resize current window to the set dimension
       driver.manage().window().maximize();
 	 //To Delay execution for 10 sec. as to view the resize browser
 	 Thread.sleep(1000);
 	AdminDev_Login Admin_Login=PageFactory.initElements(driver, AdminDev_Login.class);
	  Admin_Login.login();
  }

  @AfterMethod
  public void afterMethod() {
	
  }

}
