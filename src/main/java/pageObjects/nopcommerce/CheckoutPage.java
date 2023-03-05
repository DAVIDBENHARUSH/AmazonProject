package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"BillingNewAddress_Company\"]")
    public WebElement txt_company;
    @FindBy(how = How.XPATH, using = "//*[@id=\"BillingNewAddress_City\"]")
    public WebElement txt_city;
    @FindBy(how = How.XPATH, using = "//*[@id=\"BillingNewAddress_Address1\"]")
    public WebElement txt_address;
    @FindBy(how = How.XPATH, using = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    public WebElement txt_zipPostal;
    @FindBy(how = How.XPATH, using = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    public WebElement txt_phoneNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"billing-buttons-container\"]/button[4]")
    public WebElement btn_Continue;
    @FindBy(how = How.XPATH, using = "//*[@id='BillingNewAddress_CountryId']")
    public WebElement btn_Country;
    @FindBy(how = How.XPATH, using = "//*[@id=\"shipping-method-buttons-container\"]/button")
    public WebElement btn_forCHeck;
    @FindBy(how = How.XPATH, using = "//*[@id=\"payment-method-buttons-container\"]/button")
    public WebElement btn_payment;
    @FindBy(how = How.XPATH, using = "//*[@id=\"payment-info-buttons-container\"]/button")
    public WebElement btn_InfoPayment;
    @FindBy(how = How.XPATH, using = "//*[@id=\"confirm-order-buttons-container\"]/button")
    public WebElement btn_Confirm;
    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]")
    public WebElement pageTitle;


}
