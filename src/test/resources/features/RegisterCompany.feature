@RegisterCompany
Feature: Register Company

  Scenario Outline: Register company with valid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Employee Hiring button
    Then User will be redirected to Company Sign Up page
    When User input full name "<full_name>", email "<email>", password "<password>", company name "<company_name>", company type "<company_type>", and website "<website>"
    And User choose company size "<company_size>"
    And User click Register button for register company
    Then User will successfully registered
    Examples:
      | full_name    | email              | password  | company_name | company_type  | website              | company_size    |
      | company enam | company6@gmail.com | 123456789 | PT Company 6 | IT Consultant | https://company6.com | 1-250 employees |

  Scenario Outline: Register company with invalid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Employee Hiring button
    Then User will be redirected to Company Sign Up page
    When User input full name "<full_name>", email "<email>", password "<password>", company name "<company_name>", company type "<company_type>", and website "<website>"
    And User choose company size "<company_size>"
    And User click Register button for register company
    Then User will see message below the field "<message>"
    Examples:
      | full_name   | email              | password  | company_name | company_type  | website              | company_size    | message                                     |
      |             | company2@gmail.com | 123456789 | PT Company 2 | IT Consultant | https://company2.com | 1-250 employees | name is required                            |
      | company dua |                    | 123456789 | PT Company 2 | IT Consultant | https://company2.com | 1-250 employees | email is required                           |
      | company dua | company2@gmail.com |           | PT Company 2 | IT Consultant | https://company2.com | 250+ employees  | Password must be at least 8 characters      |
      | company dua | company2@gmail.com | 123456789 |              | IT Consultant | https://company2.com | 250+ employees  | company name is required                    |
      | company dua | company2@gmail.com | 123456789 | PT Company 2 |               | https://company2.com | 1-250 employees | company type is required example: Acountant |
      | company dua | company2@gmail.com | 123456789 | PT Company 2 | IT Consultant |                      | 250+ employees  | Invalid url must add http                   |
      | company dua | company2@gmail.com | 123456789 | PT Company 2 | IT Consultant | company2             | 250+ employees  | Invalid url must add http                   |
      |             |                    |           |              |               |                      |                 | name is required                            |

  @RegComp
  Scenario Outline: Register company with duplicate email
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Employee Hiring button
    Then User will be redirected to Company Sign Up page
    When User input full name "<full_name>", email "<email>", password "<password>", company name "<company_name>", company type "<company_type>", and website "<website>"
    And User choose company size "<company_size>"
    And User click Register button for register company
    Then User will see error message duplicate email
    Examples:
      | full_name    | email              | password  | company_name | company_type  | website              | company_size    |
      | company enam | company6@gmail.com | 123456789 | PT Company 6 | IT Consultant | https://company6.com | 1-250 employees |