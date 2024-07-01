package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());

    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
    }

    @Given("User confirms to be on the homepage")
    public void user_confirms_to_be_on_the_homepage() {
        card.LogoGorunurTest();
    }

    @Given("User clicks the button with description {string}")
    public void user_clicks_the_button_with_description(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
    }

    @Given("User clicks the button {string} and sendKeys {string}")
    public void user_clicks_the_button_and_send_keys(String elementName, String text) {
        card.phoneTextBoxClickAndSendKeys(text);
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Wise.123").perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }

    @Given("User clicks the button {string}")
    public void user_clicks_the_button(String elementName) {
        card.signInLoginClick();
        ReusableMethods.wait(1);
        hideKeyboard();
        ReusableMethods.wait(2);

    }

    @Given("Verifies username {string} in dashboard")
    public void verifies_username_in_dashboard(String userName) {
        ReusableMethods.wait(1);
        VerifyElementText(userName);
    }
    /***US 11   **/
    @Given("As a user muss be {string} phone and {string} password Login")
    public void as_a_user_muss_be_phone_and_password_login(String phoneNumber, String password) {
        card.Login(phoneNumber,password);
    }
    @Given("User clicks the button with itemName {string} and {string} and {string} added WishList")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews,String price) {
       xPathElementClick(itemName,reviews,price);
    }


    @Given("Driver turns off")
    public void driver_turns_off() {
        quitAppiumDriver();
    }
    @Given("Toaster is displayed")
    public void toast_is_displayed() {
        card.wishListToast();

    }

    @Given("Scrolls down to see popular brands")
    public void scrolls_down_to_see_popular_brands() throws InvalidMidiDataException {
        card.seePopularBrands();
    }

    @Given("User enters fullname {string} phoneNumber {string} and password {string}")
    public void user_enters_fullname_phone_number_and_password(String fullName, String phoneNumber, String password) {
        card.signUpPhoneNumber(fullName,phoneNumber,password);
    }


    @Given("User enters fullname {string} email {string} and password {string}")
    public void user_enters_fullname_email_and_password(String fullName, String email, String password) {
        card.signUpEmail(fullName,email,password);
    }

    @Given("User enters fullname {string} invalid email {string} and password {string}")
    public void user_enters_fullname_invalid_email_and_password(String fullName, String invalidEmail, String password) {
        card.signUpInvalidEmail(fullName,invalidEmail,password);
    }

    @Given("User enters fullname {string} invalid phoneNumber {string} and password {string}")
    public void user_enters_fullname_invalid_phone_number_and_password(String fullName, String invalidPhoneNumber, String password) {
        card.signUpInvalidPhoneNumber(fullName,invalidPhoneNumber,password);
    }

    @Given("User enters fullname {string} email {string} and {string}")
    public void user_enters_fullname_email_and(String fullName, String email, String invalidPassword) {
        card.signUpInvalidPassword(fullName,email,invalidPassword);
    }

    @Given("User login to application with valid info")
    public void user_login_to_application_with_valid_info() {
        card.login();
    }

    @Given("User change email {string} and phone_number {string}")
    public void user_change_email_and_phone_number(String email, String phoneNumber) {
        card.editProfile(email,phoneNumber);
    }



    @Given("Sees {string} button at the bottom of the home page and clicks")
    public void sees_button_at_the_bottom_of_the_home_page_and_clicks(String easyLink) {
        ReusableMethods.wait(5);
        card.verifyingAndClickEasyLinks(easyLink);
        ReusableMethods.wait(5);
    }

    @Given("Verifies visibility of {string} text on {string} page")
    public void verifies_visibility_of_text_on_page(String string, String string2) {

    }
}

