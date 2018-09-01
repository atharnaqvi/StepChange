package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.DebtRemedyPOM1;
import pageFactory.DebtRemedyPOM2;
import pageFactory.DebtsCheckListPOM;
import pageFactory.HomePagePOM;

public class DebtHelpSteps {
	
	public static WebDriver driver; 
	public String baseURL;
	
	HomePagePOM debtHelp;
	DebtsCheckListPOM debtCheck;
	DebtRemedyPOM1 dBPOM1;
	DebtRemedyPOM2 dBPOM2;
	
	
	@Given("^User is on the home page https://www\\.stepchange\\.org/$")
	public void user_is_on_the_home_page_https_www_stepchange_org() {
		//driver = new FirefoxDriver();
		if(driver == null) {
			driver= new FirefoxDriver();
		}
		baseURL = "https://www.stepchange.org/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
		debtHelp = new HomePagePOM(driver);
		debtCheck = new DebtsCheckListPOM(driver);
		dBPOM1 = new DebtRemedyPOM1(driver);
		dBPOM2 = new DebtRemedyPOM2(driver);

	}

	@When("^I Click - How we help -  menu button$")
	public void i_Click_How_we_help_menu_button() {
		debtHelp.clickCookieAccept();
		
		debtHelp.clickDebtAdvice();
	}

	@When("^I Click on - Get online advice now -  button in the orange box$")
	public void i_Click_on_Get_online_advice_now_button_in_the_orange_box() {
		debtHelp.clickHelpNow();
		
	}

	@When("^I	Click on the - Start Now -  red button within the purple text box$")
	public void i_Click_on_the_Start_Now_red_button_within_the_purple_text_box() {
		debtHelp.startNow();
	}

	@When("^I select yes for - Do you live in the UK\\? - option$")
	public void select_yes_for_Do_you_live_in_the_UK_option() {
		debtCheck.clickUKResidency();
	}

	@When("^I select yes for -  Did you take out all your debts in the UK\\?  - option$")
	public void i_select_yes_for_Did_you_take_out_all_your_debts_in_the_UK_option() {
		debtCheck.clickDebtsCountry();
		
	}

	@When("^I select yes for -  Do you think you have a problem with debt\\?  - option$")
	public void i_select_yes_for_Do_you_think_you_have_a_problem_with_debt_option() {
		debtCheck.clickDebtProblem();
	}

	@When("^I select yes for -  Are you concerned that your finances are out of control\\?  - option$")
	public void i_select_yes_for_Are_you_concerned_that_your_finances_are_out_of_control_option() {
		debtCheck.clickOutOfControl();
	}

	@When("^I select yes for - Do you rely on using credit to cover living costs\\?   - option$")
	public void i_select_yes_for_Do_you_rely_on_using_credit_to_cover_living_costs_option() {
		debtCheck.clickLivingCost();
	}

	@When("^I select yes for - Is the amount that you owe increasing\\?   - option$")
	public void i_select_yes_for_Is_the_amount_that_you_owe_increasing_option() {
		debtCheck.clickAmountIncreasing();
	}

	@When("^I select no  for - A debt collection agency\\?   - option$")
	public void i_select_no_for_A_debt_collection_agency_option() {
		debtCheck.clickDebtCollectionAgency();
	}

	@When("^I select no  for -  The county court / sheriff court\\?  - option$")
	public void i_select_no_for_The_county_court_sheriff_court_option() {
		debtCheck.clickCountyCourt();
	}

	@When("^I select no  for - A bailiff\\?   - option$")
	public void i_select_no_for_A_bailiff_option() {
		debtCheck.clickaBailiff();
	}

	@When("^I select no  for - Are you or your partner self employed\\?   - option$")
	public void i_select_no_for_Are_you_or_your_partner_self_employed_option() {
		debtCheck.clickSelfEmployed();
	}

	@When("^I click - submit - button$")
	public void i_click_submit_button() {
		debtCheck.clickSubmitButton();
	}

	@Then("^I should be assigned a unique personal web number with - Next - button to proceed$")
	public void i_should_be_assigned_a_unique_personal_web_number_with_Next_button_to_proceed() {
		debtCheck.clickWebNumberNext();
	}

	@When("^I select -    Me  - for the question -  Who do you require debt advice for\\?  - from the dropdown menu$")
	public void i_select_Me_for_the_question_Who_do_you_require_debt_advice_for_from_the_dropdown_menu() {
		dBPOM1.selectAdviceFor(1);
	}

	@When("^I select -  Yes  - for the question - Is your partner aware of your debts\\?   - from the dropdown menu$")
	public void i_select_Yes_for_the_question_Is_your_partner_aware_of_your_debts_from_the_dropdown_menu() {
		dBPOM1.selectPartnerAware(1);
	}

