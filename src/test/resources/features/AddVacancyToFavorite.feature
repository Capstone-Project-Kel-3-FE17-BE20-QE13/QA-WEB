Feature: Add vacancy to favorite

  @TC
  Scenario Outline: Add vacancy to favorite
    Given User already on JobHuntz web
    When User click Daftar button
    And User click Masuk button
    Then User will be redirected to login page
    When User input email "<email>" and password "<password>"
    And User click Login button
    Then User will successfully login
    When User click on vacancy title
    Then User will see the vacancy details
    When User click on Simpan button
    Then User will see message lowongan berhasil disimpan
    Examples:
      | email               | password  |
      | vincenzo1@gmail.com | 123456789 |