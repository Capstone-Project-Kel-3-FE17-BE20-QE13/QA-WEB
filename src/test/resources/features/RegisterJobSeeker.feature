@RegisterJobSeeker
Feature: Register Job Seeker

  Scenario Outline: Register new job seeker with valid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will be redirected to candidate sign up page
    When User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button with valid input
    Then User will see message successfully registered
    Examples:
      | full_name            | email                 | username   | password |
      | candidate tiga puluh | candidate30@gmail.com | candidate30 | 12345678 |

  Scenario Outline: Register new job seeker with password equals 8 characters
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will be redirected to candidate sign up page
    When User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button with valid input
    Then User will see message successfully registered
    Examples:
      | full_name            | email                 | username   | password |
      | candidate tiga puluh | candidate30@gmail.com | candidate30 | 12345678 |

  Scenario Outline: Register new job seeker with password more than 8 characters
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will be redirected to candidate sign up page
    When User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button with valid input
    Then User will see message successfully registered
    Examples:
      | full_name            | email                 | username    | password  |
      | candidate tiga puluh | candidate30@gmail.com | candidate30 | 123456789 |

  Scenario Outline: Register new job seeker with duplicate email
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will be redirected to candidate sign up page
    When User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button
    Then User will see message "Email sudah terdaftar"
    Examples:
      | full_name    | email            | username  | password   |
      | nisa miranti | tes123@gmail.com | nisamir39 | nisaMIR345 |

  Scenario Outline: Register new job seeker with empty field
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will be redirected to candidate sign up page
    When User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button
    Then User will see message under the field "<message>"
    Examples:
      | full_name         | email                | username | password   | message                                |
      |                   | candidate8@gmail.com | candi8   | candidate8 | name is required                       |
      | candidate delapan |                      | candi8   | candidate8 | email is required                      |
      | candidate delapan | candidate8@gmail.com |          | candidate8 | username is required                   |
      | candidate delapan | candidate8@gmail.com | candi8   |            | Password must be at least 8 characters |
      |                   |                      |          |            | name is required                       |
      | candidate delapan | candidate8@gmail.com | candi8   | andi       | Password must be at least 8 characters |

  Scenario Outline: Register new job seeker with invalid email
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Candidate Sign Up button
    Then User will be redirected to candidate sign up page
    When User input "<full_name>", "<email>", "<username>", and "<password>"
    And User click Register button
    Then User is required to enter a valid email to register
    Examples:
      | full_name         | email      | username   | password   |
      | candidate delapan | candidate8 | candidate8 | candidate8 |