	@When("^I select -  (\\d+)  - for the question -  Besides you, how many adults share your home\\?  - from the dropdown menu$")
	public void i_select_for_the_question_Besides_you_how_many_adults_share_your_home_from_the_dropdown_menu(int arg1) {
		dBPOM1.selectAdultShare(3);
	}

	@When("^I select -  (\\d+)  - for the question -  How many children aged under (\\d+) live in your home\\?  - from the dropdown menu$")
	public void i_select_for_the_question_How_many_children_aged_under_live_in_your_home_from_the_dropdown_menu(int arg1, int arg2) {
		dBPOM1.selectChildren(3);
	}

	@When("^I select -  England/Wales   - for the question -  	Where in the United Kingdom do you live\\?  - from the dropdown menu$")
	public void i_select_England_Wales_for_the_question_Where_in_the_United_Kingdom_do_you_live_from_the_dropdown_menu() {
		dBPOM1.selectLiveInUk(1);
	}

	@When("^I select -  Rent   - for the question -  What is your housing status\\?  - from the dropdown menu$")
	public void i_select_Rent_for_the_question_What_is_your_housing_status_from_the_dropdown_menu() {
		dBPOM1.selectHousingStatus(2);
	}

	@When("^I select -  Private Landlord   - for the question - 	If you're renting, what type of tenancy agreement do you have\\?   - from the dropdown menu$")
	public void i_select_Private_Landlord_for_the_question_If_you_re_renting_what_type_of_tenancy_agreement_do_you_have_from_the_dropdown_menu() {
		dBPOM1.selectTenancyAgreement(3);
	}

	@When("^I select -  Married    - for the question -  	What is your marital status\\?  - from the dropdown menu$")
	public void i_select_Married_for_the_question_What_is_your_marital_status_from_the_dropdown_menu() {
		dBPOM1.selectMaritalStatus(5);
	}

	@When("^I select -  (\\d+)-(\\d+)  - for the question -  	How old are you\\?  - from the dropdown menu$")
	public void i_select_for_the_question_How_old_are_you_from_the_dropdown_menu(int arg1, int arg2) {
		dBPOM1.selectHowOld(3);
	}

	@When("^I select -  Male  - for the question - Are you male or female\\?   - from the dropdown menu$")
	public void i_select_Male_for_the_question_Are_you_male_or_female_from_the_dropdown_menu() {
		dBPOM1.clickGender();
	}

	@When("^I select -  (\\d+) - for the question -  How many vehicles do you pay running costs and/or parking for\\?  - from the dropdown menu$")
	public void i_select_for_the_question_How_many_vehicles_do_you_pay_running_costs_and_or_parking_for_from_the_dropdown_menu(int arg1) {
		dBPOM1.selectVehicles(2);
	}

	@When("^I select -  Yes  - for the question - 	Do you have a hire purchase -HP-  agreement or a logbook loan\\?   - from the radio button$")
	public void i_select_Yes_for_the_question_Do_you_have_a_hire_purchase_HP_agreement_or_a_logbook_loan_from_the_radio_button() {
		dBPOM1.clickHirePurchase();
	}

	@When("^I select -  (\\d+)  - for the question -  How many hire purchase agreements or logbook loans do   - from the dropdown menu$")
	public void i_select_for_the_question_How_many_hire_purchase_agreements_or_logbook_loans_do_from_the_dropdown_menu(int arg1) {
		dBPOM1.selectHPAgreement(3);
	}

	@When("^I click  -  Next - button to continue on the main form$")
	public void i_click_Next_button_to_continue_on_the_main_form() {
		dBPOM1.selectHPAgreement(3);
	}

	@When("^I select -  No    - for the question - Do you have any pets\\?   - from the radio button$")
	public void i_select_No_for_the_question_Do_you_have_any_pets_from_the_radio_button()  {
		dBPOM1.selectPets();
	}

	@When("^I select -  Not at all   - option for the question -  	Little interest or pleasure in doing things\\?  - from the dropdown menu$")
	public void i_select_Not_at_all_option_for_the_question_Little_interest_or_pleasure_in_doing_things_from_the_dropdown_menu() {
		dBPOM1.selectInterests(1);
	}

	@When("^I select -  Not at all   - for the question -  	Feeling down, depressed or hopeless\\?  - from the dropdown menu$")
	public void i_select_Not_at_all_for_the_question_Feeling_down_depressed_or_hopeless_from_the_dropdown_menu() {
		dBPOM1.selectDepressed(1);
	}

	@When("^I select -  Not at all   - for the question -  	Feeling nervous, anxious or on edge\\?  - from the dropdown menu$")
	public void i_select_Not_at_all_for_the_question_Feeling_nervous_anxious_or_on_edge_from_the_dropdown_menu() {
		dBPOM1.selectAnxious(1);
	}

