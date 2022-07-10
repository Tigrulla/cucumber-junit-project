@B26G12-58
Feature: Grid settings
	Background:

		Given User is logged under vehicle feature module

	@B26G12-56 @B26G12-8
	Scenario: Grid Settings should be on the right side of the Reset button

		Then User should see Grid setting on the right side of reset button	

	@B26G12-57 @B26G12-8
	Scenario: Grid Settings button is on the right of the page

		Then User sees Grid setting button on the right of the page