

Feature: US_11 WishList
  Background: User opens the app
    * User makes driver adjustments
  @2
  Scenario:Wishlist button should be visible and active on the homepage navbar.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * Wishlist button "Wishlist" button must be visible and active
    * Driver turns off

  Scenario:  Test to select favorite products and add to wishlist
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
    * Toaster is displayed
    * Driver turns off