	@When("^I select -  Not at all   - for the question -  	Not being able to stop or control worrying\\?  - from the dropdown menu$")
	public void i_select_Not_at_all_for_the_question_Not_being_able_to_stop_or_control_worrying_from_the_dropdown_menu() {
		dBPOM1.selectWorrying(2);
	}

	@When("^I select -  No   - for the question - Do you have a condition such as a long-term illness, mental health etc   - from the dropdown menu$")
	public void i_select_No_for_the_question_Do_you_have_a_condition_such_as_a_long_term_illness_mental_health_etc_from_the_dropdown_menu() {
		dBPOM1.selectMentalHealth(0);
	}
	
	
	

	@When("^I click on -Next - button to proceed$")
	public void i_click_on_Next_button_to_proceed() {
		dBPOM1.clickNextWindow();		
	}

	@When("^I enter - (\\d+)    - amount for question -Your take home pay	     -$")
	public void i_enter_amount_for_question_Your_take_home_pay(int arg1) {
		dBPOM2.enterTakeHomePay("4000");
	}

	@When("^I select - Monthly - from How often\\? tab$")
	public void i_select_Monthly_from_How_often_tab() {
		dBPOM2.selectHowOften(3);
	}

	@When("^I enter - (\\d+)    - amount for question - 	Child Benefit    -$")
	public void i_enter_amount_for_question_Child_Benefit(int arg1) {
		dBPOM2.enterChildBenefit("500");
	}

	@When("^I select - (\\d+)-Weekly - from How often\\? tab$")
	public void i_select_Weekly_from_How_often_tab(int arg1) {
		dBPOM2.selectChildBenefitOften(3);
	}

	@When("^I enter - (\\d+)    - amount for question -  	Child Tax Credit   -$")
	public void i_enter_amount_for_question_Child_Tax_Credit(int arg1) {
		dBPOM2.enterChildTaxCredit("500");
		dBPOM2.selectChildTaxCredit(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -   DLA/PIP for your child  -$")
	public void i_enter_amount_for_question_DLA_PIP_for_your_child(int arg1) {
		dBPOM2.enterDLAPIPChild("500");
		dBPOM2.selectDLAPIPChild(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -   Child support paid to you  -$")
	public void i_enter_amount_for_question_Child_support_paid_to_you(int arg1) {
		dBPOM2.enterChildSupport("500");
		dBPOM2.selectChildSupport(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -  	Income Support / Universal Credit   -$")
	public void i_enter_amount_for_question_Income_Support_Universal_Credit(int arg1) {
		dBPOM2.enterIncomeSupport("500");
		dBPOM2.selectIncomeSupport(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -   Jobseekers Allowance    -$")
	public void i_enter_amount_for_question_Jobseekers_Allowance(int arg1) {
		dBPOM2.enterJobSeekersAllowance("500");
		dBPOM2.selectJobSeekersAllowance(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -   Incapacity Benefit/ESA   -$")
	public void i_enter_amount_for_question_Incapacity_Benefit_ESA(int arg1) {
		dBPOM2.enterIncapacityBenefit("500");
		dBPOM2.selectIncapacityBenefit(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -  	Working Tax Credit   -$")
	public void i_enter_amount_for_question_Working_Tax_Credit(int arg1) {
		dBPOM2.enterWorkignTaxCredit("500");
		dBPOM2.selectWorkignTaxCredit(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -   DLA/PIP paid to you   -$")
	public void i_enter_amount_for_question_DLA_PIP_paid_to_you(int arg1) {
		dBPOM2.enterDLAPaidtoYou("500");
		dBPOM2.selectDLAPaidtoYou(3);
	}

	@When("^I enter - (\\d+)    - amount for question -  	Rent/board received   -$")
	public void i_enter_amount_for_question_Rent_board_received(int arg1) {
		dBPOM2.enterRentReceived("500");
		dBPOM2.selectRentReceived(3);
	}

	@When("^I enter -  (\\d+)   - amount for question -  	Pension paid to you   -$")
	public void i_enter_amount_for_question_Pension_paid_to_you(int arg1) {
		dBPOM2.enterPensionPaid("500");
		dBPOM2.selectPensionPaid(3);
	}

	@When("^I enter - (\\d+)    - amount for question -   Any other income received   -$")
	public void i_enter_amount_for_question_Any_other_income_received(int arg1) {
		dBPOM2.enterOtherIncome("500");
		dBPOM2.selectOtherIncome(3);
	}

	@When("^Click -  Save and Exit  -  button to exit the form$")
	public void click_Save_and_Exit_button_to_exit_the_form() {
		dBPOM2.clickSaveAndExit();
	}

	@Then("^I should exit the form with an option to print the information\\.$")
	public void i_should_exit_the_form_with_an_option_to_print_the_information() {
		
	}



}
