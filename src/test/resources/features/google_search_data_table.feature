Feature: Passing multiple parameters to the same step
  @google_search_data_table @smoke
  Scenario: Searching multiple items
    Given user in on Google search page
    Then user searches the following items
    |loop academy|
    |java        |
    |selenium    |
    |sql         |
    |Pavlo       |
    |Kate        |
  And We love Loop Academy
