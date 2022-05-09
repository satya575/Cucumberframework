@dryRun
Feature: Navigate to different pages

  Scenario: Verifying user navigated to live fleet monitoring page
    Given I am at the login page
    When I login to the application
    And I am at the home page
    And I navigate to live fleet monitoring
    Then I assert am on live fleet monitoring page

  Scenario: Verifying user navigated to voyage analysis page
    Given I am at the login page
    When I login to the application
    And I am at the home page
    And I navigate to voyage analysis
    Then I assert am on voyage analysis page