package pageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {



    @FindBy(how = How.XPATH, using = "//*[@id=\"Email\"]")
    public WebElement txt_Email;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Password\"]")
    public WebElement txt_Password;
    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    public WebElement btn_Login;
}
