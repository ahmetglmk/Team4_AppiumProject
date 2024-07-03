@ahmet
Feature: US_002 Verifying easy links and search process

  Background: User opens the app
    * User makes driver adjustments

  Scenario: Verifying the Orange Button
    * Sees the "android.widget.ImageView" and instance 18 button on the home page and when clicked, sees the text "Shopping Cart" on the page that opens.

  Scenario Outline: Verifying easy links
    * Verifies the visibility of the "<EasyLink>" button on the home page and the visibility of the text "<Text>" on the page by clicking it
    Examples:
      |EasyLink                |Text|
      |Home                    |Most Popular                |
      |Category                |Men                         |
      |Profile                 |Sign Up                     |
      |Wishlist                |Sign in to continue shopping|

  Scenario: Verifying search box
    * Goes to "Home" page
    * Sees the "android.widget.ImageView" and instance 1 button on the home page and when clicked, sees the text "Search" on the page that opens.
    * Searches for the desired "shoes" product and sees the relevant product
