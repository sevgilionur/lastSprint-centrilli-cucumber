Feature: Repair Module Functionality
  As the Centrilli Repair application allows you to manage a complete after-sales process,
  but also to simply repair products you have manufactured, if they present a defect.



  Background: User logged in and navigates to Repairs module
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button yahya
    Then User lands on repairs orders page yahya
  @yahya
#  Scenario: Verify that user first lands on Repairs Orders page
#    Given User goes to application page and enter valid credentials
#    When User clicks on repairs button yahya
#    Then User lands on repairs orders page yahya

  @yahya2

Scenario: User can edit the existing Repair Orders
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button yahya
    And  User lands on repairs orders page yahya
    And  User clicks on the "RMA/00400" on page

    And  User clicks on the edit button
    And  User changes quantity of the order and save
    Then Verify that order has been edit successfully