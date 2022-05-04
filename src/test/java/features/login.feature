Feature: Verification of login functionality for OpenMRS Application

@regressionTest
Scenario: Validate login success (positive case)
    Given Open the browser and launch the application
 #   Then Enter the Username
  #  And Enter the Password
    Then Enter Username as "Admin"
    And Enter Password as "Admin123"
    And Select the Isolation ward
    And Select login
    Then Validate login is success
    
 @EndToEnd
Scenario: Validate validation message for failure cases (negative case)
 		Given Open the browser and launch the application
    Then Enter the Username
    And Enter Invalid Password
    And Select the Isolation ward
    And Select login
    Then Verify error message is getting displayed

@smokeTest
Scenario Outline: Validate login success (positive case)
    Given Open the browser and launch the application
    Then Enter "<userName>" in username
    And Enter "<passCode>" in password
    And Select the "<wardType>"
  
  Examples:
  |userName|passCode|wardType|
  |Admin|Admin123|Isolation Ward|
  |Admin456|Admin000|Registration Desk|
  