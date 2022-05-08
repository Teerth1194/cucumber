Feature: freeCRM Login scenario 

#Scenario: Login scenario 
#without example keyword
#Given user is on login page
#When title of login page is free crm 
#Then user enters "freecrm990@yopmail.com" and "1234@Abcd"
#And user clicks on login button
#And user is on home page

#with example keyword
Scenario: Login scenario with example keyword
Given user is on login page
When title of login page is free crm 
Then user enters "<username>" and "<password>"
And user clicks on login button
And user is on home page

Examples: 
				|username|password|
				|naveenk|test@123|
				|freecrm990@yopmail.com|1234@Abcd|


