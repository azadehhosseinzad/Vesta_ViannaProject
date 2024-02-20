package Admin_PageObject_SmokeTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Scorm {
	WebElement driver;
	
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
		
	@FindBy(css=".uk-icon-book")
	WebElement SelectScorm;
		
	@FindBy(id="ScormTitle") 
	WebElement Title;

	@FindBy(id="ScormDescription")
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
	WebElement UploadScorm;
		
	@FindBy(id="btnCreate")
	WebElement Button;
		
		
		public void CreateScorm (WebDriver driver,String title,String description,String Startdate,String frometime,String enddate,String totime,String Upload) throws InterruptedException {
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
			SelectScorm.click();
			Title.sendKeys(title);
			Description.sendKeys(description);
			Thread.sleep(1000);
			startDate.sendKeys(Startdate);
			Thread.sleep(1000);
			FromTime.click();
			Thread.sleep(1000);
			//Thread.sleep(2000);
			FromTime.sendKeys(frometime);
			SelectFromTime.click();
			EndDate.sendKeys(enddate);
			ToTime.click();
			Thread.sleep(1000);
			ToTime.sendKeys(totime);
			Thread.sleep(1000);
			SelectToTime.click();
			 JavascriptExecutor js = (JavascriptExecutor) driver;	
		     js.executeScript("window.scrollBy(0,1300)");
		     UploadScorm.sendKeys(Upload);
			Thread.sleep(10000);
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;	
		     js1.executeScript("window.scrollBy(0,1500)");
			Button.click();
			
		}

		

	}



