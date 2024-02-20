package Admin_PageObject_SmokeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Main {
	WebDriver driver;
	
	@FindBy(css=".menu_section > ul > li:nth-of-type(1) > a")
	WebElement SelectAllLesson;
	
    @FindBy(css=".act_section [href='/lms/lesson/list/']") 
    WebElement AllLesson;
    
    @FindBy(css=".md-btn-primary > .material-icons") 
    WebElement AddLesson;

    @FindBy(id="LessonTitle") 
    WebElement LessonTitle;
    
    @FindBy(id="CreateAndPresent") 
    WebElement PresentedLesson;
    
	@FindBy(xpath="/html/body/div[5]/div/form/div/div/div[2]/div/ul[2]/li[1]/div[3]/div[1]/div/span/span/span[1]")
	WebElement clickterm;

	@FindBy(xpath="//div[@id='TermId-list']//input[@class='k-textbox']")
     WebElement searchterm;
	
	@FindBy(xpath="//*[@id=\"TermId_listbox\"]/li[7]")
	WebElement SelectTerm;
	
	@FindBy(xpath="/html/body/div[5]/div/form/div/div/div[2]/div/ul[2]/li[1]/div[3]/div[2]/div/span/span/span[1]")
	WebElement Department;
	
	
	@FindBy(xpath="/html/body/div[9]/div/div[2]/ul/li[1]")
	WebElement SearchDepartment;
	
    @FindBy(id="submitReturnToList") 
    WebElement submitReturnToList;
    
    @FindBy(css=".md-icon[data-uk-tooltip='{ cls: \\'uk-tooltip-small\\'}']") 
    WebElement AddTakeCourse;
    
    @FindBy(id="takeCourseTitle") 
    WebElement TakeCourseTitle;
    
    @FindBy(id="Capacity") 
    WebElement Capacity;
    
    @FindBy(id="roles") 
    WebElement roles;
  
    @FindBy(xpath="//*[@id='roles']//*[@value='11']") 
    WebElement SelectRole;
    
    @FindBy(css=".uk-icon-check") 
    WebElement ButtunAddTakeCourse;
    
    @FindBy(xpath="//*[@id=\"grid\"]/div[2]/table/tbody/tr/td[10]/a[1]") 
    WebElement learningpath;
    
	public void PressentedLesson (WebDriver driver,String lessontitle,String takecourse,String capacity) throws InterruptedException {
		
		 Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	      wait.until(el -> SelectAllLesson);
	      SelectAllLesson.click();
	     wait.until(el -> AllLesson);
	     AllLesson.click();
	    wait.until(el -> AddLesson);
		AddLesson.click();
		LessonTitle.sendKeys(lessontitle);
		PresentedLesson.click();
		wait.until(el -> submitReturnToList);
		//Thread.sleep(2000);
//		clickterm.click();
//		Thread.sleep(2000);
//		SelectTerm.click();
//		Thread.sleep(2000);
//		Department.click();
//		SearchDepartment.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;	
//		js.executeScript("window.scrollBy(0,1500)");
	    submitReturnToList.click();
	    AddTakeCourse.click();
	    TakeCourseTitle.sendKeys(takecourse);
	    Capacity.clear();
	    Capacity.sendKeys(capacity);
	    roles.click();
	    SelectRole.click();
	    ButtunAddTakeCourse.click();
	   // wait.until(el -> learningpath);
	   // Thread.sleep(1000);
	 // learningpath.click();
	    
	    
	    
	  

		
	}

	

}
