package Admin_PageObject_SmokeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageObject_Forum {
	WebElement driver;
	
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
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a[4]") 
	WebElement Forum;
	
	@FindBy(css=".md-btn-success > .material-icons") 
	WebElement AddForum;
	
	@FindBy(id="Title") 
	WebElement Title;
	
	@FindBy(id="VerifiedPostCount") 
	WebElement PostCount;
	
	@FindBy(id="BeginDate")
	WebElement begindate;
	
	@FindBy(id="StartTime")
	WebElement starttime;
	
    @FindBy(css="[data-value='10:00'] > .needsclick")
    WebElement StartSelect;
    
	@FindBy(id="EndDate")
	WebElement enddate;
	
	@FindBy(id="EndTime")
	WebElement endtime;
	
	@FindBy(css=".uk-dropdown[aria-expanded='true'] [data-value='15:00'] > .needsclick")
	WebElement EndSelect;

	@FindBy(id="AddAndAssignToSection")
	WebElement Button;

	
   public void CreateForum(WebDriver driver,String title,String postcount,String start_date,String start_time,String end_date,String end_time) throws InterruptedException {
		 Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	        wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
	   AddActivity.click();
	   wait.until(el -> Forum);
	 //  Thread.sleep(2000);
		Forum.click();
	   AddForum.click();
	   Title.sendKeys(title);
	   PostCount.sendKeys(postcount);
	   begindate.sendKeys(start_date);
	   starttime.click();
	   wait.until(el -> starttime);
	   //Thread.sleep(2000);
	   starttime.sendKeys(start_time);
   	  StartSelect.click();
	   enddate.sendKeys(end_date);
	   endtime.click();
	   wait.until(el -> endtime);
		 //Thread.sleep(2000);
		 endtime.sendKeys(end_time);
		 EndSelect.click();
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     // This  will scroll down the page by  1000 pixel vertical		
	        js1.executeScript("window.scrollBy(0,1000)");
		 Button.click();
	   
   }
	

}
;