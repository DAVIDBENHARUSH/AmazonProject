package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DesktopPage {
    @FindBy(how = How.ID, using = "products-orderby")
    public WebElement btn_sort;
    @FindBy(how = How.CLASS_NAME, using = "product-item")
    public List<WebElement> desktop_products;
    @FindBy(how = How.XPATH, using = "//div[@class='product-item'][1]")
    public WebElement btn_addLenovo;
    @FindBy(how = How.XPATH, using = "//*[@id='add-to-cart-button-3']")
    public WebElement btn_Buy_Lenovo;
    @FindBy(how = How.XPATH, using = "//a[@href='/cart'][1]")
    public WebElement Click_soppingCart;
}
