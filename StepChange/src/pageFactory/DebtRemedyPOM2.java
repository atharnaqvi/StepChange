package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DebtRemedyPOM2 {
	WebDriver driver;
	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl02_iTextBox_Col0")
	WebElement takeHomePay;

	@FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl02_iDropList_Col1")
	WebElement takeHomePayOften;

	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl12_iTextBox_Col0")
	WebElement childBenefit;

	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl12_iDropList_Col1")
	WebElement childBenefitOften;

	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl14_iTextBox_Col0")
	WebElement childTaxCredit;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl14_iDropList_Col1")
	WebElement childTaxCreditOften;
	 
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl15_iTextBox_Col0")
	WebElement dlaPIPChild;

	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl15_iDropList_Col1")
	WebElement dlaPIPChildOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl16_iTextBox_Col0")
	WebElement childSupport;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl16_iDropList_Col1")
	WebElement childSupportOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl07_iTextBox_Col0")
	WebElement incomeSupport;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl07_iDropList_Col1")
	WebElement incomeSupportOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl08_iTextBox_Col0")
	WebElement jobSeekersAllowance;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl08_iDropList_Col1")
	WebElement jobSeekersAllowanceOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl09_iTextBox_Col0")
	WebElement incapacityBenefit;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl09_iDropList_Col1")
	WebElement incapacityBenefitOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl10_iTextBox_Col0")
	WebElement workignTaxCredit;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl10_iDropList_Col1")
	WebElement workignTaxCreditOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl11_iTextBox_Col0")
	WebElement dlaPaidtoYou;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl11_iDropList_Col1")
	WebElement dlaPaidtoYouOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl04_iTextBox_Col0")
	WebElement rentReceived;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl04_iDropList_Col1")
	WebElement rentReceivedOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl05_iTextBox_Col0")
	WebElement pensionPaid;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl05_iDropList_Col1")
	WebElement pensionPaidOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl18_iTextBox_Col0")
	WebElement otherIncome;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_dgQuestions_ctl18_iDropList_Col1")
	WebElement otherIncomeOften;
	
	@FindBy(id="ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_navMain_btnMiddle")
	WebElement saveAndExit;
	

		
	// ************************************************

	public DebtRemedyPOM2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ************************************************

	
	
//****
	public void enterTakeHomePay(String amount) {
		takeHomePay.sendKeys(amount);
	}

	public void selectHowOften(int indexPoint) {
		Select dropdown = new Select(takeHomePayOften);
		dropdown.selectByIndex(indexPoint);
	}
//****	
	
	//****
		public void enterChildBenefit (String amount) {
			childBenefit.sendKeys(amount);
		}

		public void selectChildBenefitOften (int indexPoint) {
			Select dropdown = new Select( childBenefitOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	

		//****
		public void enterChildTaxCredit (String amount) {
			childTaxCredit.sendKeys(amount);
		}

		public void selectChildTaxCredit (int indexPoint) {
			Select dropdown = new Select( childTaxCreditOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		//****
		public void enterDLAPIPChild (String amount) {
			dlaPIPChild.sendKeys(amount);
		}

		public void selectDLAPIPChild (int indexPoint) {
			Select dropdown = new Select( dlaPIPChildOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		//****
		public void enterChildSupport (String amount) {
			childSupport.sendKeys(amount);
		}

		public void selectChildSupport (int indexPoint) {
			Select dropdown = new Select( childSupportOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		
		//****
		public void enterIncomeSupport (String amount) {
			incomeSupport.sendKeys(amount);
		}

		public void selectIncomeSupport (int indexPoint) {
			Select dropdown = new Select( incomeSupportOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		//****
		public void enterJobSeekersAllowance (String amount) {
			jobSeekersAllowance.sendKeys(amount);
		}

		public void selectJobSeekersAllowance (int indexPoint) {
			Select dropdown = new Select( jobSeekersAllowanceOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		
		//****
		public void enterIncapacityBenefit (String amount) {
			incapacityBenefit.sendKeys(amount);
		}

		public void selectIncapacityBenefit (int indexPoint) {
			Select dropdown = new Select( incapacityBenefitOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		
		//****
		public void enterWorkignTaxCredit (String amount) {
			workignTaxCredit.sendKeys(amount);
		}

		public void selectWorkignTaxCredit (int indexPoint) {
			Select dropdown = new Select( workignTaxCreditOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		
		//****
		public void enterDLAPaidtoYou (String amount) {
			dlaPaidtoYou.sendKeys(amount);
		}

		public void selectDLAPaidtoYou (int indexPoint) {
			Select dropdown = new Select( dlaPaidtoYouOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		
		//****
		public void enterRentReceived (String amount) {
			rentReceived.sendKeys(amount);
		}

		public void selectRentReceived (int indexPoint) {
			Select dropdown = new Select( rentReceivedOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		
		//****
		public void enterPensionPaid (String amount) {
			pensionPaid.sendKeys(amount);
		}

		public void selectPensionPaid (int indexPoint) {
			Select dropdown = new Select( pensionPaidOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		
		//****
		public void enterOtherIncome (String amount) {
			otherIncome.sendKeys(amount);
		}

		public void selectOtherIncome (int indexPoint) {
			Select dropdown = new Select( otherIncomeOften);
			dropdown.selectByIndex(indexPoint);
		}
//****	
		public void clickSaveAndExit () {
			saveAndExit.click();
		}
		


}
