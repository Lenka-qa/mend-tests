Feature: Scenario Outiline practice

  @google_search_outline @smoke
  Scenario Outline:
    Given user in on Google search page
    When user search for "<country>"
    Then user should see the "<capital>" in the results
    And We love Loop Academy

    Examples:
      | country     | capital          |
      | Azerbaijan  | Baku             |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
      | Turkiye     | Ankara           |
      | Uzbekistan  | Tashkent         |
      | Georgia     | Atlanta          |