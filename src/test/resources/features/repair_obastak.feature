Feature: Repair module functionality

  @ob
  Scenario: Verify that user first lands on Repairs Orders page
    Given User goes to application page and enter valid credentials
    When User clicks on repairs button ob
    Then User lands on repairs orders page ob
