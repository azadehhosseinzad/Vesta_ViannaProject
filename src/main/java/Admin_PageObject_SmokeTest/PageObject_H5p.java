package Admin_PageObject_SmokeTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_H5p {
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

	@FindBy(css=" .uk-icon-file-video-o")
	WebElement Selecth5p;
		
	@FindBy(id="title") 
	WebElement title;
		
	@FindBy(id="Description") 
	WebElement Description;
		
	@FindBy(id="link") 
	WebElement link;
		
	@FindBy(id="startDate") 
	WebElement startDate;
		
	@FindBy(id="FromTime") 
	WebElement FromTime;
		
	@FindBy(css="[data-value='10:00'] > .needsclick") 
	WebElement SelectFromTime;
		
	@FindBy(id="EndDate") 
	WebElement EndDate;
		
	@FindBy(id="ToTime") 
	WebElement ToTime;
		
	@FindBy(xpath="//div[@class='uk-autocomplete uk-open']//a[.='10:00']") 
	WebElement SelectToTime;
		
	@FindBy(css=".switchery") 
	WebElement IsPublic ;
	
	@FindBy(id="btnCreate") 
	WebElement btnCreate ;
		public void CreateH5p (WebDriver driver,String Title,String description,String Link,String Startdate,String frometime,String enddate,String totime) throws InterruptedException {
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
			Selecth5p.click();
			title.sendKeys(Title);
			Description.sendKeys(description);
			link.sendKeys(Link);
			startDate.sendKeys(Startdate);
			Thread.sleep(1000);
			FromTime.click();
			wait.until(el -> FromTime);
			//Thread.sleep(2000);
			FromTime.sendKeys(frometime);
			Thread.sleep(1000);
			SelectFromTime.click();
			wait.until(el -> EndDate);
			EndDate.sendKeys(enddate);
			Thread.sleep(1000);
			ToTime.click();
			wait.until(el -> ToTime);
			//Thread.sleep(2000);
			ToTime.sendKeys(totime);
			Thread.sleep(1000);
			//Thread.sleep(2000);
			SelectToTime.click();
		   JavascriptExecutor js = (JavascriptExecutor) driver;	
		    js.executeScript("window.scrollBy(0,1300)");
		     IsPublic.click();
		     wait.until(el -> btnCreate);
			//Thread.sleep(1000);  
			btnCreate.click();
			
		}

		

	}



