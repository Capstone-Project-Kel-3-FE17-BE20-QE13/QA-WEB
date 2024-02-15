@LoginJobSeeker
Feature: Login Job Seeker

  @TC
  Scenario Outline: Login job seeker with valid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk button
    Then User will be redirected to login page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will successfully login
    Examples:
      | email                | password  |
      | candidate1@gmail.com | 123456789 |