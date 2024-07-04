@09
Feature: As a user, I want to be able to see all the categories on the site under the Categories heading.

  Background: User opens the app
    * User makes driver adjustments

  Scenario: Category icon and Men, Women, Junior titles must be visible and active in the home page navbar.
    * The Category icon appears in the navbar and is verified to be accessible.
    * The Men heading appears and is verified to be accessible.
    * The Women heading appears and is verified to be accessible.
    * The Junior heading appears and is verified to be accessible.
    * Driver turns off

  Scenario: Filtering icons must be active.
    * User clicks the button with description "Category"
    * User clicks the button with description "Men"
    * Verify that the filtering icon is active.
    * User clicks the button with description back.
    * User clicks the button with description "Women"
    * Verify that the filtering icon is active.
    * User clicks the button with description back.
    * User clicks the button with description Junior
    * Verify that the filtering icon is active.
    * Driver turns off
