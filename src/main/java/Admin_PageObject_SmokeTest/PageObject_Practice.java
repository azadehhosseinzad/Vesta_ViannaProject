package Admin_PageObject_SmokeTest;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Practice {
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
	
	@FindBy(xpath="//span[.='تکلیف']")
	WebElement choosepractice;
	
	@FindBy(css=".md-btn-success") 
	WebElement AddPractice;
	
	@FindBy(id="txtTitle") 
	WebElement Titlepractice;
	
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
	
	@FindBy(id="AfterAnswerSent") 
	WebElement AfterAnswer;
	
	@FindBy(xpath="//a[.='پاسخ تکلیف']") 
	WebElement PracticeAnsware;
	
	@FindBy(xpath="//button[.='ایجاد و افزودن به بخش']") 
	WebElement Button;
	


	
	public void CreatePractice(WebDriver driver,String title,String begindate,String starttime,String enddate,String endtime) throws InterruptedException {
		 Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		AddActivity.click();
		wait.until(el -> choosepractice);
		//Thread.sleep(1000);
		choosepractice.click();
		AddPractice.click();
		//Insert Practice
		Titlepractice.sendKeys(title);
		Begindate.sendKeys(begindate);
		Starttime.click();
		//wait.until(el -> Starttime);
		Starttime.sendKeys(starttime);
		Thread.sleep(1000);
		StartSelect.click();
		Enddate.sendKeys(enddate);
		Endtime.click();
		Endtime.sendKeys(endtime);
		Thread.sleep(1000);
		EndSelect.click();
		AfterAnswer.click();
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
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,-500)");
        
		PracticeAnsware.click();
		  JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,1000)");
		 driver.switchTo().frame(1);
		 driver.findElement(By.cssSelector("html")).click();
	        {
	          WebElement element = driver.findElement(By.cssSelector(".cke_editable"));
	          js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'bye'}", element);
	        };
	        //Thread.sleep(2000);
	        driver.switchTo().defaultContent();
	        Button.click();
		//Lessonclick.click();

		
		
	}

}
