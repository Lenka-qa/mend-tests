@B4G1-167
Feature: Demo how to upload json report to xray

  @xray @B4G1-294 @B4G1-186
  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user click login button
    Then user should be able to see the home for client