package Admin_PageObject_SmokeTest;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Video {
	WebDriver driver;
	
	@FindBy(css=".menu_section > ul > li:nth-of-type(1) > a")
	WebElement SelectAllLesson;
	
    @FindBy(css=".act_section [href='/lms/lesson/list/']") 
    WebElement AllLesson;
	
	@FindBy(xpath="//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]/a[1]/i") 
	WebElement selectlesson;
	
	@FindBy(xpath="//*[@id=\"grid\"]/div[2]/table/tbody/tr/td[10]/a[1]/i") 
	WebElement selectpresentedlesson;
	
	
	@FindBy(xpath="//span[text()='بخش اول']") 
	WebElement part;
	
	@FindBy(xpath="//a[@class='lpm uk-text-success']") 
	WebElement section;
	
	@FindBy(xpath="//a[.='\uE04Bفایل ویدیویی']")
	WebElement choosevideo;
	
	@FindBy(id="FileTitle") 
	WebElement Title;

	@FindBy(id="Description")
	WebElement Description;
	
	@FindBy(id="startDate") 
	WebElement startDate;
	
	@FindBy(id="FromTime") 
	WebElement FromTime;
	
	@FindBy(xpath="//div[@class='uk-autocomplete uk-open']//a[.='10:30']") 
	WebElement SelectFromTime;
	
	@FindBy(id="EndDate") 
	WebElement EndDate;
	
	@FindBy(id="ToTime") 
	WebElement ToTime;
	
	@FindBy(css=".uk-dropdown[aria-expanded='true'] [data-value='11:00'] > .needsclick")
	WebElement SelectToTime;
	
	
	@FindBy(id="HttpPostedFileBase")
	WebElement HttpPostedFileBase;
	
	@FindBy(id="createAttachment")
	WebElement createAttachment;
	

	public void CreateVideo (WebDriver driver,String title,String description,String stardate,String fromTime,String endDate,String toTime,String Upload) throws InterruptedException {
		Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		part.click();
		section.click();
		Thread.sleep(1000);
		choosevideo.click();
		Title.sendKeys(title);
		Description.sendKeys(description);
		startDate.sendKeys(stardate);
		FromTime.click();
		Thread.sleep(1000);
		FromTime.sendKeys(fromTime);
		Thread.sleep(1000);
		SelectFromTime.click();
		EndDate.sendKeys(endDate);
		Thread.sleep(1000);
		ToTime.click();
		Thread.sleep(1000);
		ToTime.sendKeys(toTime);
		SelectToTime.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;	
	     js.executeScript("window.scrollBy(0,1300)");
		HttpPostedFileBase.sendKeys(Upload);
		Thread.sleep(7000);
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;	
	     js1.executeScript("window.scrollBy(0,1200)");
		createAttachment.click();
		
	}

	

}
