

Feature: Login feature
  I want to use this template for Login feature file
  
  Background:
			Given Intialize the setup and lunch the browser
			When User navigate to url
			Then User present on Login page

#@tearDown
  Scenario: Login to application with valid credentials
    Given User enters username and password
    When User clicks on login button
    Then User should get get land on Dashboard


#@tearDown
  Scenario Outline: Login to application with different credentials credentials
    Given User enters credentials <username> and <password>
    When User clicks on login button
    Then User should get get land on Dashboard
    
   Examples:
	|	username	|	password		|
	|	student 	|	Password123	|