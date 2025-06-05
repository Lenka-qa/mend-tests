Feature: Google search Functionality Title Verification
  User Story: As a user, when i Google search page
  I should be able to search whatever i want and see the relevant information

  Scenario: Search functionality result title verification
    Given user in on Google search page
    When user types Loop Academy in the google search box nd clicks enter
    Then user should see Loop Academy  - Google search ib the Google title
  @google_search @smoke
  Scenario: Search functionality result title verification
    Given user in on Google search page
    When user types "Loop Academy" in the google search box and clicks enter
    Then user should see "Loop Academy - Google Search" in the google title