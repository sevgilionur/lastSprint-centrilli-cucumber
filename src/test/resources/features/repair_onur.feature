Feature: Repair Module Functionality
  As the Centrilli Repair application allows you to manage a complete after-sales process,
  but also to simply repair products you have manufactured, if they present a defect.

  Scenario: Verify that user first lands on Repairs Orders page
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button onur
    Then User lands on repairs orders page onur