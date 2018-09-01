package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DebtsCheckListPOM {
	public WebDriver driver;
	
	

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgResidency_ctl02_radYes")
	WebElement ukResidency;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgResidency_ctl03_radYes")
	WebElement debtsCountry;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgDebts_ctl02_radYes")
	WebElement debtProblem;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgDebts_ctl03_radYes")
	WebElement outOfControl;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgDebts_ctl04_radYes")
	WebElement livingCost;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgDebts_ctl05_radYes")
	WebElement amountIncreasing;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgContact_ctl02_radNo")
	WebElement debtCollectionAgency;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgContact_ctl03_radNo")
	WebElement countyCourt;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgContact_ctl04_radNo")
	WebElement aBailiff;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgEmployment_ctl02_radNo")
	WebElement selfEmployed;
	
	@FindBy(xpath="//li[@id='rightNav']/input[@name='ctl00$ctl00$ContentPlaceHolder1$ContentPlaceHolder1$navMain$btnRight']")
	WebElement submitButton;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_navMain_btnRight")
	WebElement webNumberNext;

//***************************************************************	

	public DebtsCheckListPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//***************************************************************	

	
	
	public void clickUKResidency() {
		ukResidency.click();
	}
	
	public void clickDebtsCountry() {
		debtsCountry.click();
		
	}
	public void clickDebtProblem() {
		debtProblem.click();
	}
	public void clickOutOfControl() {
		outOfControl.click();
	}
	public void clickLivingCost() {
		livingCost.click();
	}
	public void clickAmountIncreasing() {
		amountIncreasing.click();
	}
	public void clickDebtCollectionAgency() {
		debtCollectionAgency.click();
	}
	public void clickCountyCourt() {
		countyCourt.click();
	}
	public void clickaBailiff() {
		aBailiff.click();
	}
	public void clickSelfEmployed() {
		selfEmployed.click();
	}
	public void clickSubmitButton() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.elementToBeClickable(submitButton));
			
		}catch (Exception e) {
			System.out.println("Element not found");
		}
		submitButton.click();
	}
	
	public void clickWebNumberNext() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.elementToBeClickable(webNumberNext));
			
		}catch(Exception e) {
			System.out.println("Element not found");
		}
		webNumberNext.click();
		
	}

}
