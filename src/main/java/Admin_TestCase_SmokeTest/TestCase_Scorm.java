package Admin_TestCase_SmokeTest;

import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_Scorm;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_Scorm {
	WebDriver driver;
	@Test(dataProvider="InsertScorm-1",dataProviderClass= DataProviderMinimal.class)
	public void f(String title,String description,String Startdate,String frometime,String enddate,String totime,String  Upload) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		PageObject_Scorm NewScorm=PageFactory.initElements(driver, PageObject_Scorm .class);
		NewScorm.CreateScorm(driver, title, description, Startdate, frometime, enddate, totime, Upload);

		Assert.assertEquals(driver.getTitle(), "مسیر یادگیری smoke");
		driver.quit();

	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
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
