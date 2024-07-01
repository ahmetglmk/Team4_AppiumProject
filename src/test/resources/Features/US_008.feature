@a
Feature:Verify sign in page elements and login with email

  Background: User opens the app
    * User makes driver adjustments

  Scenario:Verify sign in page elements and login with email
    * Verifies sign in elements
    * As a "manager" with "arzu" email get login
    * Verifies profil name "arzu"
    * Driver turns off

    Scenario: Login with invalid email
      * Go to sign in page
      * As a "manager" with "invalid" email get login
      * Verifies that you cannot log in
      * Driver turns off
