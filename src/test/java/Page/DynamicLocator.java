package Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class DynamicLocator {

    public DynamicLocator() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
    }
    public WebElement getDynamicElementByContentDesc(String contentDesc){
        //String path=String.format("//android.view.View[@content-desc='" + contentDesc + "']");
        return getAppiumDriver().findElement(By.xpath("//android.view.View[@content-desc='" + contentDesc + "']"));
    }
    public WebElement getDynamicElementByAccessibilityId(String idName){
        return getAppiumDriver().findElement(By.id(idName));
    }

    public WebElement getDynamicElementByClassNameWithInstance(String contentClass, int instance){
        return getAppiumDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().className("+contentClass+").instance("+instance+")"));
    }

    public WebElement getDynamicElementByClassName(String contentClass){
        return getAppiumDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().className("+contentClass+")"));
    }

}
