package Admin_PageObject_SmokeTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_MatrixSurvey {
	
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
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[3]/div/div/div/div/div/div/ul/li[1]/a")
	WebElement survey_matrix;
	
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
	
	@FindBy(xpath="//a[.='سوالات  نظرسنجی']")
	WebElement QuestionTab;
	
	@FindBy(css="[onclick='AddQuestionRow()'] > .uk-text-success")
	WebElement AddSurvey;
	
	@FindBy(name="Questions[0].Title")
	WebElement FirstQuestion;
	
	@FindBy(name="Questions[1].Title")
	WebElement SecondQuestion;
	
	@FindBy(name="Questions[2].Title")
	WebElement ThirdQuestion;
	
	@FindBy(name="Questions[3].Title")
	WebElement FourthQuestion;
	
	@FindBy(xpath="//a[.='گزینه ها']")
	WebElement AnswerTab;
	
	@FindBy(css="a[onclick='AddChoiceRow()'] > .uk-text-success")
	WebElement Answers;
	
	@FindBy(name="Choices[0].Title")
	WebElement FirstAnswer;
	
	@FindBy(name="Choices[1].Title")
	WebElement SecondAnswer;
	
	@FindBy(name="Choices[2].Title")
	WebElement ThirdAnswer;
	
	@FindBy(name="Choices[3].Title")
	WebElement FourthAnswer;
	
	@FindBy(id="BtnCreate2")
	WebElement BtnCreate2;
	
	
   public void CreateSurvey(WebDriver driver,String titlesurvey,String StartDate,String fromtime,String endDate,String totime,String firstquestion,String secondquestion,String thirdQuestion,String fourthQuestion,String firstAnswer,String secondAnswer,String thirdAnswer,String fourthAnswer) throws InterruptedException {
		  
	   Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		AddActivity.click();
		survey.click();
		createsurvey.click();
		wait.until(el -> survey_matrix);
	   survey_matrix.click();
	   Title_survey.sendKeys(titlesurvey);
	   startDate.sendKeys(StartDate);
	   FromTime.click();
	   wait.until(el -> FromTime);
	   Thread.sleep(2000);
	   FromTime.sendKeys(fromtime);
	   SelectStartTime.click();
	   EndDate.sendKeys(endDate);
	   ToTime.click();
	   ToTime.sendKeys(totime);
	   wait.until(el -> SelectEndTime);
	   //Thread.sleep(2000);
	   SelectEndTime.click();
	   JavascriptExecutor jsone = (JavascriptExecutor) driver;
	     // This  will scroll down the page by  1000 pixel vertical		
	   jsone.executeScript("window.scrollBy(0,-1500)");
	   QuestionTab.click();
	 //  AddSurvey.click();
	   for (int i=0; i < 4; i ++) {
		   AddSurvey.click();
		 }
	   FirstQuestion.sendKeys(firstquestion);
	   SecondQuestion.sendKeys(secondquestion);
	   ThirdQuestion.sendKeys(thirdQuestion);
	   FourthQuestion.sendKeys(fourthQuestion);
	   JavascriptExecutor jstwo = (JavascriptExecutor) driver;
	   jstwo.executeScript("window.scrollBy(0,-1000)");
	   AnswerTab.click();
	   
	   for(int i=0;i<4;i++) {
		   Answers.click();
	   }
	   FirstAnswer.sendKeys(firstAnswer);
	   SecondAnswer.sendKeys(secondAnswer);
	   ThirdAnswer.sendKeys(thirdAnswer);
	   FourthAnswer.sendKeys(fourthAnswer);
	   JavascriptExecutor jsthree = (JavascriptExecutor) driver;
	     // This  will scroll down the page by  1000 pixel vertical		
	   jsthree.executeScript("window.scrollBy(0,1000)");
	   BtnCreate2.click();
   }
	

}
;