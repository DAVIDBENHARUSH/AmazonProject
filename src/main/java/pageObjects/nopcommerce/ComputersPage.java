package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComputersPage {
    @FindBy(how = How.XPATH, using = "//a[@href='/desktops']")
    public WebElement link_desktops;
}
