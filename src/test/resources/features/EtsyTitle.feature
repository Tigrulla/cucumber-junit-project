@Etsy
  Feature: Etsy page title verification
    User story: As a user,when i am on https://www.etsy.com page
    and I should be able to see title is as expected

    Background:
      Given User is on Etsy main page

    Scenario: Etsy Search Functionality Title Verification
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

    Scenario: Etsy Search Functionality Title Verification
      When User types "Wooden spoon" in the search box
      And User clicks search button
      Then User sees "Wooden spoon" is in the title
