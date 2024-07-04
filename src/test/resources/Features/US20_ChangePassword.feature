@ahme
Feature:US_020 Verifying Change Password process

  Background: User opens the app and Logging to mobile application
    * User makes driver adjustments

    Scenario :
      * The user logs in using the name "ahmetgulmek" and "ahmetPassword"
      * User clicks the button with description "Profile"
      * Verifies the visibility of the "Change Password" button on the home page and the visibility of the text "Change Password" on the page by clicking it
      * Sees the "android.widget.EditText" and instance 0 element on the any page and when clicked and enters the text "ahmetPassword" on the page that opens.
      * Sees the "android.widget.EditText" and instance 1 element on the any page and when clicked and enters the text "ahmetNewPassword" on the page that opens.
      * Sees the "android.widget.EditText" and instance 2 element on the any page and when clicked and enters the text "ahmetNewPassword" on the page that opens.
      * User clicks the button with description "Save Changes"

