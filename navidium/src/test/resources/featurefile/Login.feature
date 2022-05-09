@druRun
Feature: To test login and log out functionality
 Scenario: To verify login and logout functionality
   Given I am at the login page
    When I login to the application
    Then I verify the title of the page "Fleet Overview"
    And I am at the home page
  When I click on logout button
  Then I verify the title of the page "Login"





































