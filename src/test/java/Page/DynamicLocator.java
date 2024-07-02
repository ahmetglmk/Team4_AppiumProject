package Page;

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

}
