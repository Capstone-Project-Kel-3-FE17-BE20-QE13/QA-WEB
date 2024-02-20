@UpdateJobSeekerProfile
Feature: Update job seeker profile

  Scenario Outline: Update job seeker profile name, address, password, and phone
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk button
    Then User will be redirected to login page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will successfully login
    When User click on profile icon
    And User select profile
    Then User will see details profile job seeker
    When User click on edit button
    Then User will see edit profile box
    When User input "<name>" in name field, "<password>" in password field, "<address>" in address field, and "<phone>" in phone field
    And User input "<birthDate>" in birth date field
    And User click on female gender
    And User click edit button profile
    Then User will see pop up edit profil berhasil
    Examples:
      | email                 | password  | name     | address | phone        | birthDate  |
      | candidate10@gmail.com | 123456789 | vincenzo | bandung | 081212345678 | 02/20/2000 |