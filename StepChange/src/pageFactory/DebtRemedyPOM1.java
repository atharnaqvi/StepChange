package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DebtRemedyPOM1 {
	WebDriver driver;
	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl02_iDropList_Col0")
	WebElement adviceFor;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl04_iDropList_Col0")
	WebElement partnerAware;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl05_iDropList_Col0")
	WebElement adultShare;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl06_iDropList_Col0")
	WebElement children;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl07_iDropList_Col0")
	WebElement liveInUk;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl08_iDropList_Col0")
	WebElement housingStatus;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl09_iDropList_Col0")
	WebElement tenancyAgreement;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl10_iDropList_Col0")
	WebElement maritalStatus;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl11_iDropList_Col0")
	WebElement howOld;

	@FindBy(xpath = "//label[@for='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl13_iRadList_Col0_0']")
	WebElement gender;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl14_iDropList_Col0")
	WebElement vehicles;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl15_iRadList_Col0_0")
	WebElement hirePurchase;

	@FindBy(xpath = "//table[@id='popupTable']//select[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl16_iDropList_Col0']")
	WebElement hpAgreement;

	// @FindBy(id="cancelLightBoxWhatIsHP")
	@FindBy(id = "closeLightBoxWhatIsHP")
	WebElement nextButton;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl17_iRadList_Col0_0")
	WebElement pets;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions2_ctl02_iDropList_Col0")
	WebElement interests;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions2_ctl03_iDropList_Col0")
	WebElement depressed;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions2_ctl04_iDropList_Col0")
	WebElement anxious;

	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions2_ctl05_iDropList_Col0") 
	  WebElement worrying;
	  
	  @FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions3_ctl02_iDropList_Col0") 
	  WebElement mentalHealth;
	  
	  @FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_navMain_btnRight")
	  WebElement NextWindow;
	  
	  
	 
	 

	// *********************************************************************

	public DebtRemedyPOM1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// *********************************************************************

	public void selectAdviceFor(int indexPoint) {
		Select dropdown = new Select(adviceFor);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectPartnerAware(int indextPoint) {
		Select dropdown = new Select(partnerAware);
		dropdown.selectByIndex(indextPoint);
	}

	public void selectAdultShare(int indexPoint) {
		Select dropdown = new Select(adultShare);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectChildren(int indexPoint) {
		Select dropdown = new Select(children);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectLiveInUk(int indexPoint) {
		Select dropdown = new Select(liveInUk);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectHousingStatus(int indexPoint) {
		Select dropdown = new Select(housingStatus);
		dropdown.selectByIndex(2);
	}

	public void selectTenancyAgreement(int indexPoint) {
		Select dropdown = new Select(tenancyAgreement);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectMaritalStatus(int indexPoint) {
		Select dropdown = new Select(maritalStatus);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectHowOld(int indexPoint) {
		Select dropdown = new Select(howOld);
		dropdown.selectByIndex(indexPoint);
	}

	public void clickGender() {
		gender.click();
	}

	public void selectVehicles(int indexPoint) {
		Select dropdown = new Select(vehicles);
		dropdown.selectByIndex(indexPoint);
	}

	public void clickHirePurchase() {
		hirePurchase.click();
	}

	public void selectHPAgreement(int indexPoint)  {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(hpAgreement));
		Select dropdown = new Select(hpAgreement);
		dropdown.selectByIndex(indexPoint);
		}catch (Exception e) {
			System.out.println("Element not available");
		}
		nextButton.click();
	}


	public void selectPets()  {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(pets));
		
	} catch(Exception e) {
		System.out.println("Element not available");
	}
	pets.click();
	}

	public void selectInterests(int indexPoint) {
		Select dropdown = new Select(interests);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectDepressed(int indexPoint) {
		Select dropdown = new Select(depressed);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectAnxious(int indexPoint) {
		Select dropdown = new Select(anxious);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectWorrying(int indexPoint) {
		Select dropdown = new Select(worrying);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectMentalHealth(int indexPoint) {
		Select dropdown = new Select(mentalHealth);
		dropdown.selectByIndex(indexPoint);
	}

	public void clickNextWindow() {
		NextWindow.click();
	}


}
