@cleaning
Feature: To verify the Voyage Analysis Page

  Background:
    Given I am at the login page
    When I login to the application
#   Then I verify the title of the page "Voyage Analysis"
    And I am at the home page
    Then I am at the Voyage Analysis page

  Scenario:To verify whether the voyage summary tab gets selected by default while navigating to voyage page ID#137
   And click on menu
   And click on Voyage analysis
   Then verify Voyage Summary

#  Scenario:To verify the search vessel button in voyage analysis page  is clickable and opens a drop down while clicking on it ID#138
#    And voyage analysis page is clickable
#    Then click on search vessel dropdown
#
#Scenario:To verify currents UTC tab displays correct date and time ID#140
#     And click on menu button
#     And click on voyage analysis
#     And mouse over on utc tab
#     Then verify utc tab should display correct date and time

  Scenario:To verify a click on the vessel events info button opens vessel events info card ID#141
    And click on menu button
    And click on voyage analysis menu
    And click on vessel events info
    Then verify vessel events

  Scenario:To verify a click on the theme change button changes the theme from black to white or vice versa  ID#142
   And click on menu button
   And click on voyage analysis menu
   Then  click on theme change button

  Scenario: To verify a click on the log out button logs out the user from the application ID#143
    And click on menu button
    And click on voyage analysis menu
    And click on logout button
    Then verify logout

  Scenario: To verify the select voyage button is clickable or not ID#144
     And click on menu button
     And click on voyage analysis menu
     Then verify select voyage button is clickable
@cleaning
  Scenario: To verify a click on the select voyage button opens the list of voyages for that selected vessel ID#145
    And click on menu button
    And click on voyage analysis menu
    And click on select voyage button
    Then verify list of voyages

