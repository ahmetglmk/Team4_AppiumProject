package Page;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.*;

@Getter
public class QueryCardPage {
    public QueryCardPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    DynamicLocator locator = new DynamicLocator();
    Actions actions = new Actions(getAppiumDriver());

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    private WebElement queryCardLogoElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    private WebElement profileButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[2]")
    private WebElement searchBoxElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    private WebElement signInLoginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement phoneTextBox;

    @AndroidFindBy(accessibility = "See All")
    private WebElement seeAllIconElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement passwordTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement rememberMeCheckBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    private WebElement addWishListToast;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Blossom Boutique\"]")
    private WebElement firstPopularBrands;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement signUpNameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Register Successfully.\")")
    private WebElement successRegisterAlert;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    private WebElement useEmailButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Enter Valid Email Address\")")
    private WebElement invalidEmailText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Error\n" +
            "The phone field must be at least 7 characters.\")")
    private WebElement invalidPhoneNumberAlert;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(3)")
    private WebElement invalidPasswordAlert;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sing In To See Your Info\")")
    private WebElement signInToSeeText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\")")
    private WebElement signInButton;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private WebElement editPageEmailBox;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    private WebElement editPagePhoneBox;

    @AndroidFindBy(accessibility = "Save Changes")
    private WebElement editPageSaveChanges;

    @AndroidFindBy(accessibility = "PROFILE_UPDATE\\nProfile Updated Successfully")
    private WebElement profileUpdateAlert;

    @AndroidFindBy(accessibility = "Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00")
    private WebElement productclick;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Wishlist\"]")
    private WebElement wishList;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"S\"]")
    private WebElement productsize;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    private WebElement addToCart;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    private WebElement bag;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Proceed to Checkout\"]")
    private WebElement proceedToCheckout;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Pick Up\"]")
    private WebElement pickUp;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delivery\"]")
    private WebElement delivery;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Shipping Address\"]")
    private WebElement shippingAdress;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Edit\"]")
    private WebElement adressEditable;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement adressEditable1;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    private WebElement updateAdress;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"oske\")")
    private WebElement ilksatırclick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement bosSatır;


    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    private WebElement siteLogo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Category\"]")
    private WebElement categoryButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men\"]")
    private WebElement categoryMenButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Women\"]")
    private WebElement categoryWomenButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Juniors\"]")
    private WebElement categoryJuniorButton;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    private WebElement categoryFiltre;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    private WebElement backButton;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]")
    private WebElement productOne;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"M\"]")
    private WebElement productsizeM;


    //Arzu
    @AndroidFindBy(xpath = "//*[@content-desc='Categories']")
    private WebElement categoriesText;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men T-Shirt\"]")
    private WebElement categoriesSubMenus;
    @AndroidFindBy(accessibility = "*Use Email Instead")
    private WebElement useEmailText;
    @AndroidFindBy(accessibility = "Profile")
    public WebElement profilIcon;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    private WebElement emailBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private WebElement passwordBox;
    @AndroidFindBy(accessibility = "arzubuldu.manager@querycart.com")
    private WebElement verifyProfil;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign Up\"])[1]")
    private WebElement signUpPageText;

    // Ahmet
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]")
    private WebElement firstProductInSearch;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[6]")
    private WebElement firstOrderInMyAccountPage;


    public void LogoGorunurTest() {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(queryCardLogoElement.isDisplayed());
        queryCardLogoElement.click();
    }

    public void Login(String phoneNumber, String password) {
        Actions actions = new Actions(getAppiumDriver());
        phoneTextBoxClickAndSendKeys(ConfigReader.getProperty(phoneNumber));
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty(password)).perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        signInLoginClick();
    }


    public void SearchBoxGorunurlukClickTest() {
        assertTrue(searchBoxElement.isDisplayed());
        searchBoxElement.click();
    }

    public void phoneTextBoxClickAndSendKeys(String phoneNumber) {
        assertTrue(phoneTextBox.isDisplayed());
        phoneTextBox.click();
        phoneTextBox.sendKeys(phoneNumber);
    }

    public void signInLoginClick() {
        assertTrue(signInLoginButton.isDisplayed());
        signInLoginButton.click();
    }

    public void wishListToast() {
        System.out.println(addWishListToast.getText());
        assertTrue(addWishListToast.isEnabled());
    }

    public void seePopularBrands() throws InvalidMidiDataException {
        for (int i = 0; i < 2; i++) {
            swipe(600, 2500, 600, 300);
        }
        assertTrue(firstPopularBrands.isDisplayed());
    }

    public void signUpPhoneNumber(String fullName, String phoneNumber, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(successRegisterAlert.isDisplayed());
    }

    public void signUpEmail(String fullName, String email, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        useEmailButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(email).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(successRegisterAlert.isDisplayed());
    }

    public void signUpInvalidEmail(String fullName, String invalidEmail, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        useEmailButton.click();
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(invalidEmail).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(invalidEmailText.isDisplayed());
    }

    public void signUpInvalidPhoneNumber(String fullName, String invalidPhoneNumber, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(invalidPhoneNumber).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(invalidPhoneNumberAlert.isDisplayed());
    }

    public void signUpInvalidPassword(String fullName, String email, String invalidPassword) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        useEmailButton.click();
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(email).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(invalidPassword).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(invalidPasswordAlert.isDisplayed());
    }

    public void login() {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(queryCardLogoElement.isDisplayed());
        profileButton.click();
        assertTrue(signInToSeeText.isDisplayed());
        signInButton.click();
        phoneTextBox.sendKeys(ConfigReader.getProperty("phoneNumberMurat"));
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty("passwordMurat")).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    public void editProfile(String email, String phoneNumber) {
        editPageEmailBox.click();
        editPageEmailBox.clear();
        editPageEmailBox.sendKeys(email);
        editPagePhoneBox.click();
        editPagePhoneBox.clear();
        editPagePhoneBox.sendKeys(phoneNumber);
        editPageSaveChanges.click();
        ReusableMethods.wait(2);
        assertTrue(profileUpdateAlert.isDisplayed());
    }


    //////////ARZU///////////////

    public void getLoginwithParameter(String emailName) {
        ReusableMethods.wait(2);
        enterEmailForLogin(emailName);
        enterPasswordForLogin();
        signInLoginClick();
    }

    public void verifySignInPageElement() {
        WebElement forgotPasswordElement = locator.getDynamicElementByContentDesc("Forgot Password");
        forgotPasswordElement.click();
        ReusableMethods.wait(1);
        WebElement backToSignInElement = locator.getDynamicElementByContentDesc("Back to sign in");
        assertTrue(backToSignInElement.isDisplayed());
        backToSignInElement.click();
        ReusableMethods.wait(1);
        WebElement signUpElement = locator.getDynamicElementByContentDesc("Sign Up");
        signUpElement.click();
        ReusableMethods.wait(1);
        assertTrue(signUpPageText.isDisplayed());
        WebElement signInElement = locator.getDynamicElementByContentDesc("Sign In");
        signInElement.click();
    }

    public void loadLoginPage() {
        ReusableMethods.wait(1);
        WebElement profileIcon = locator.getDynamicElementByAccessibilityId("Profile");
        profileIcon.click();
        OptionsMet.clickButtonByDescription("Sign In");
    }

    public void enterEmailForLogin(String emailName) {
        useEmailText.click();
        ReusableMethods.wait(1);
        emailBox.click();
        emailBox.sendKeys(ConfigReader.getProperty(emailName));
        OptionsMet.hideKeyboard();
    }

    public void enterPasswordForLogin() {
        passwordBox.click();
        passwordBox.sendKeys(ConfigReader.getProperty("Password"));
        OptionsMet.hideKeyboard();
    }

    public void verifyProfilPage(String profilName) {
        profilIcon.click();
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText("arzubuldu.manager@querycart.com");
    }

    public void elementTextIsDisplayed(String element) {
        WebElement elementLocate = locator.getDynamicElementByContentDesc(element);
        assertTrue(elementLocate.isDisplayed());
    }

    public void swipeAndSelect(String element) throws InvalidMidiDataException {
        boolean productFound = false;
        while (!productFound) {
            try {
                OptionsMet.clickButtonByDescription(element);
                ReusableMethods.wait(3);
                productFound = true;
            } catch (NoSuchElementException e) {
                OptionsMet.swipe(1005, 922, 68, 918);
                ReusableMethods.wait(1);
            }
        }
    }

    public void verifyingAndClickEasyLinks(String easyLink) {
        WebElement easyLinks = getAppiumDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + easyLink + "\")"
        ));

        assertTrue(easyLinks.isDisplayed());
        easyLinks.click();
    }

    public void verifyRelevantPageEasyLink(String text) {
    }


    public void wishList() {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(wishList.isDisplayed());
        assertTrue(wishList.isEnabled());
    }


    public void productadd() {
        productclick.click();
        productsize.click();
        ReusableMethods.wait(1);


        Actions actions = new Actions(Driver.getAppiumDriver());
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();

        }
        addToCart.click();
        ReusableMethods.wait(1);
        bag.click();
    }

    public void proceedToCheckoutClick() {
        proceedToCheckout.click();
    }

    public void pickupDeliveryVisibleActive() {
        assertTrue(pickUp.isDisplayed());
        assertTrue(pickUp.isEnabled());
        ReusableMethods.wait(1);
        assertTrue(delivery.isDisplayed());
        assertTrue(delivery.isEnabled());
    }

    public void adressisdisplayed() {
        assertTrue(shippingAdress.isDisplayed());
    }

    public void adresseditable() {
        adressEditable.click();
        adressEditable1.click();
        ReusableMethods.wait(2);
        Actions actions = new Actions(getAppiumDriver());
        ilksatırclick.click();
        ilksatırclick.clear();


        ReusableMethods.wait(2);
        bosSatır.sendKeys("harun");
        OptionsMet.hideKeyboard();
        ReusableMethods.wait(1);
        updateAdress.click();
    }

    public void siteLogo() {
        OptionsMet.clickAndVerify(siteLogo);
    }

    public void categoriesisDisplayed() {
        OptionsMet.clickAndVerify(categoryButton);
    }

    public void categoryMenButtonDisplayed() {
        assertTrue(categoryMenButton.isDisplayed());
        assertTrue(categoryMenButton.isEnabled());
    }

    public void categoryWomenButtonDisplayed() {
        assertTrue(categoryWomenButton.isDisplayed());
        assertTrue(categoryWomenButton.isEnabled());
    }

    public void categoryJuniorClick() {
        categoryJuniorButton.click();
    }

    public void categoryJuniorButtonDisplayed() {
        assertTrue(categoryJuniorButton.isDisplayed());
        assertTrue(categoryJuniorButton.isEnabled());
    }

    public void filtreisDisplayed() {
        assertTrue(categoryFiltre.isDisplayed());
        assertTrue(categoryFiltre.isEnabled());
    }

    public void backButton() {
        OptionsMet.clickAndVerify(backButton);
    }

    public void orderSummaryisDisplayed() {
        Actions actions = new Actions(Driver.getAppiumDriver());
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();

        }
        OptionsMet.VerifyElementText("Subtotal");
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText("Tax");
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText("Shipping Charge");
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText("Discount");
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText("Total");
        ReusableMethods.wait(1);
    }

    public void savePayisDisibleActive() {
        OptionsMet.VerifyElementText("Save & Pay");
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementTextisEnabled("Save & Pay");
        ReusableMethods.wait(2);
    }


    // Ahmet
    public void verifyingEasyLink(String easyLink, String text) {
        OptionsMet.VerifyElementText(easyLink);
        ReusableMethods.wait(2);
        OptionsMet.clickButtonByDescription(easyLink);
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText(text);
        ReusableMethods.wait(2);
    }

    public void verifyingClassNameElement(String className, int instance, String textContent) {
        ReusableMethods.wait(2);
        assertTrue(locator.getDynamicElementByClassNameWithInstance(className, instance).isDisplayed());
        ReusableMethods.wait(3);
        locator.getDynamicElementByClassNameWithInstance(className, instance).click();
        ReusableMethods.wait(3);
        OptionsMet.VerifyElementText(textContent);
        ReusableMethods.wait(2);
    }

    public void goesToDesiredPage(String desiredPage) {
        ReusableMethods.wait(3);
        getAppiumDriver().navigate().back();
        OptionsMet.clickButtonByDescription(desiredPage);
        ReusableMethods.wait(3);
    }

    public void verifiesSearchBoxElement(String product) {
        WebElement searchBox = locator.getDynamicElementByClassName("android.widget.EditText");

        assertTrue(searchBox.isDisplayed());
        ReusableMethods.wait(2);

        ReusableMethods.wait(3);
        searchBox.sendKeys(product);
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);

        ReusableMethods.wait(3);
        assertTrue(firstProductInSearch.isDisplayed());
        ReusableMethods.wait(3);

    }


    public void womenScroll() throws InvalidMidiDataException {
        ReusableMethods.wait(5);
        for (int i = 0; i < 4; i++) {
            OptionsMet.swipe(1230, 1156, 120, 1156);
        }
        String[] categories = {
                "Women", "Women Clothing", "Woman Dresses - Skirts", "Woman T-shirt", "Woman Trousers",
                "Woman Coat", "Women Shoes", "Women Casual Shoes", "Women Classic Shoes", "Women Sneakers",
                "Women Accessories", "Women Bags", "Women Watch", "Women Jewelry"};
        int i = 0;
        for (String category : categories) {
            i++;
            OptionsMet.VerifyElementText(category);
            if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18 || i == 21 || i == 24) {
                OptionsMet.swipe(1282, 1156, 360, 1156);
                ReusableMethods.wait(1);
            }
            By degisken = MobileBy.AndroidUIAutomator("new UiSelector().description(\"" + category + "\")");
            assertTrue(degisken.toString().contains(category));
        }
    }

    public void selectAndDisplayProduct() {
        assertTrue(productOne.isDisplayed());
        productOne.click();
    }

    public void addToCartM() {
        productsizeM.click();

        Actions actions = new Actions(Driver.getAppiumDriver());
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
        addToCart.click();

    }

    public void logInWithMail(String userName, String password) {
        ReusableMethods.wait(2);

        OptionsMet.clickButtonByDescription("Profile");
        OptionsMet.clickButtonByDescription("Sign In");
        useEmailText.click();
        ReusableMethods.wait(2);

        emailBox.click();
        emailBox.sendKeys(userName + ".manager@querycart.com");
        OptionsMet.hideKeyboard();
        ReusableMethods.wait(2);

        passwordBox.click();
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        OptionsMet.hideKeyboard();

        signInLoginButton.click();
    }


    public void verifiesAnyElement(String element) {
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText(element);
    }

    public void verifyOrderHistoryInMyAccountPage() {
        ReusableMethods.wait(2);
        assertTrue(firstOrderInMyAccountPage.isDisplayed() && firstOrderInMyAccountPage.isEnabled());

    }
}




