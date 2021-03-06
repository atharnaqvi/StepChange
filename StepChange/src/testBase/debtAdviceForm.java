package testBase;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageFactory.DebtRemedyPOM1;
import pageFactory.DebtRemedyPOM2;
import pageFactory.DebtsCheckListPOM;
//Import Page Object Model classes
import pageFactory.HomePagePOM;

class debtAdviceForm {
/*	long startTime;
	long endTime;
	long duration;
	long totalTime;
	long totalDuration;
	double seconds;*/
	
	StopWatch watch = new StopWatch();
	
	WebDriver driver;
	String baseURL;
	HomePagePOM debtHelp;
	DebtsCheckListPOM debtCheck;
	DebtRemedyPOM1 dBPOM1;
	DebtRemedyPOM2 dBPOM2;

	@BeforeEach
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.stepchange.org/";
		
		driver.manage().window().maximize();
		
		
		debtHelp = new HomePagePOM(driver);
		debtCheck = new DebtsCheckListPOM(driver);
		dBPOM1 = new DebtRemedyPOM1(driver);
		dBPOM2 = new DebtRemedyPOM2(driver);
		
		
	}

	@Test
	public void test1() throws Exception {
		//startTime = System.nanoTime();
		watch.start();
		driver.get(baseURL);
		debtHelp.clickCookieAccept();
		
		debtHelp.clickDebtAdvice();
		debtHelp.clickHelpNow();
		debtHelp.startNow();
		
		double seconds = (double)watch.getTime()/1000.0;
		System.out.println("The time for home page to load : " + seconds);
		watch.reset();
		/*endTime = System.nanoTime();
		duration = endTime - startTime;
		seconds = (double)duration/1000000000.0;
		System.out.println("Time taken to excute the first page : " + seconds);*/
		watch.start();
		debtCheck.clickUKResidency();
		debtCheck.clickDebtsCountry();
		debtCheck.clickDebtProblem();
		debtCheck.clickOutOfControl();
		debtCheck.clickLivingCost();
		debtCheck.clickAmountIncreasing();
		debtCheck.clickDebtCollectionAgency();
		debtCheck.clickCountyCourt();
		debtCheck.clickaBailiff();
		debtCheck.clickSelfEmployed();
		debtCheck.clickSubmitButton();
		debtCheck.clickWebNumberNext();
		
		dBPOM1.selectAdviceFor(1);
		dBPOM1.selectPartnerAware(1);
		dBPOM1.selectAdultShare(3);
		dBPOM1.selectChildren(3);
		dBPOM1.selectLiveInUk(1);
		dBPOM1.selectHousingStatus(2);
		dBPOM1.selectTenancyAgreement(3);
		dBPOM1.selectMaritalStatus(5);
		dBPOM1.selectHowOld(3);
		dBPOM1.clickGender();
		dBPOM1.selectVehicles(2);
		dBPOM1.clickHirePurchase();
		
		//popup block
		//dBPOM1.selectHPAgreement(3);
		
		dBPOM1.selectPets();
		dBPOM1.selectInterests(1);
		dBPOM1.selectDepressed(1);
		dBPOM1.selectAnxious(1);
		dBPOM1.selectWorrying(2);
		dBPOM1.selectMentalHealth(0);
		dBPOM1.clickNextWindow();
		
		dBPOM2.enterTakeHomePay("4000");
		dBPOM2.selectHowOften(3);
		
		dBPOM2.enterChildBenefit("500");
		dBPOM2.selectChildBenefitOften(3);
		
		dBPOM2.enterChildTaxCredit("500");
		dBPOM2.selectChildTaxCredit(3);
		
		dBPOM2.enterDLAPIPChild("500");
		dBPOM2.selectDLAPIPChild(3);
		
		dBPOM2.enterChildSupport("500");
		dBPOM2.selectChildSupport(3);
		
		
		dBPOM2.enterIncomeSupport("500");
		dBPOM2.selectIncomeSupport(3);
		
		dBPOM2.enterJobSeekersAllowance("500");
		dBPOM2.selectJobSeekersAllowance(3);
		
		dBPOM2.enterIncapacityBenefit("500");
		dBPOM2.selectIncapacityBenefit(3);
		
		dBPOM2.enterWorkignTaxCredit("500");
		dBPOM2.selectWorkignTaxCredit(3);
		
		dBPOM2.enterDLAPaidtoYou("500");
		dBPOM2.selectDLAPaidtoYou(3);
		
		dBPOM2.enterRentReceived("500");
		dBPOM2.selectRentReceived(3);
		
		dBPOM2.enterPensionPaid("500");
		dBPOM2.selectPensionPaid(3);
		
		dBPOM2.enterOtherIncome("500");
		dBPOM2.selectOtherIncome(3);
		
		Thread.sleep(3000);
		dBPOM2.clickSaveAndExit();
		
		/*totalTime = System.nanoTime();
		totalDuration = totalTime - startTime;
		seconds = (double)totalDuration/1000000000.0;
		System.out.println("Total duration is : " + seconds);*/
		
		double seconds1 = (double)watch.getTime()/1000.0;
		System.out.println("Total time for the whole test is: " + seconds1);
		watch.stop();
	}
	
	
	
	@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}
