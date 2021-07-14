

 
Feature: 
  To validate the login functionality

  Background: 
    Given User will launch the chrome browser

 
  Scenario: 
    To validate the invalide username and invalide password

    When User will hit the url
    When User has to enter the invalide username
      | karthiga | thara | singh | kavi |
    And User has to enter the invalide password
      | karthu | madhu | sudha | nive   |
      |   1564 |  2564 |  2184 |   7978 |
      | abcd   | efcg  | hijgd | saoifh |
    Then User has to click the login button
    But User will not get the home page

  
  Scenario Outline: To validate the correct User name and blank password
    When Usrer will enter the Url
    When use will enter the "<username>" in User field
    And User will enter the" <password >"in the Pass field
    Then User will has to click to Login button
    But The user wll not get home Page

    Examples: 
      | username |  | password   |
      | karthiga |  | 7708401157 |
      | hari     |  | 9705304105 |
      | bujji    |  | bujji123   |


  Scenario: To validate the given credentails is working
    When user will hit the url
    And user will enter the username
      |karthika|thara|singh|
    And user will enter new passowrd
      | password1 | password2 | password3 |
      |      1234 | abcde     | endsvgs   |
      | nsbx545   | bdxushd   | shdusi    |
      | nbuguo    | lkjioyo   | jkguyf    |
    Then user has yto click the login button
    But user wont get the home page
