package Admin_PageObject_SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_FileContent {
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
		
	@FindBy(xpath="/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div/div/span[2]/div/div/div/div[1]/ul/li[1]") 
	WebElement Selecth5p;
		
	@FindBy(id="Title") 
	WebElement title;
		
	@FindBy(id="Description") 
	WebElement Description;
		

		
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
		
	@FindBy(id="HttpPostedFileBase")
	WebElement UploadFileContent;
		
	@FindBy(id="btnCreate") 
	WebElement btnCreate ;
		public void createFileContent (WebDriver driver,String Title,String description,String Startdate,String frometime,String enddate,String totime,String Upload) throws InterruptedException {
			Wait<WebDriver> wait = new WebDriverWait(driver, 30000);
		    wait.until(el -> SelectAllLesson);
			SelectAllLesson.click();
			wait.until(el -> AllLesson);
			AllLesson.click();
			selectlesson.click();
			selectpresentedlesson.click();
			part.click();
			section.click();
			//Thread.sleep(1000);
			wait.until(el -> Selecth5p);
			Selecth5p.click();
			title.sendKeys(Title);
			Description.sendKeys(description);
			startDate.sendKeys(Startdate);
			FromTime.click();
			//Thread.sleep(2000);
			wait.until(el -> FromTime);
			FromTime.sendKeys(frometime);
			SelectFromTime.click();
			EndDate.sendKeys(enddate);
			ToTime.click();
			wait.until(el -> ToTime);
			//Thread.sleep(2000);
			ToTime.sendKeys(totime);
			wait.until(el -> SelectToTime);
			//Thread.sleep(2000);
			SelectToTime.click();
			driver.switchTo().frame(0);
		    driver.findElement(By.cssSelector("html")).click();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			  {
			  WebElement element = driver.findElement(By.cssSelector(".cke_editable"));
			   js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'متن مربوط به فایل'}", element);
			 }
			  driver.switchTo().defaultContent();
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;	
		    js1.executeScript("window.scrollBy(0,1300)");
		    UploadFileContent.sendKeys(Upload);
		    //wait.until(el -> btnCreate);
			Thread.sleep(10000);  
			btnCreate.click();
			
		}

		

	}



