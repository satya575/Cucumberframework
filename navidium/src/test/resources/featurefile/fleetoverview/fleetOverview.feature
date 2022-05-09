


Feature: To verify the Fleet overview page

  Background:
    Given I am at the login page
    When I login to the application
    Then I verify the title of the page "Fleet Overview"
    And I am at the home page
    And I am at the fleet overview page



  Scenario: To Verify clicking on the zoom in icon zooms in the map area ID#14
    Then verify zoom in icon is clickable

  Scenario: To Verify clicking on the zoom out icon zooms out the map area ID#15
    Then verify zoom out icon is clickable

  Scenario: To Verify clicking on the recenter icon recenter the map ID#16
    Then verify recenter icon is clickable

  Scenario: To Verify a  mouse hover on the first weather property icon displays particles and Barbs tab ID#17
    Then verify wind field have particles and barbs options

  Scenario: To verify particles tab should  be clickable and should display wind particles in the map area ID#18
    And mouse hover on the wind property icon
    Then verify particles clickable
    And click on particles tab
    Then verify slider is present

  Scenario: To verify barbs tab should be clickable and should display barbs in the map area ID#19
    And mouse hover on the wind property icon
    And click on barbs tab
    Then verify slider is present

  Scenario: To Verify a mouse hover on the sea current icon displays particles and Arrows tab ID#25
    Then verify sea current field have particles and barbs options

  Scenario: To verify the particles tab under sea current is clickable and it displays the particles ID#26
    And mouse over on the sea current property icon
    Then verify particles clickable
    And click on particles tab
    Then verify slider is present

  Scenario: To verify the arrows tab under sea current is clickable and it displays the arrows ID#27
    And mouse over on the sea current property icon
    Then verify Arrows clickable
    And click on arrows tab
    Then verify slider is present


  Scenario: To Verify the visibility tab is clickable and it displays the global animation in the map ID#28
    And verify visibility tab is clickable
    And click on visibility tab
  Then verify slider is present


  Scenario: To Verify the tropical revolving storm is clickable and it displays the global animation in the map ID#29
    Then verify tropical revolving storm is clickable
    And click on tropical revolving storm
    Then verify slider is present

   Scenario: To Verify the icing tab is clickable and it displays the global animation in the map ID#30
    Then verify icing tab is clickable
    And click on icing tab
    Then verify slider is present


  Scenario: To Verify the co-ordinate reference grid- tab is clickable  displays the latitude and longitude lines and values in the map ID#31
     Then verify co-ordinate reference grid is clickable
     And click co-ordinate reference grid



  Scenario: To Verify the Emission controlled Areas tab is clickable and it displays the Emission controlled areas on the map  ID#32
    And verify Emission Control Area is clickable
    Then click on Emission control Area


  Scenario: To Verify the Load line zones tab is clickable and it displays the global animation of icing ID#33
   And verify load line zones tab is clickable
   And click on load line zone tab

  Scenario: To Verify the High Risk Areas  tab is clickable and it displays the global animation of icing ID#34
    And verify High Risk Area is clickable
    Then click on High Risk Area

  Scenario: To Verify the Voluntary Reporting Area  tab is clickable and it displays the global animation of icing ID#35
    And verify voluntary Reporting Area
    Then click on Voluntary Reporting Area

  Scenario: To Verify the International Navigation Limit  tab is clickable and it displays the global animation of icing ID#36
  And verify International Navigation Limit Tab
  Then click on International Navigation Tab

 Scenario:To Verify the Joint War committee area  tab is clickable and it displays the global animation of icing ID#37
   And verify Joint War Committee Area
   Then click on Joint War Committee Area

  Scenario: To verify whether the search vessel drop down is clickable and it displays the dropdown list  with vessel names ID#38
    And mouse over on the search vessel
    And verify search vessel  is clickable
    Then click on search vessel

  Scenario: To verify whether the search vessel dropdown is having auto search option ID#39
    And click on the search vessel dropdown
    Then verify Auto Search option

  Scenario: To verify whether the scroll bar in the search vessel dropdown is scrollable ID#40
    And mouse over on the search vessel dropdown
    And click on search vessel dropdown
    Then verify scroll bar in search vessel dropdown

  Scenario: To verify the Current UTC field shows the right time  and date ID#41
    Then verify the Current UTC

  Scenario: To verify the click on the theme change button changes the theme from white to black ID#46
    And click on Theme change
    Then verify Theme change is present

   Scenario: To verify the click on the log out button, logs out the user from the application ID#47
     Then verify  logout is clickable

  Scenario: To verify the vessel alert icon displays the total number of alerts of all the available vessels ID#49
  Then verify  vessel alerts

  Scenario:To verify clicking on the vessel alert icon opens a page showing the alert name , category, date and description ID#50
  Then verify page of vessel alerts

  Scenario:To verify the search bar in the alert description page works properly ID#51
   Then verify search bar in vessel alerts

  Scenario:To verify the signal received legend count matches with the vessel count in the map ID#53
    And mouse over on the signal received legend
    Then verify signal received legend

  Scenario:To verify the Total vessels legend count matches with the vessel count in the map  ID#54
   And mouse over on the total vessels legend
  Then verify total vessels legend

  Scenario:To verify the Total vessels legend count matches with the vessel count of SAT, LIVE and Under implementation ID#55
    Then verify Sat Live and underimplementation


  Scenario:To verify the SAT , LIVE and UNDER IMPLEMENTATION color code is correct while hovering mouse on a vessel ID#56
   And mouse over on sat live underimplementation
   Then verify color code


  Scenario:To verify the close button in the vessel search bar works properly ID#58
   And mouse over on close button
   Then verify close button

  Scenario:To verify the SAT , LIVE and UNDER IMPLEMENTATION color code matches with the status inside the card also ID#57
   And mouse over on colour
   And click on colour
   Then verify colour

  Scenario:To Verify the pressure tab is clickable and it displays the global animation of pressure ID#20
    And click on pressure tab
   Then verify pressure tab is clickable

  Scenario:To Verify the wind gust tab is clickable and it displays the global animation of wind gust ID#21
    And click on wind gust tab
    Then verify wind gust tab is clickable


  Scenario:To Verify the precipitation tab is clickable and it displays the global animation of precipitation ID#22
    And click on precipitation
  Then verify wind precipitation is clickable


  Scenario:To Verify the wind wave tab is clickable and it displays the global animation of wind wave Id#23
    And click on wind wave tab
   Then verify wind wave tab is clickable


  Scenario:To Verify the swell tab is clickable and it displays the global animation of swell ID#24
    And click on  swell tab
  Then verify swell tab is clickable


