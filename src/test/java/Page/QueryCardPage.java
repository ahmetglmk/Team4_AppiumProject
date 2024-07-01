package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.swipe;
import static utilities.OptionsMet.xPathElementClick;

@Getter
public class QueryCardPage {
   public QueryCardPage(){
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);

    }@AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]") private WebElement queryCardLogoElement;
   @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
   private WebElement profileButton;
   @AndroidFindBy (xpath = "(//android.widget.ImageView[1])[2]")
   private WebElement searchBoxElement;
   @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
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
   private   WebElement firstPopularBrands;
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

   @AndroidFindBy(accessibility ="Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00")
   private WebElement productclick;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Wishlist\"]")
    private WebElement wishList;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"S\"]")
    private WebElement productsize;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    private WebElement addToCart;
    @AndroidFindBy  (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    private WebElement bag;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Proceed to Checkout\"]")
    private WebElement proceedToCheckout;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Pick Up\"]")
    private WebElement pickUp;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Delivery\"]")
    private WebElement delivery;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Shipping Address\"]")
    private WebElement shippingAdress;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Edit\"]")
    private WebElement adressEditable;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement adressEditable1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    private WebElement updateAdress;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"oske\")")
    private WebElement ilksatırclick;
    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement bosSatır;














    public void LogoGorunurTest(){

            try {
               Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            assertTrue(queryCardLogoElement.isDisplayed());
            queryCardLogoElement.click();
        }
    public  void Login (String phoneNumber,String password){
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


    public void SearchBoxGorunurlukClickTest(){
        assertTrue(searchBoxElement.isDisplayed());
        searchBoxElement.click();
    }
    public void phoneTextBoxClickAndSendKeys(String phoneNumber){
        assertTrue(phoneTextBox.isDisplayed());
        phoneTextBox.click();
        phoneTextBox.sendKeys(phoneNumber);
    }
    public void signInLoginClick(){
        assertTrue(signInLoginButton.isDisplayed());
        signInLoginButton.click();
    }
    public void wishListToast(){
        System.out.println(addWishListToast.getText());
        assertTrue(addWishListToast.isEnabled());
    }

    public void seePopularBrands() throws InvalidMidiDataException {
        for (int i = 0; i < 2; i++) {
            swipe(600,2500,600,300);
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
}




