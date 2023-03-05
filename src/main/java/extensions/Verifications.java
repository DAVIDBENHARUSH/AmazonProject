package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {
    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),expected);
    }
    @Step("Number Of Elements")
    public static void numberOfElements(List<WebElement> elements, int expected){
        wait.until(ExpectedConditions.visibilityOf(elements.get(elements.size() -1)));
        assertEquals(elements.size(), expected);
    }
    @Step("Visibility Of Elements (Soft-Assertion)")
    public static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(),"i'm sorry" + elem.getText() + "not displayed");
        }
        softAssert.assertAll("Some elements is not displayed ");

    }
}
