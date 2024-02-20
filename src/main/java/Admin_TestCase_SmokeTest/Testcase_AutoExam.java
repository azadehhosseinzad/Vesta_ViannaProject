package Admin_TestCase_SmokeTest;
import Admin_PageObject_SmokeTest.DataProviderMinimal;
import Admin_PageObject_SmokeTest.PageObject_AutoMch;
import org.testng.annotations.Test;

import Admin.AdminDev_Login;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcase_AutoExam {

	WebDriver driver;
  @Test(dataProvider="InsertAutoExam",dataProviderClass= DataProviderMinimal.class)
  public void f(String title,String code,String passscore,String startdate,String fromtime,String EndDate,String totime,
			String duration,String positivescore,String negetivescore,String Questionscount) throws InterruptedException, ParseException, IOException {
	  
	  PageObject_AutoMch Newexam=PageFactory.initElements(driver, PageObject_AutoMch .class);
	  Newexam.AddNewAutoExam(driver, title, code, passscore, startdate, fromtime, EndDate, totime, duration, positivescore, negetivescore, Questionscount);
	  Assert.assertEquals(driver.getCurrentUrl(),"https://admindev.viannacloud.ir/exam/exam/list/presentedlesson/18622/");

	

//		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top\"]/"
//				+ "body/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/h1")).getText(),
//				"MY DASHBOARD");
	//  driver.quit();
}

  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	  driver =new ChromeDriver();
	//Resize current window to the set dimension
     driver.manage().window().maximize(); 
//  public void beforeMethod() throws InterruptedException, MalformedURLException {
//	  DesiredCapabilities caps=new DesiredCapabilities();
//	  caps.setBrowserName("chrome");
	// driver=new RemoteWebDriver(new URL("http://195.114.8.6:1111/wd/hub"),caps);
//	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//	  
//	 driver =new ChromeDriver();
	//  ChromeOptions options = new ChromeOptions();
 // options.setHeadless(true);
	//  driver =new ChromeDriver(options);
	

	//Resize current window to the set dimension
    driver.manage().window().maximize();   
	//  Dimension d = new Dimension(1300,1780);
   	  // driver.manage().window().setSize(d);

 	 //To Delay execution for 10 sec. as to view the resize browser
 	 Thread.sleep(1000);
 	// List<String> lines=Files.readAllBytes(Path.of("C:\\File\\CookieFile\\browser.data"));
 
 	 
 	AdminDev_Login Admin_Login=PageFactory.initElements(driver, AdminDev_Login.class);
	  Admin_Login.login();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
