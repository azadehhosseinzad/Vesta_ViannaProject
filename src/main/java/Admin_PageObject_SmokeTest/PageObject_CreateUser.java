package Admin_PageObject_SmokeTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_CreateUser {
	
	@FindBy(css=".menu_section > ul > li:nth-of-type(1) > a")
	WebElement SelectAllLesson;
	
	@FindBy(id="userName")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="roles")
	WebElement roles;

	@FindBy(xpath="//option[.='student-2']")
	WebElement SelecRole;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement Department;
	
	//@FindBy(id="DepartmentIds_listbox")
	//WebElement Departmentid;
	
	@FindBy(xpath="//li[.='نامشخص']")
	WebElement chosedepartment;
	
	@FindBy(id="submitReturnToList")
	WebElement Button;
	
	public void CreateUser(WebDriver driver,String user,String Password) {
		
		Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
	    SelectAllLesson.click();
	    
	    driver.get("https://testadmin.viannacloud.ir/membership/user/create/");
	    wait.until(el -> roles);
		roles.click();
		wait.until(el -> SelecRole);
		SelecRole.click();
		wait.until(el -> Department);
		Department.click();
		 driver.manage().window().setSize(new Dimension(1382, 744));
		    {
		      WebElement element = driver.findElement(By.cssSelector(".k-multiselect-wrap"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).release().perform();
		    }
	    Department.click();
	    wait.until(el -> chosedepartment);
		chosedepartment.click();
		driver.findElement(By.cssSelector(".save-user .user_heading")).click();
		    
		Random random=new Random();
		int randomInt=random.nextInt(10000);
		userName.sendKeys("test"+randomInt);
		
        password.sendKeys(Password);
	    driver.findElement(By.id("submitReturnToList")).click();
		    
		    
		
		
		
	}



    }
	

