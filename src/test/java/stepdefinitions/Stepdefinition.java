package stepdefinitions;

import Page.DynamicLocator;
import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());
    DynamicLocator dynamicLocator = new DynamicLocator();

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
        card.Login(phoneNumber, password);
        ReusableMethods.wait(2);
    }

    @Given("User clicks the button with itemName {string} and {string} and {string} added WishList")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews, String price) {
        xPathElementClick(itemName, reviews, price);
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
        card.signUpPhoneNumber(fullName, phoneNumber, password);
    }


    @Given("User enters fullname {string} email {string} and password {string}")
    public void user_enters_fullname_email_and_password(String fullName, String email, String password) {
        card.signUpEmail(fullName, email, password);
    }

    @Given("User enters fullname {string} invalid email {string} and password {string}")
    public void user_enters_fullname_invalid_email_and_password(String fullName, String invalidEmail, String password) {
        card.signUpInvalidEmail(fullName, invalidEmail, password);
    }

    @Given("User enters fullname {string} invalid phoneNumber {string} and password {string}")
    public void user_enters_fullname_invalid_phone_number_and_password(String fullName, String invalidPhoneNumber, String password) {
        card.signUpInvalidPhoneNumber(fullName, invalidPhoneNumber, password);
    }

    @Given("User enters fullname {string} email {string} and {string}")
    public void user_enters_fullname_email_and(String fullName, String email, String invalidPassword) {
        card.signUpInvalidPassword(fullName, email, invalidPassword);
    }

    @Given("User login to application with valid info")
    public void user_login_to_application_with_valid_info() {
        card.login();
    }

    @Given("User change email {string} and phone_number {string}")
    public void user_change_email_and_phone_number(String email, String phoneNumber) {
        card.editProfile(email, phoneNumber);
    }


    //**US 004

    @When("Visitor displays {string} title")
    public void visitorDisplaysTitle(String Categories) throws InvalidMidiDataException {
        ReusableMethods.wait(2);
        VerifyElementText(Categories);
    }

    @When("Displays menus under categories {string}")
    public void displaysMenusUnderCategories(String text) throws InvalidMidiDataException {
        card.swipeAndSelect(text);
    }

    ///US 008
    @Given("Verifies sign in elements")
    public void verifies_sign_in_elements() {
        ReusableMethods.wait(2);
        clickButtonByDescription("Profile");
        ReusableMethods.wait(2);
        clickButtonByDescription("Sign In");
        ReusableMethods.wait(2);
        card.verifySignInPageElement();
    }

    @Given("As a {string} with {string} email get login")
    public void as_a_with_email_get_login(String loginType, String emailName) {
        card.getLoginwithParameter(emailName);
    }

    @Given("Verifies profil name {string}")
    public void verifies_profil_name(String profilName) {
        card.verifyProfilPage(profilName);
    }

    @Given("Go to sign in page")
    public void go_to_sign_in_page() {
        ReusableMethods.wait(2);
        //WebElement profil=dynamicLocator.getDynamicElementByContentDesc("Profile");
        //profil.click();
        card.profilIcon.click();
        ReusableMethods.wait(1);
        WebElement signIn = dynamicLocator.getDynamicElementByContentDesc("Sign In");
        signIn.click();
    }

    @Given("Verifies that you cannot log in")
    public void verifies_that_you_cannot_log_in() {
        ReusableMethods.wait(2);
        VerifyElementText("Error\n" + "Invalid credentials or you are blocked");
        ReusableMethods.wait(2);
    }

    // <<<<<<< ahmet

    @Given("Sees {string} button at the bottom of the home page and clicks")
    public void sees_button_at_the_bottom_of_the_home_page_and_clicks(String easyLink) {
        ReusableMethods.wait(5);
        card.verifyingAndClickEasyLinks(easyLink);
        ReusableMethods.wait(5);
    }

    @Given("Verifies visibility of {string} text on {string} page")
    public void verifies_visibility_of_text_on_page(String string, String string2) {
    }
    // <<<<<<< harun

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
        ReusableMethods.wait(1);
    }

    @Given("address information should be editable")
    public void address_information_should_be_editable() {
        card.adresseditable();
    }

    @Given("new address should be able to be added")
    public void new_address_should_be_able_to_be_added() {
        card.adressAdded();

    }

    @Given("The logo is displayed at the top left of the site and clickability.")
    public void the_logo_is_displayed_at_the_top_left_of_the_site() {
        card.siteLogo();
    }

    @Given("The Category icon appears in the navbar and is verified to be accessible.")
    public void the_category_icon_appears_in_the_navbar_and_is_verified_to_be_accessible() {
        card.categoriesisDisplayed();
    }

    @Given("The Men heading appears and is verified to be accessible.")
    public void the_men_heading_appears_and_is_verified_to_be_accessible() {
        card.categoryMenButtonDisplayed();
    }

    @Given("The Women heading appears and is verified to be accessible.")
    public void the_women_heading_appears_and_is_verified_to_be_accessible() {
        card.categoryWomenButtonDisplayed();
    }

    @Given("The Junior heading appears and is verified to be accessible.")
    public void the_junior_heading_appears_and_is_verified_to_be_accessible() {
        card.categoryJuniorButtonDisplayed();
    }

    @Given("Verify that the filtering icon is active.")
    public void verify_that_the_filtering_icon_is_active() {
        card.filtreisDisplayed();
    }

    @Given("User clicks the button with description back.")
    public void user_clicks_the_button_with_description_back() {
        card.backButton();
    }

    @Given("User clicks the button with description Junior")
    public void user_clicks_the_button_with_description_junior() {
        card.categoryJuniorClick();
    }

    @Given("Order summary should be displayed under the title \\(subtotal, tax, shipping charge, discount)")
    public void order_summary_should_be_displayed_under_the_title_subtotal_tax_shipping_charge_discount() {
        card.orderSummaryisDisplayed();
    }
    @Given("save pay button must be visible and active")
    public void save_pay_button_must_be_visible_and_active() {
        card.savePayisDisibleActive();

    }


    //Ahmet
    @Given("Verifies the visibility of the {string} button on the home page and the visibility of the text {string} on the page by clicking it")
    public void verifies_the_visibility_of_the_button_on_the_home_page_and_the_visibility_of_the_text_on_the_page_by_clicking_it(String easyLink, String text) {
        ReusableMethods.wait(7);
        card.verifyingEasyLink(easyLink,text);
        ReusableMethods.wait(7);
    }

    @Given("Sees the {string} and instance {int} button on the home page and when clicked, sees the text {string} on the page that opens.")
    public void sees_the_button_on_the_home_page_and_when_clicked_sees_the_text_on_the_page_that_opens(String className, int instance, String textContetnt) {
        ReusableMethods.wait(7);
        card.verifyingClassNameElement(className, instance, textContetnt);
        ReusableMethods.wait(7);
    }


    @Given("Goes to {string} page")
    public void goes_to_page(String desiredPage) {
        card.goesToDesiredPage(desiredPage);
    }

    @Given("Searches for the desired {string} product and sees the relevant product")
    public void searches_for_the_desired_product_and_sees_the_relevant_product(String product) {
        card.verifiesSearchBoxElement(product);
    }


    @Given("Scroll until you find the category in the Categories section.")
    public void scroll_until_you_find_the_women_category_in_the_categories_section() throws InvalidMidiDataException {
        card.womenScroll();
    }

    @Given("Click on the desired product and view it.")
    public void click_on_the_desired_product_and_view_it() {
        card.selectAndDisplayProduct();
    }
    @Given("User clicks the button with description Add To Cart")
    public void user_clicks_the_button_with_description_add_to_cart() {
        card.addToCartM();
    }


    @Given("The user logs in using the name {string} and {string}")
    public void the_user_logs_in_using_the_name_and(String userName, String password) {
        ReusableMethods.wait(4);
        card.logInWithMail(userName,password);
    }

    @Given("Verifies the {string} text on the page")
    public void verifies_the_text_on_the_page(String element) {
        card.verifiesAnyElement(element);
    }

    @Given("Verifies that past orders are displayed in the Order History section")
    public void verifies_that_past_orders_are_displayed_in_the_order_history_section() {
        card.verifyOrderHistoryInMyAccountPage();
    }

    @Given("Sees the {string} and instance {int} element on the any page and when clicked and enters the text {string} on the page that opens.")
    public void sees_the_and_instance_element_on_the_any_page_and_when_clicked_and_enters_the_text_on_the_page_that_opens(String className, Integer instance, String sendKeys) {
        card.sendKeysWithClassName(className,instance,sendKeys);
    }


    @Given("Favourite icon must be visible and active on products")
    public void favourite_icon_must_be_visible_and_active_on_products() {
        card.favouriteIconDisibleAndActive();
    }
    @Given("Verify that you have gone to the login page")
    public void verify_that_you_have_gone_to_the_login_page() {
        card.verifyLoginPageisdisplayed();
    }

    @Given("Click first product from home page")
    public void click_first_product_from_home_page() {
        ReusableMethods.wait(1);
        card.firstProduct.click();
    }
    @Given("Verifies the visibility of first product {string} button on the home page and the visibility of the text {string} on the page by clicking it")
    public void verifies_the_visibility_of_first_product_button_on_the_home_page_and_the_visibility_of_the_text_on_the_page_by_clicking_it(String section, String content) throws InvalidMidiDataException {
        ReusableMethods.wait(3);
        OptionsMet.swipe(499, 1986, 530, 841);
        card.verifyingProductDetailsAndContents(section,content);
    }
}
