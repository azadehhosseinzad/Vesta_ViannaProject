package Admin_PageObject_SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Project {
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
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a[5]") 
	WebElement ChooseProject;
	
	@FindBy(css=".md-btn-success") 
	WebElement AddProject;
	
	@FindBy(id="title") 
	WebElement TitleProject;
	
	@FindBy(id="BeginDate") 
	WebElement Begindate;
	
	@FindBy(id="StartTime") 
	WebElement Starttime;
	
	@FindBy(css="[data-value='10:00'] > .needsclick") 
	WebElement StartSelect;
	
	@FindBy(id="EndDate") 
	WebElement Enddate;
	
	@FindBy(id="EndTime") 
	WebElement Endtime;
	
	@FindBy(css=".uk-dropdown[aria-expanded='true'] [data-value='11:30'] > .needsclick") 
	WebElement EndSelect;

	
	@FindBy(xpath="//ul[@class='uk-tab']/li[@class='uk-active']/a[.='شرح پروژه']") 
	WebElement PracticeAnsware;
	
	@FindBy(id="AddAndAssignToSection") 
	WebElement Button;
	

	
	public void CreateProject(WebDriver driver,String title,String begindate,String starttime,String enddate,String endtime) throws InterruptedException {
		
	    Wait<WebDriver> wait = new WebDriverWait(driver, 40000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		AddActivity.click();
		Thread.sleep(1000);
		ChooseProject.click();
		AddProject.click();
		//Insert Practice
		TitleProject.sendKeys(title);
		Begindate.sendKeys(begindate);
		Starttime.click();
		wait.until(el -> Starttime);
		Starttime.sendKeys(starttime);
		Thread.sleep(1000);
		StartSelect.click();
		Enddate.sendKeys(enddate);
		Endtime.click();
		wait.until(el -> Endtime);
		//Thread.sleep(2000);
		Endtime.sendKeys(endtime);
		Thread.sleep(1000);
		EndSelect.click();
	
        JavascriptExecutor js = (JavascriptExecutor) driver;
     // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("html")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".cke_editable"));
          js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'salam'}", element);
        };
        
        driver.switchTo().defaultContent();
       
	        //JavascriptExecutor executor = (JavascriptExecutor) driver;
	       // executor.executeScript("arguments[0].scrollIntoView(true);", Button);    
	       // Button.click();
	        Button.click();
		//Lessonclick.click();
	     //   browser.executeScript('document.getElementById("AddAndAssignToSection").scrollIntoView()');

	      //  browser.sleep(500);

	        // click it
	     //   Button(by.id('targetID')).click()

		
	        
	}

}
