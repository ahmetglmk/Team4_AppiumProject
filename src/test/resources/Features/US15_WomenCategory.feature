Feature: As a registered user, I would like to be able to see the categories and products of the Women menu on the home page.

  Background: User opens the app
    * User makes driver adjustments



  Scenario: Women category window and subcategories should be displayed in the body section of the home page.
    * Scroll until you find the category in the Categories section.
    #* Verify that the  are displayed.


  @15
  Scenario: The products on the Women category page should be able to perform actions (add to cart, add to favorites list and view).
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a "manager" with "Gamze" email get login
    * Displays menus under categories "Women Clothing"
    * Verify that the filtering icon is active.
    * Click on the desired product and view it.
    * User clicks the button with description Add To Cart
    * User clicks the button with description "Favorite"
    * Driver turns off
    
