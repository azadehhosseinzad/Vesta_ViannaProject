package Admin;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class coocki {
	WebDriver driver;
	 @Test
  public void f() throws IOException {
	driver.findElement(By.id("username")).sendKeys("admindev");
	driver.findElement(By.id("password")).sendKeys("123456");
		 driver.findElement(By.cssSelector(".md-btn-primary")).click();
	File dataFile=new File("C:\\File\\CookieFile\\browser.text");
	dataFile.delete();
	String str=null;
	for(Cookie ck:driver.manage().getCookies()) {
	str=ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"
			+ck.getExpiry()+";"+ck.isSecure()+"\n";
	}
	
FileWriter stringCookFile=new FileWriter("C:\\File\\CookieFile\\browser.text");
stringCookFile.write(str);
stringCookFile.close();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	  driver =new ChromeDriver();
      driver.manage().window().maximize();
 	 driver.navigate().to("https://ufdev.viannacloud.ir/login");
 	
  }
  @AfterMethod
  public void afterMethod() {
	 
  }

}
