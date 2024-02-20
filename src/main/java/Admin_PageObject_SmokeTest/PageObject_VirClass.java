package Admin_PageObject_SmokeTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_VirClass {
	@FindBy(css=".menu_section > ul > li:nth-of-type(1) > a")
	WebElement SelectAllLesson;
	
    @FindBy(css=".act_section [href='/lms/lesson/list/']") 
    WebElement AllLesson;
	
	@FindBy(xpath="//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]/a[1]/i") 
	WebElement selectlesson;
	
	@FindBy(xpath="//*[@id=\"grid\"]/div[2]/table/tbody/tr/td[10]/a[1]/i") 
	WebElement selectpresentedlesson;
	
	@FindBy(xpath="//a[contains(@class,'top_menu_toggle md-btn')]") 
	WebElement AddActivity;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a[1]/i") 
	WebElement choosevir;
	
	@FindBy(css=".md-btn-mini")
	WebElement CreateGroup;
	
	@FindBy(css=".md-input")
	WebElement GroupName;
	
	@FindBy(css=".js-modal-ok")
	WebElement BtnSuccess;
	
	@FindBy(css=".uk-button-success")
	WebElement BtnSuccessTwo;
	
	@FindBy(xpath="//a[contains(.,' افزودن کلاس')]")
	WebElement CreateClass;
	
	@FindBy(id="Title")
	WebElement Title;
	
	@FindBy(id="Capacity")
	WebElement Capacity;
	
	@FindBy(css=".md-btn-success > .material-icons")
	WebElement BtnSuccess3;
	
	@FindBy(css="[data-command='transferAllFrom']")
	WebElement transferAllFrom;
	
	@FindBy(xpath="//*[@id=\"breadcrumbs\"]/li[5]/a")
	WebElement Backtolesson;
	
	@FindBy(xpath="//a[.='افزودن محتوا']")
	WebElement Content;
	
	@FindBy(xpath=".uk-row-first.uk-width-1-2 li:nth-of-type(5) > a")
	WebElement AddVirClass;
	
	@FindBy(id="Title")
	WebElement Titlevirclass;
	
	
	@FindBy(id="startDate-0")
	WebElement StartDate;
	
	@FindBy(id="uk_tp_1")
	WebElement StartTime;
	
	@FindBy(css="[data-value='10:00'] > .needsclick")
	WebElement Selecttime;
	
	@FindBy(css="[data-val-number='The field Duration must be a number.']")
	WebElement Duration;
	
	@FindBy(css="#createBtn > .material-icons")
	WebElement Button;
	
	
	public void CraeteVirCalss(WebDriver driver,String groupname,String title,String capacity,String Titlevirclass,String startdate,String starttime,String duration) throws InterruptedException {
		Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		wait.until(el -> selectlesson);
		selectlesson.click();
		wait.until(el -> selectpresentedlesson);
		selectpresentedlesson.click();
		wait.until(el -> AddActivity);
		AddActivity.click();
		Thread.sleep(2000);
		choosevir.click();
		CreateGroup.click();
		GroupName.sendKeys(groupname);
		BtnSuccess.click();
		wait.until(el ->BtnSuccessTwo);
		BtnSuccessTwo.click();
		CreateClass.click();
		
		Random random=new Random();
		int randomInt=random.nextInt(10000);
		Title.sendKeys("vir"+randomInt);
		//Title.sendKeys(title);
		
		Capacity.clear();
		Thread.sleep(1000);
		Capacity.sendKeys(capacity);
		BtnSuccess3.click();
		transferAllFrom.click();
		Backtolesson.click();
		Content.click();
		AddVirClass.click();
		Title.sendKeys(Titlevirclass);
		WebElement dropdown = driver.findElement(By.id("MeetingGroups"));
	    dropdown.findElement(By.xpath("//option[. = 'Virclass']")).click();
	    StartDate.sendKeys(startdate);
	    StartTime.click();
		Thread.sleep(2000);
		StartTime.sendKeys(starttime);
		Selecttime.click();
		Duration.sendKeys(duration);
		Button.click();
		
		
	}

}
