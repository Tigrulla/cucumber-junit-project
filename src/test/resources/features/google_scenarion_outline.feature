Feature: Data Driven testing using Scenario Outline

  @google_scenario_outline @done
  Scenario Outline: Google capital cities search
    Given User is on Google search page
    When User search for "<country>" capital
    Then User should see "<capital>" in the result
    Examples:
      | country     | capital          |
      | AZERBAIJAN  | Baku             |
      | Tajikistan  | Dushanbe         |
      | Bulgaria    | Sofia            |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
      | TURKEY      | Ankara           |