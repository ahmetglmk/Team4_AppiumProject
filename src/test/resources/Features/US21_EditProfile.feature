@US21
Feature: US_021 Edit Profile
  Background: User opens the app
    * User makes driver adjustments

    @US21-1
  Scenario: TC_01 Edit profile information
      * User login application with valid info
      * User clicks the button with description "Profile"
      * User clicks the button with description "Edit Profile"
      * User change email "murat3010S@gmail.com" and phone_number "7775554499"
      * Driver turns off