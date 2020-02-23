Feature: Login Test

	@tag1
  Scenario: Successful login test
    Given User launches the browser
    And Opens the URL
    When I Enters user name
    And Enters password
    Then Login should be success

	@tag2
  Scenario: Unsuccessful login test
    Given User launches the browser
    And Opens the URL
    When I Enters user name
    And Enters password
    Then Login should Not be success
   
   @tag3 
  Scenario: Report Generation demo
      Given User launches the browser
      And Opens the URL
