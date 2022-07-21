Feature: Repair Module Functionality
  As the Centrilli Repair application allows you to manage a complete after-sales process,
  but also to simply repair products you have manufactured, if they present a defect. Once in the application:

  Scenario: Verify that user lands on repairs order page
    Given User goes to application page and enter valid credentials
    When user clicks on repairs button gy
    Then user lands on repairs orders page gy

  @gungor
  Scenario: Verify that user can access the existing Repair Orders
    Given User goes to application page and enter valid credentials
    When user clicks on repairs button gy
    And user clicks on exisiting repair order gy
    Then user should see the detailed repair order page gy