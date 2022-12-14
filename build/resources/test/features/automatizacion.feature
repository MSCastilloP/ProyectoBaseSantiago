@stories
Feature: Insertion of business units

  @scenario1
  Scenario: Username and password login
    Given The user Admin must correctly enter his username and password, which he has previously registered.
    When The user clicks on the login button
    Then The user can successfully log in and look at their dashboard

  @scenario2
  Scenario: Enter the Bussines units panel
    When Select the Bussines units panel
    Then Text appears that says Bussines Units

  @scenario3
  Scenario: Enter a new business unit
    Given the user entered correctly and is in the Business Units module
    When  the user enters a new business unit
    Then the new item will be added to the list
