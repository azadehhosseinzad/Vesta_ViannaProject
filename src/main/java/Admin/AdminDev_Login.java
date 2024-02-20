package Admin;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  AdminDev_Login {
@FindBy(id="username") 
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(xpath=("//input[@class='md-btn md-btn-primary md-btn-block md-btn-large']"))
WebElement Button;

public  AdminDev_Login(WebDriver driver) {
	driver.get("https://testadmin.viannacloud.ir/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void login() {
	username.sendKeys("admindev");
	password.sendKeys("123456");
	Button.click();
	
	
		
	}
}


