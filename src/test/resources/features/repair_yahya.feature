@CNT-1306
Feature: Repair Module Functionality
  As the Centrilli Repair application allows you to manage a complete after-sales process,
  but also to simply repair products you have manufactured, if they present a defect.

  1- User first lands on Repairs Orders page
  2- User can edit the existing Repair Orders
  3- User can create a new Repair Order
  4- User can fill in the Repair Order form

  Background: User logged in and landed on repair page
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button yahya

  @CNT-1300
  Scenario:
    Then User lands on repairs orders page yahya

  @CNT-1301
  Scenario: User can edit the existing Repair Orders
    And  User clicks on the product on page
    And  User clicks on the edit button
    And  User changes quantity of the order and save
    Then Verify that order has been edit successfully

  @CNT-1302
  Scenario: User can create a new Repair Order
    When User clicks on create button
    And  User fills minimal field and click on save button
    Then Verify that repair order is created

  @CNT-1303
  Scenario: User can fill in the Repair Order form
    When User clicks on create button
    And User fills the repair reference fields
    Then Verify that user succesfully filled the fields

  @CNT-1304
  Scenario: User can create a new Repair Order
    When User clicks on create button
    And User fills the repair reference fields
    And User clicks on save button
    Then Verify that repair order is created






