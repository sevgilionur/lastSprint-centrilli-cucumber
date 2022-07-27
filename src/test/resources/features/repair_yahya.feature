Feature: Repair Module Functionality
  As the Centrilli Repair application allows you to manage a complete after-sales process,
  but also to simply repair products you have manufactured, if they present a defect.


  Background: Background is also placed as first acceptance criteria
    which is User first land on Repair Orders Page
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button yahya
    Then User lands on repairs orders page yahya

  @yahya2
  Scenario: User can edit the existing Repair Orders
    And  User clicks on the product on page
    And  User clicks on the edit button
    And  User changes quantity of the order and save
    Then Verify that order has been edit successfully

   Scenario: User can create a new Repair Order
     When User clicks on create button
     And  User fills repair reference modules fields

