Feature: Free CRM create contact

Scenario Outline: Create contact 
Given user is on login page
When title of login page is free crm 
Then user enters "<username>" 
Then user types "<password>"
Then user clicks on login button
Then user is on home page
Then user clicked on contact button.
Then user press create button
Then user add "<firstname>" and "<lastname>"
Then user click save button

Examples: 
	|username|password|firstname|lastname|
	|freecrm990@yopmail.com|1234@Abcd|Test|1|
