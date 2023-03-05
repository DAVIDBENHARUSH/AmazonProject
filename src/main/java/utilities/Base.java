package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pageObjects.nopcommerce.LoginPage;

public class Base {

    //General
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static Actions action;
    protected static SoftAssert softAssert;




    //Web - pageObjects
    protected static pageObjects.nopcommerce.LoginPage NopcommerceLogin;
    protected static pageObjects.nopcommerce.MainPage NopcommerceMain;
    protected static pageObjects.nopcommerce.TopMenuPage NopcommerceTopMenu;
    protected static pageObjects.nopcommerce.ComputersPage NopcommerceComputers;
    protected static pageObjects.nopcommerce.DesktopPage NopcommerceDesktops;
    protected static pageObjects.nopcommerce.ShoppingCartLenovo NopcommerceLenovo;
    protected static pageObjects.nopcommerce.CheckoutPage NopcommerceCheckout;
    protected static pageObjects.nopcommerce.GoToMain goToMain;
}
