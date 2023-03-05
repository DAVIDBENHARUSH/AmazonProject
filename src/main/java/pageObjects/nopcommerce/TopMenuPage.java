package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopMenuPage {

    @FindBy(how = How.XPATH, using = "//a[@href='/computers']")
    public WebElement btn_Computers;
}
