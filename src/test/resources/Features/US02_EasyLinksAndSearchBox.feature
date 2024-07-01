@ahmet
Feature: US_002 Verifying easy links and search process

  Background: User opens the app
    * User makes driver adjustments

  Scenario Outline: Verifying easy links
    * Sees "<easyLink>" button at the bottom of the home page and clicks
    * Verifies visibility of "<text>" text on "Home-Category-Wishlist-Profile" page

    Examples:
    |easyLink|text        |
    |Home    |Most Popular|
    |Category|Men         |
    |Wishlist|Wishlist    |
    |Profile |My Account  |
