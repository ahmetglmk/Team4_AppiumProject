package Page;


import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.swipe;

@Getter
public class QueryCardPage {
   public QueryCardPage(){
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);

    }
    DynamicLocator locator = new DynamicLocator();

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]") private WebElement queryCardLogoElement;
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


    //Arzu
    @AndroidFindBy(xpath = "//*[@content-desc='Categories']")
    private  WebElement categoriesText;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men T-Shirt\"]")
    private WebElement categoriesSubMenus;
    @AndroidFindBy(accessibility = "*Use Email Instead")
    private WebElement useEmailText;
    @AndroidFindBy(accessibility = "Profile")
    public   WebElement profilIcon;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    private WebElement emailBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private WebElement passwordBox;
    @AndroidFindBy(accessibility = "arzubuldu.manager@querycart.com")
    private WebElement verifyProfil;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign Up\"])[1]")
    private WebElement signUpPageText;





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


    //////////ARZU///////////////

    public void getLoginwithParameter(String emailName){
        ReusableMethods.wait(2);
        enterEmailForLogin(emailName);
        enterPasswordForLogin();
        signInLoginClick();}

    public void verifySignInPageElement(){
        WebElement forgotPasswordElement=locator.getDynamicElementByContentDesc("Forgot Password");
        forgotPasswordElement.click();
        ReusableMethods.wait(1);
        WebElement backToSignInElement=locator.getDynamicElementByContentDesc("Back to sign in");
        assertTrue(backToSignInElement.isDisplayed());
        backToSignInElement.click();
        ReusableMethods.wait(1);
        WebElement signUpElement= locator.getDynamicElementByContentDesc("Sign Up");
        signUpElement.click();
        ReusableMethods.wait(1);
        assertTrue(signUpPageText.isDisplayed());
        WebElement signInElement=locator.getDynamicElementByContentDesc("Sign In");
        signInElement.click();
    }
    public void loadLoginPage(){
        ReusableMethods.wait(1);
        WebElement profileIcon= locator.getDynamicElementByAccessibilityId("Profile");
        profileIcon.click();
        OptionsMet.clickButtonByDescription("Sign In");
    }
    public void enterEmailForLogin(String emailName){
        useEmailText.click();
        ReusableMethods.wait(1);
        emailBox.click();
        emailBox.sendKeys(ConfigReader.getProperty(emailName));
        OptionsMet.hideKeyboard();
    }
    public void enterPasswordForLogin(){
        passwordBox.click();
        passwordBox.sendKeys(ConfigReader.getProperty("Password"));
        OptionsMet.hideKeyboard();
    }
    public void verifyProfilPage(String profilName){
        profilIcon.click();
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText("arzubuldu.manager@querycart.com");
    }
    public void elementTextIsDisplayed(String element){
        WebElement elementLocate=locator.getDynamicElementByContentDesc(element);
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
            }}

  
 
  
  <<<<<<< ahmet

    public void verifyingAndClickEasyLinks(String easyLink){
        WebElement easyLinks = getAppiumDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + easyLink + "\")"
        ));

        assertTrue(easyLinks.isDisplayed());
        easyLinks.click();
    }

    public void verifyRelevantPageEasyLink(String text){}
   
}




