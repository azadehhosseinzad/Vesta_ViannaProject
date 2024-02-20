package Admin_TestCase_SmokeTest;
import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_Project;
import org.testng.annotations.Test;
import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_Project {
	WebDriver driver;

  @Test(dataProvider="InsertProject_TC2",dataProviderClass= DataProviderMinimal.class)

	  //Add New Practice
	
	  public void f(String title,String begindate,String starttime,String enddate,String endtime) throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  
		  PageObject_Project MinimalLesson=PageFactory.initElements(driver, PageObject_Project.class);
		  MinimalLesson.CreateProject(driver, title, begindate, starttime, enddate, endtime);
		  //Assert
		  Assert.assertEquals(driver.getTitle(), "لیست پروژه  ها smoke");
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
