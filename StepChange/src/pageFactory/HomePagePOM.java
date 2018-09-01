package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePOM {
	
	WebDriver driver;
	
	@FindBy(id="CybotCookiebotDialogBodyButtonAccept")
	WebElement cookieAccept;
	
	@FindBy(xpath="//div[@class='section c-site-nav']//div[@class='content-container']//a[@id='topNav-Howwehelp']")
	WebElement debtAdvice;
	
	@FindBy(xpath="//a[@class='g-btn g-card__content__link']")
	WebElement getDebtHelpNow;
	
	@FindBy(xpath="//div[@id='dnn_ContentPane']/div[1]/div/div[@class='DNNModuleContent ModDNNHTMLC']/div//a[@href='https://debtremedy.stepchange.org/quickassessment.aspx']")
	WebElement startNow;
	
//*********************************************************	
	public HomePagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//*********************************************************
	
	public void clickCookieAccept() {
		cookieAccept.click();
	}
	
	public void clickDebtAdvice() {
		debtAdvice.click();
	}
	
	public void clickHelpNow() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(getDebtHelpNow));
		
		}catch(Exception e) {
			System.out.println("Element not clickable");
		}
		
		getDebtHelpNow.click();
		
	}
	
	public void startNow() {
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(startNow));
						
		}catch (Exception e) {
			System.out.println("Element not found");
		}
		startNow.click();
	}

}
