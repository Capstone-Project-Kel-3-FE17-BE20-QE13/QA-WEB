@RegisterJobSeeker
Feature: Register Job Seeker

  @TC
  Scenario Outline: Register new job seeker with valid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will redirected to candidate sign up button
    And User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button
    Then User will be redirected to login page
    Examples:
      | full_name    | email              | username  | password   |
      | miranti nisa | nisamir1@gmail.com | nisamir29 | nisaMIR345 |