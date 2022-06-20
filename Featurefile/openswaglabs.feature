Feature: Login feature to SwagLab Application
#with Examples Keyword
Scenario Outline:SwagLab Application Login Scenario
  Given user is on login page
  When the user enters the valid "<Username>" and "<Password>"
  And clicks the login button 
  Then the user should be navigate to the home page
  But user should not navigate to the payment page without selecting Product
Examples:
	| Username       | Password     |
	| standard_user  | secret_sauce |
	| performance_glitch_user | secret_sauce |
		


#with Examples Keyword
#Scenario Outline: SwagLab Application Login Scenario
#
#Given user is already on Login Page
#When the user enters the valid "<Username>" and "<Password>"
#And user clicks on login button
#Then the user should be navigate to the home page
 #But user should not navigate to the payment page without selecting Product
#
#
#Examples:
#	| username       | password     |
#	| standard_user  | secret_sauce |
#	| locked_out_user| secret_sauce | 	
#		