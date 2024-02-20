@JobSeekerCareer
Feature: Job seeker career

  Scenario Outline: Post job seeker career
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
    When User click + button next to Riwayat Karir label
    Then User will see Riwayat Karir field box
    When User input "<position>" as position, "<companyName>" as company name, "<start_date>" as start date, and "<end_date>" as end date
    And User click Tambah career button
    Then User will see pop up tambah karir berhasil
    Examples:
      | email                 | password  | position | companyName      | start_date | end_date  |
      | candidate10@gmail.com | 123456789 | staff    | PT Vincenzo Lima | 01/30/2019 | 01/30/2022 |