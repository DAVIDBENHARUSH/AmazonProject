package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartLenovo {
    @FindBy(how = How.XPATH, using = "//*[@id='itemquantity11231']")
    public WebElement txt_qty;
    @FindBy(how = How.XPATH, using = "//*[@id='updatecart']")
    public WebElement Update_cart;
    @FindBy(how = How.XPATH, using = "//*[@id='termsofservice']")
    public WebElement ClickOnAgree;
    @FindBy(how = How.XPATH, using = "//*[@id='checkout']")
    public WebElement Checkout;
    @FindBy(how = How.XPATH, using = "//div[@class='page-title']/h1")
    public WebElement product_name;
}
