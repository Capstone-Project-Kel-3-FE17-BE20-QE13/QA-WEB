@LoginCompany
Feature: Login Company

  Scenario Outline: Login company with valid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk Company button
    Then User will be redirected to login company page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will successfully login company
    Examples:
      | email                | password  |
      | testes123@gmail.com | 123456789 |