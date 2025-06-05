Feature:
  @mend
  Scenario:
    Given user on Mend Developers Portal page
    Then user clicks GitHub to access a repository
    And user can see GitHub header
    And user enters username for GitHub
    And user enters password for GitHub
    When user clicks SignIn button
    Then user should be able to see the home for organizations
    And user clicks on badge that says User
    Then user should be able to see Renovate plan
    Then user clicks on Automation project link
    Then user clicks on the first Done button in a Status column
    Then user validates Memory Limit
    Then user validates Disk Limit
    Then user validates Duration Limit
