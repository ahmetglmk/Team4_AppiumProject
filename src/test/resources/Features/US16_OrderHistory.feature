@ahmet
Feature: US_016 Verifying My Account page and Order History

  Background: User opens the app and Logging to mobile application
    * User makes driver adjustments

    Scenario:
      * The user logs in using the name "ahmetgulmek" and "ahmetPassword"
      * Verifies the visibility of the "Profile" button on the home page and the visibility of the text "My Account" on the page by clicking it
      * Verifies the visibility of the "My Account" button on the home page and the visibility of the text "My Account" on the page by clicking it
      * Verifies the "Total Orders" text on the page
      * Verifies the "Total Completed" text on the page
      * Verifies the "Total Returnd" text on the page
      * Verifies the "Wallet Balance" text on the page

    Scenario:
      * Verifies the "Order History" text on the page
      * Verifies that past orders are displayed in the Order History section




