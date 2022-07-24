Feature: Repair Module Functionality

  Acceptance Criteria:
  1- User first lands on Repairs Orders page
  2- User can access the existing Repair Orders
  3- User can edit the existing Repair Orders
  4- User can create a new Repair Order
  5- User can fill in the Repair Order form

  Background: User already logged in and landed on Repair Orders Page_AC1
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button_murat
    Then User sees Repair Order Page_murat


  Scenario: User can access the existing Repair Orders_AC2
    When User clicks existing "00500" order_murat
    Then User can access the existing "00500" Repair Orders_murat


  @me
  Scenario Outline: User can edit the existing Repair Orders_AC3
    Given User clicks existing "<product number>" order_murat
    When User clicks Repair Orders Edit Button_murat
    And User inputs  "<quantity>" to Product Quantity Box_murat
    And User clicks Save Button_murat
    Then Verify that order has been changed to new "<quantity>" successfully_murat

    Examples:
      | product number | quantity |
      | 00500          | 113      |


