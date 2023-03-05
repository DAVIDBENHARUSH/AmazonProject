package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//div[@class='topic-block-title']/h2")
    public WebElement Head_Commerce;
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']")
    public List<WebElement> List_Menu;
}
