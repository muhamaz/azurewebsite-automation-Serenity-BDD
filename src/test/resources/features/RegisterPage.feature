Feature: Register Functionality

  @Register @Positive
  Scenario: Register user with valid data
    Given User already on website
    When User click sign up menu
    Then User navigate to register page
    When User input firstname "Koh"
    And User input lastname "Johan"
    And User input E-post "123456"
    And User input mobile phone number "123456"
    And User input username "kohjohan123"
    And User input password "1234@Johan"
    And User input confirm password "1234@Johan"
    And User click submit button
    Then Message should be appear "Registration Successful"