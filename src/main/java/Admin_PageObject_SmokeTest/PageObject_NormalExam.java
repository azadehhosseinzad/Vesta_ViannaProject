package Admin_PageObject_SmokeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_NormalExam {
	WebDriver driver;
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
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a[2]") 
	WebElement Addexam;
	
	
	@FindBy(css=".md-btn-success")
	WebElement chooseExam;
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[2]/div/div/div/div/div/div/ul/li[1]/a")
	WebElement chooseNormalExam;
	
    @FindBy(id="ExamViewModel_Title")
    WebElement Title;

@FindBy(id="ExamViewModel_Code")
WebElement ExamCode;

@FindBy(id="ExamViewModel_PassScore")
WebElement PassScore;

@FindBy(id="startDate")
WebElement startDate;

@FindBy(id="FromTime")
WebElement FromTime;

@FindBy(css="[data-value='10:00'] > .needsclick") 
WebElement SelectStartTime;

@FindBy(id="EndDate") 
WebElement endDate;

@FindBy(id="ToTime") 
WebElement ToTime;

@FindBy(css=".uk-dropdown[aria-expanded='true'] [data-value='11:00'] > .needsclick") 
WebElement SelectEndTime;

@FindBy(id="ExamViewModel_Duration") 
WebElement Duration;

@FindBy(linkText="توضیحات") 
WebElement Description;

@FindBy(css=".uk-grid-margin.uk-width-medium-1-1 small")
WebElement ChoseDescription;

@FindBy(linkText="سوالات آزمون") 
WebElement QuestionPage;


@FindBy(css=".uk-text-success") 
WebElement Question;

@FindBy(id="check_all") 
WebElement chooseallquestion;

@FindBy(css="[href='javascript:AddQuestions()']") 
WebElement addquestion;


@FindBy(id="SubmitExam2") 
WebElement createexam;



public void AddNewNormalExam(WebDriver driver,String title,String code,String passscore,String startdate,String fromtime,String EndDate,String totime,
		String duration) throws InterruptedException {
	   Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		AddActivity.click();
		wait.until(el -> Addexam);
		Addexam.click();
		wait.until(el -> chooseExam);
		chooseExam.click();
		wait.until(el -> chooseNormalExam);
		chooseNormalExam.click();
	Title.sendKeys(title);
	ExamCode.sendKeys(code);
	PassScore.sendKeys(passscore);
	startDate.sendKeys(startdate);
	FromTime.click();
	wait.until(el -> FromTime);
	//Thread.sleep(2000);
	FromTime.sendKeys(fromtime);
	SelectStartTime.click();
	endDate.sendKeys(EndDate);
	ToTime.click();
	wait.until(el -> ToTime);
	//Thread.sleep(2000);
	ToTime.sendKeys(totime);
	SelectEndTime.click();
	Duration.sendKeys(duration);

	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
     // This  will scroll down the page by  1000 pixel vertical		
        js1.executeScript("window.scrollBy(0,-500)");
	Description.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector("html")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".cke_editable"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'توضیحات'}", element);
    }
    driver.switchTo().defaultContent();
   // driver.findElement(By.cssSelector(".uk-grid-margin:nth-child(2)")).click();
  //  driver.findElement(By.cssSelector(".uk-grid-margin > .switchery")).click();
 // driver.switchTo().defaultContent();

  
   // ChoseDescription.click();
    JavascriptExecutor js3 = (JavascriptExecutor) driver;
    js3.executeScript("window.scrollBy(0,-1000)");
    QuestionPage.click();
    Question.click();
    chooseallquestion.click();
    addquestion.click();

  // WebElement dropdown = driver.findElement(By.id("questionStructures"));

    // create a Select object
  //  Select select = new Select(dropdown);

    // select the "Option 2" value
   // Thread.sleep(2000);
   // select.selectByIndex(1);
 //Thread.sleep(2000);

    Thread.sleep(3000);

    JavascriptExecutor js4 = (JavascriptExecutor) driver;
    // This  will scroll down the page by  1000 pixel vertical		
       js4.executeScript("window.scrollBy(0,1000)");
       createexam.click();
  //  Assert.assertEquals(true, ButtonTwo.isSelected()); //Verifies that the radio 
   // button is selected after action
   // System.out.println(“Radio button is selected – Assert passed”);
    
  //  BacktoLesson.click();
//    Thread.sleep(3000);
//    JavascriptExecutor js5 = (JavascriptExecutor) driver;
//    // This  will scroll down the page by  1000 pixel vertical		
//       js5.executeScript("window.scrollBy(0,500)");
//    ExamScore.sendKeys(examscore);
//    Button.click();
//    
    
}








}

