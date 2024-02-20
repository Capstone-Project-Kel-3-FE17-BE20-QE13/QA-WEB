@LoginCompany
Feature: Login Company

  @TC1
  Scenario Outline: Login company with valid input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk Company button
    Then User will be redirected to login company page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will successfully login company
    Examples:
      | email              | password  |
      | company6@gmail.com | 123456789 |

  Scenario Outline: Login company with empty field
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk Company button
    Then User will be redirected to login company page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will see message under the field "<message>"
    Examples:
      | email              | password  | message                                |
      | company6@gmail.com |           | Password must be at least 8 characters |
      |                    | 123456789 | email is required                      |
      |                    |           | email is required                      |

  Scenario Outline: Login job seeker with wrong input
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk Company button
    Then User will be redirected to login company page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will see message "Cannot read properties of undefined (reading 'data')"
    Examples:
      | email              | password  |
      | company6@gmail.com | abcabcdf  |
      | comp6@gmail.com    | 123456789 |

    Then User will successfully login company
    When User click photo profile
    And User click button daftar lowongan
    And User click button add
    And User input "<posisi>" as nama posisi, "<jobType>" as tipe kerjaan, "<address>" as alamat, "<gaji>" as estimasi gaji
    And User click bidang pekerjaan and chose 1
    And User click tambah lowongan button
    Then User will see success tambah lowongan
    Examples:
      | email               | password  | posisi | jobType | address | gaji   |
      | testes123@gmail.com | 123456789 | IT     | IT      | Malang  | 100000 |

