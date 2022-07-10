Feature: SmartBear order process
  User story: as a user when i am logged in SmartBear
  I should be able to fill out all required fields and verify that i am on the list

  @johnWick
  Scenario: User should be able fill out all fields and verify users name in order list
    Given User logged in SmartBear Tester account with username "Tester" and password "test" and on Order page
    When User fills out all required forms as followed
    When User selects FamilyAlbum from product dropdown
    When User enters "4" to quantity
    When User enters "John Wick" to costumer name
    When User enters "Kinzie Ave" to street
    When User enters "Chicago" to city
    When User enters "IL" to state
    When User enters "60056" for zip code
    When User selects Visa as card type
    When User enters "1111222233334444" to card number
    When User enters "12/22" to expiration date
    When User clicks process button
    And  User clicks view all orders
    Then User verifies John Wick is in the list

