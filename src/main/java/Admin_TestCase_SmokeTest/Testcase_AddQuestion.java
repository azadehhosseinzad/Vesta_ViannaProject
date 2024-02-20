package Admin_TestCase_SmokeTest;


import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_Question;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_AddQuestion {
	WebDriver driver;
  @Test(dataProvider="InsertQuestionoflesson",dataProviderClass= DataProviderMinimal.class)
  public void f(String searchterm,String lessonid,String test) throws InterruptedException {

	  PageObject_Question AddQueation=PageFactory.initElements(driver, PageObject_Question.class);
	  AddQueation.addquestion(driver,searchterm,lessonid,test);
	  
	 Assert.assertEquals(driver.getTitle(), "لیست سوالات smoke");
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
