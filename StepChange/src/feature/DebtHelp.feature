@FunctionalTest
Feature: Debt Help Assessment Form
  Description To test the Debt Remedy form

  @RegressionTest
  Scenario: Select get debt help now button
    Given User is on the home page https://www.stepchange.org/
    When I Click - How we help -  menu button
    And I Click on - Get online advice now -  button in the orange box
    And I	Click on the - Start Now -  red button within the purple text box
    And I select yes for - Do you live in the UK? - option
    And I select yes for -  Did you take out all your debts in the UK?  - option
    And I select yes for -  Do you think you have a problem with debt?  - option
    And I select yes for -  Are you concerned that your finances are out of control?  - option
    And I select yes for - Do you rely on using credit to cover living costs?   - option
    And I select yes for - Is the amount that you owe increasing?   - option
    And I select no  for - A debt collection agency?   - option
    And I select no  for -  The county court / sheriff court?  - option
    And I select no  for - A bailiff?   - option
    And I select no  for - Are you or your partner self employed?   - option
    And I click - submit - button
    And I should be assigned a unique personal web number with - Next - button to proceed
    And I select -    Me  - for the question -  Who do you require debt advice for?  - from the dropdown menu
    And I select -  Yes  - for the question - Is your partner aware of your debts?   - from the dropdown menu
    And I select -  2  - for the question -  Besides you, how many adults share your home?  - from the dropdown menu
    And I select -  2  - for the question -  How many children aged under 18 live in your home?  - from the dropdown menu
    And I select -  England/Wales   - for the question -  	Where in the United Kingdom do you live?  - from the dropdown menu
    And I select -  Rent   - for the question -  What is your housing status?  - from the dropdown menu
    And I select -  Private Landlord   - for the question - 	If you're renting, what type of tenancy agreement do you have?   - from the dropdown menu
    And I select -  Married    - for the question -  	What is your marital status?  - from the dropdown menu
    And I select -  40-59  - for the question -  	How old are you?  - from the dropdown menu
    And I select -  Male  - for the question - Are you male or female?   - from the dropdown menu
    And I select -  1 - for the question -  How many vehicles do you pay running costs and/or parking for?  - from the dropdown menu
    And I select -  Yes  - for the question - 	Do you have a hire purchase -HP-  agreement or a logbook loan?   - from the radio button
    And I select -  2  - for the question -  How many hire purchase agreements or logbook loans do   - from the dropdown menu
    And I click  -  Next - button to continue on the main form
    And I select -  No    - for the question - Do you have any pets?   - from the radio button
    And I select -  Not at all   - option for the question -  	Little interest or pleasure in doing things?  - from the dropdown menu
    And I select -  Not at all   - for the question -  	Feeling down, depressed or hopeless?  - from the dropdown menu
    And I select -  Not at all   - for the question -  	Feeling nervous, anxious or on edge?  - from the dropdown menu
    And I select -  Not at all   - for the question -  	Not being able to stop or control worrying?  - from the dropdown menu
    And I select -  No   - for the question - Do you have a condition such as a long-term illness, mental health etc   - from the dropdown menu
    And I click on -Next - button to proceed
    And I enter - 2000    - amount for question -Your take home pay	     -
    And I select - Monthly - from How often? tab
    And I enter - 100    - amount for question - 	Child Benefit    -
    And I select - 4-Weekly - from How often? tab
    And I enter - 200    - amount for question -  	Child Tax Credit   -
    And I select - 4-Weekly - from How often? tab
    And I enter -  300   - amount for question -   DLA/PIP for your child  -
    And I select - 4-Weekly - from How often? tab
    And I enter -  400   - amount for question -   Child support paid to you  -
    And I select - 4-Weekly - from How often? tab
    And I enter -  500   - amount for question -  	Income Support / Universal Credit   -
    And I select - 4-Weekly - from How often? tab
    And I enter -  600   - amount for question -   Jobseekers Allowance    -
    And I select - 4-Weekly - from How often? tab
    And I enter -  700   - amount for question -   Incapacity Benefit/ESA   -
    And I select - 4-Weekly - from How often? tab
    And I enter -  600   - amount for question -  	Working Tax Credit   -
    And I select - 4-Weekly - from How often? tab
    And I enter -  500   - amount for question -   DLA/PIP paid to you   -
    And I select - 4-Weekly - from How often? tab
    And I enter - 400    - amount for question -  	Rent/board received   -
    And I select - 4-Weekly - from How often? tab
    And I enter -  300   - amount for question -  	Pension paid to you   -
    And I select - 4-Weekly - from How often? tab
    And I enter - 200    - amount for question -   Any other income received   -
    And I select - 4-Weekly - from How often? tab
    And Click -  Save and Exit  -  button to exit the form
    Then I should exit the form with an option to print the information.
