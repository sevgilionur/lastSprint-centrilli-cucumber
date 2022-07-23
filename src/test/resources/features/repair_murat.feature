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


  @murat
    Scenario: User can access the existing Repair Orders_AC2
      When User clicks existing "00500" order_murat
      Then User can access the existing "00500" Repair Orders_murat


      Scenario: User can edit the existing Repair Orders_AC3


