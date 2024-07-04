@Harun
Feature: US_19 Adress
  Background: User opens the app
    * User makes driver adjustments
  @US19-1
  Scenario:Delivery, Pick Up buttons must be visible and active on the Shipping Information page
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * add products to the basket and click add to cart and click bag
    * Proceed to checkout click
    * Delivery pickup buttons must be visible and active
    * Driver turns off
  @US19-2
  Scenario:Shipping address information should be displayed, edited, new address should be added when Delivery button is clicked

    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * add products to the basket and click add to cart and click bag
    * Proceed to checkout click
    * address information should be displayed
    * address information should be editable
    * new address should be able to be added
    * Driver turns off

  Scenario:Order summary should be displayed under Order Summary,Save & Pay button should be visible and active
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * add products to the basket and click add to cart and click bag
    * Proceed to checkout click
    * Order summary should be displayed under the title (subtotal, tax, shipping charge, discount)
    * save pay button must be visible and active
    * Driver turns off
