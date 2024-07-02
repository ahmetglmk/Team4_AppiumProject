Feature: As a registered user, I would like to be able to see the categories and products of the Women menu on the home page.

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * As a "manager" with "Gamze" email get login

  Scenario: Women category window and subcategories should be displayed in the body section of the home page.
    * Scroll until you find the Women category in the Categories section.
    * Verify that the subheadings are displayed.


  Scenario: The products on the Women category page should be able to perform actions (add to cart, add to favorites list and view).
    * Scroll until you find the Women category in the Categories section and click.
    * Click on the desired product and view it.
    * Click on the 'Add to cart' button.
    * Click on the 'Favorite' button.

  Scenario: Filtering icons should be visible and active
    * Scroll until you find the Women category in the Categories section and click.
    * Verify that the filtering icon is displayed and active.
