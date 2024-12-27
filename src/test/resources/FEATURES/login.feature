Feature: Facebook login check

  Background: 
    Given User enters the facebook url

  @outline
  Scenario: Login facebook page
    When User enters the username
    And User enters the password
    And User clicks the login button
    Then User is on facebook home page

  @Sanity
  Scenario: Login facebook page with valid credentials
    When User enters the username "Admin"
    And User enters the password "123445"
    And User clicks the login button
    Then User is on facebook home page

  Scenario Outline: Login facebook page with multiple data
    When User enters the username "<username>"
    And User enters the password "<password>"
    And User clicks the login button
    Then User is on facebook home page
    
Examples:
      | username | password |
      | Oranium  |   456789 |
      | Tech     |    12356 |
      | admin    |     7215 |
