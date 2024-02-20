package Admin_PageObject_SmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Question {
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
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[2]/div/div/div[1]/div/div/div/div/div[2]/ul/li[6]/a") 
	WebElement Question;
	
	
	@FindBy(xpath="//*[@id=\"page_content_inner\"]/div[3]/div/div/div/div/a[3]") 
	WebElement addquestionoflesson;
	
	
   @FindBy(css="[name='termDropDownList_input']") 
   WebElement term;
   
   @FindBy(css="[name='termDropDownList_input']") 
   WebElement Searchterm;
   
   @FindBy(xpath="/html/body/div[7]/div/div[2]/ul/li[1]") 
   WebElement chooseterm;
 
   @FindBy(css="[name='presentedLessonDropDownList_input']") 
   WebElement lesson;
 
   @FindBy(xpath="/html/body/div[8]/div/div[2]/ul/li") 
   WebElement chooseLesson;
   
   @FindBy(css="[name='questionStructureDropDownList_input']") 
   WebElement LessonGroup;
   
   @FindBy(xpath="/html/body/div[9]/div/div[2]/ul/li") 
   WebElement chooseGruop;
   
   @FindBy(id="snippet_new_save") 
   WebElement button;
	public void addquestion (WebDriver driver,String searchterm,String lessonid,String test) throws InterruptedException {
		Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
	    wait.until(el -> SelectAllLesson);
		SelectAllLesson.click();
		wait.until(el -> AllLesson);
		AllLesson.click();
		selectlesson.click();
		selectpresentedlesson.click();
		wait.until(el -> AddActivity);
		AddActivity.click();
		Thread.sleep(1000);
		Question.click();
		//wait.until(el -> addquestionoflesson);
		Thread.sleep(1000);
		addquestionoflesson.click();
		Thread.sleep(1000);
		term.click();
		//Searchterm.sendKeys(searchterm);
		Thread.sleep(1000);
		chooseterm.click();
		//wait.until(el -> lesson);
		Thread.sleep(1000);
		lesson.click();
		//lesson.sendKeys(lessonid);
		Thread.sleep(1000);
    	chooseLesson.click();
	    LessonGroup.click();
    	LessonGroup.sendKeys(test);
		chooseGruop.click();
		button.click();

		
	}

	

}
