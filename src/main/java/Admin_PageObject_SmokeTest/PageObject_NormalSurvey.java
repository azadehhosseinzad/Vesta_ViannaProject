package Admin_PageObject_SmokeTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_NormalSurvey {

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
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a[7]")
	WebElement survey;
	
	@FindBy(css=".md-btn-small")
	WebElement createsurvey;
	
	@FindBy(css=".uk-dropdown-shown li:nth-of-type(2)")
	WebElement NormalSurvey;

	
	@FindBy(id="Title")
	WebElement Title_survey;
	
	@FindBy(id="startDate")
	WebElement startDate;
	
	@FindBy(id="FromTime")
	WebElement FromTime;
	
	@FindBy(css="[data-value='01:00'] > .needsclick")
	WebElement SelectStartTime;
	
	@FindBy(id="EndDate")
	WebElement EndDate;
	
	@FindBy(id="ToTime")
	WebElement ToTime;
	
	@FindBy(xpath="//div[@class='uk-autocomplete uk-open']//a[.='00:30']")
	WebElement SelectEndTime;
	
	@FindBy(xpath="//*[@id=\"tabs_1\"]/li[2]/a")
	WebElement QuestionTab;

	@FindBy(xpath="//*[@id=\"tabs_1_content\"]/li[2]/div/div/table/thead/tr/th[3]/a/i")
	WebElement AddSurvey;
	
	@FindBy(name="Questions[0].Title")
	WebElement FirstQuestion;
	
	@FindBy(name="Questions[1].Title")
	WebElement SecondQuestion;
	
	@FindBy(name="Questions[2].Title")
	WebElement ThirdQuestion;

	@FindBy(xpath="//*[@id=\"Questions\"]/tr/td[3]/i")
	WebElement Options;
	
	
	@FindBy(xpath="/html/body/div[5]/div/form/div[2]/div")
	WebElement model;
	
	@FindBy(xpath="//*[@id=\"QuestionChoicesModal\"]/div/table/thead/tr/th[4]")
	WebElement AddAnswer;
	
	@FindBy(xpath="//*[@id=\"LoadQuestionChoices\"]/tr[1]/td[2]/input")
	WebElement FirstAnswer;
	
	
	@FindBy(xpath="//*[@id=\"LoadQuestionChoices\"]/tr[2]/td[2]/input")
	WebElement SecondAnswer;
	
	@FindBy(xpath="//*[@id=\"LoadQuestionChoices\"]/tr[3]/td[2]/input")
	WebElement ThrirdAnswer;
	
	@FindBy(id="SaveModal")
	WebElement SaveModal;
	
	@FindBy(xpath="//*[@id=\"Questions\"]/tr[2]/td[3]/i")
	WebElement Options2;
	
	
	@FindBy(xpath="//*[@id=\"Questions\"]/tr[3]/td[3]/i")
	WebElement Options3;
	
	@FindBy(id="BtnCreate2")
	WebElement BtnCreate2;
	
   public void CreateSurvey(WebDriver driver,String titlesurvey,String StartDate,String fromtime,String endDate,String totime,String firstQuestion,String secondQuestion,String thirdQuestion,String firstAnswer,String secondAnswer,String thrirdAnswer) throws InterruptedException {
		  
		  
	   Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		wait.until(el -> AddActivity);
		AddActivity.click();
		//wait.until(el -> survey);
	   Thread.sleep(1000);
		survey.click();
		createsurvey.click();
		wait.until(el -> NormalSurvey);
	    NormalSurvey.click();
	   Title_survey.sendKeys(titlesurvey);
	   startDate.sendKeys(StartDate);
	   FromTime.click();
	   //Thread.sleep(2000);
	   wait.until(el -> FromTime);
	   FromTime.sendKeys(fromtime);
	   SelectStartTime.click();
	   EndDate.sendKeys(endDate);
	   ToTime.click();
	   ToTime.sendKeys(totime);
	   //Thread.sleep(2000);
	   wait.until(el -> SelectEndTime);
	   SelectEndTime.click();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,-1000)");
		   QuestionTab.click();
		   
		   for (int i=0; i < 3; i ++) {
			   AddSurvey.click();
			 }
		   FirstQuestion.sendKeys(firstQuestion);
		   SecondQuestion.sendKeys(secondQuestion);
		   ThirdQuestion.sendKeys(thirdQuestion);
		   Options.click();
		  // Thread.sleep(2000);
		   wait.until(el -> model);
		  model.click();
		  for (int i=0; i < 3; i ++) {
			   AddAnswer.click();
			 }
	     FirstAnswer.sendKeys(firstAnswer);
		  SecondAnswer.sendKeys(secondAnswer);
		   ThrirdAnswer.sendKeys(thrirdAnswer);
		   SaveModal.click(); 
		  // Thread.sleep(2000);
		   wait.until(el -> Options2);
		   Options2.click();
		   model.click();
			  for (int i=0; i < 3; i ++) {
				   AddAnswer.click();
				 }
			   FirstAnswer.sendKeys(firstAnswer);
				  SecondAnswer.sendKeys(secondAnswer);
				   ThrirdAnswer.sendKeys(thrirdAnswer);
				   SaveModal.click(); 
				  // Thread.sleep(2000);
				   wait.until(el -> Options3);
				   Options3.click();
				   model.click();
				   for (int i=0; i < 3; i ++) {
					   AddAnswer.click();
					 }
				   FirstAnswer.sendKeys(firstAnswer);
				   SecondAnswer.sendKeys(secondAnswer);
				   ThrirdAnswer.sendKeys(thrirdAnswer);
			       SaveModal.click(); 
			   BtnCreate2.click();
	   }
	

}
;