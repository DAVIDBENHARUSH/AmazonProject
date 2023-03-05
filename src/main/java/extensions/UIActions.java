package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class UIActions extends CommonOps {

    @Step("Click on Element")
    public static void click(WebElement elem) {
            wait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();

    }
    @Step("Update Text in Element")
    public static void updateText(WebElement elem, String text) {
        try {
            wait.until((ExpectedConditions.visibilityOf(elem)));
            elem.sendKeys(text);
        } catch (TimeoutException e ){
            elem.sendKeys(text);
        }

    }

    public static void updateDropDown(WebElement elem, String text) {
        try {
            wait.until((ExpectedConditions.visibilityOf(elem)));
            Select dropDown = new Select(elem);
            dropDown.selectByVisibleText(text);
        } catch (TimeoutException e){

        }
    }
    @Step("Mouse Hover from Element to other Element")
    public static void mouseHover(WebElement elem1, WebElement elem2) {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();

    }
    @Step(" Number Of Elements In The List")
    public static void numberOfElements(List<WebElement> elements, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elements.get(elements.size() - 1)));
        assertEquals(elements.size(), expected);
    }
}
