package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_NormalSurvey;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Testcase_Surveynormal {
	WebDriver driver;
	@Test(dataProvider="InsertNormalSurvey_1",dataProviderClass= DataProviderMinimal.class)
  public void f(String titlesurvey,String StartDate,String fromtime,String endDate,String totime,String firstQuestion,String secondQuestion,String thirdQuestion,String firstAnswer,String secondAnswer,String thrirdAnswer) throws InterruptedException { 

		  
		PageObject_NormalSurvey createSurvey=PageFactory.initElements(driver, PageObject_NormalSurvey.class);
		  createSurvey.CreateSurvey(driver, titlesurvey, StartDate, fromtime, endDate, totime, firstQuestion, secondQuestion, thirdQuestion, firstAnswer, secondAnswer, thrirdAnswer);
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
