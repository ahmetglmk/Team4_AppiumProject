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
        ReusableMethods.wait(2);
    }
    @Given("User clicks the button with itemName {string} and {string} and {string} added WishList")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews,String price) {
       xPathElementClick(itemName,reviews,price);
       ReusableMethods.wait(2);
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
    @Given("Wishlist button {string} button must be visible and active")
    public void wishlist_button_button_must_be_visible_and_active(String string) {
        card.wishList();

    }
        @Given("add products to the basket and click add to cart and click bag")
        public void add_products_to_the_basket_and_click_add_to_cart_and_click_bag() {
        card.productadd();
    }
    @Given("Proceed to checkout click")
    public void proceed_to_checkout_click() {
        card.proceedToCheckoutClick();

    }
    @Given("Delivery pickup buttons must be visible and active")
    public void delivery_pickup_buttons_must_be_visible_and_active() {
        card.pickupDeliveryVisibleActive();

    }
    @Given("address information should be displayed")
    public void address_information_should_be_displayed() {
        card.adressisdisplayed();
    }
    @Given("address information should be editable")
    public void address_information_should_be_editable() {
        card.adresseditable();
    }
    @Given("new address should be able to be added")
    public void new_address_should_be_able_to_be_added() {

    }
}

