Feature: This feature file is login to Application
Scenario: The is is login scenario
  Given user is on login page
  When the user enters the valid user name and password
  And clicks the login button 
  Then the user should be navigate to the home page