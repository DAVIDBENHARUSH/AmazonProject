package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoToMain {
    @FindBy(how = How.XPATH, using = "//div[@class='buttons']")
    public WebElement Go_ToMenu;
}
