@LoginJobSeeker
Feature: Login Job Seeker

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

  Scenario Outline: Login job seeker with wrong input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk button
    Then User will be redirected to login page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will see message "Password salah!"
    Examples:
      | email                | password  |
      | candidate1@gmail.com | abcabcdf  |
      | candi1@gmail.com     | 123456789 |

  Scenario Outline: Login job seeker with empty field
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk button
    Then User will be redirected to login page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will see message under the field "<message>"
    Examples:
      | email                | password  | message                                |
      | candidate1@gmail.com |           | Password must be at least 6 characters |
      |                      | 123456789 | email is required                      |
      |                      |           | email is required                      |

  Scenario Outline: Login job seeker with invalid email
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk button
    Then User will be redirected to login page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User is required to enter a valid email to login
    Examples:
      | email      | password  |
      | candidate1 | 123456789 |
