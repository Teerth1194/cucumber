Feature: freeCRM Login scenario 

#Scenario: Login scenario 
#without example keyword
#Given user is on login page
#When title of login page is free crm 
#Then user enters "freecrm990@yopmail.com" and "1234@Abcd"
#And user clicks on login button
#And user is on home page

#with example keyword
Scenario Outline: Login scenario with example keyword
Given user is on login page
When title of login page is free crm 
Then user enters "<username>" 
Then user types "<password>"
And user clicks on login button
And user is on home page

Examples: 
				|username								|password	|
				|freecrm990@yopmail.com	|1234@Abcd|
				|naveenk								|test@123|

				


