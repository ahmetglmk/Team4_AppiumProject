Feature: US_008 Sign Up
  Background: User opens the app
    * User makes driver adjustments
  @US07-1
  Scenario: TC_01 Ability to register to the application with valid phone number and password

    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * User enters fullname "Murat ATES" phoneNumber "7778889933" and password "Ankara06."
    * Driver turns off

    @US07-2
  Scenario: TC_02 Ability to register to the application with valid email and password
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * User enters fullname "Murat ATES" email "murat3003A@gmail.com" and password "Ankara06."
    * Driver turns off

  @US07-3
  Scenario: TC_03 Not being able to register to the application with an invalid email
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * User enters fullname "Murat ATES" invalid email "murat3003Agmail.com" and password "Ankara06."
    * Driver turns off

  @US07-4
  Scenario: TC_04 Not being able to register to the application with an invalid phone number
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * User enters fullname "Murat ATES" invalid phoneNumber "778899" and password "Ankara06."
    * Driver turns off

  @US07-5
  Scenario Outline: Not being able to register to the application with an invalid password
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * User enters fullname "Murat ATES" email "murat3004A@gmail.com" and "<invalid_password>"
    * Driver turns off
    Examples:
    |invalid_password|
    |Ankara|
    |Ankara06|
    |Ankara.|
