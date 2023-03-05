package sanity;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;

@Listeners(utilities.Listeners.class)
public class nopcommerceWeb extends CommonOps {


    @Test(description = "Test01 Verify Header")
    @Description(" This Test Verify The Login And The Main Header")
    public void test01_verifyHeader(){
        WebFlows.login("Sbh135@walla.co.il","Sbh24680");
        Verifications.verifyTextInElement(NopcommerceMain.Head_Commerce,"Welcome to our store");
        // על מנת לגלוש בדף זה יש להזין כל מספר ימים את האיייל והסיסמא ברישום אתר
    }

    @Test(description = "Test02 Desktop And Products")
    @Description("This Test Select The Price From Low To High And Verify The Products" )
    public void test02_DesktopAndProducts() {
        UIActions.mouseHover(NopcommerceTopMenu.btn_Computers,NopcommerceComputers.link_desktops);
        WebElement sortElement = NopcommerceDesktops.btn_sort;
        Select sort = new Select(sortElement);
        sort.selectByVisibleText("Price: Low to High");
        Verifications.numberOfElements(NopcommerceDesktops.desktop_products,3);
    }

    @Test(description = "Test03 Add Checkout Lenovo")
    @Description("This Test Click On Button In Check Out And Verify The Page")
    public void test03_AddCheckoutLenovo() {
        WebFlows.checkOutLenovo();
        Verifications.verifyTextInElement(NopcommerceLenovo.product_name, "Checkout");
    }

    @Test(description = "Test04 Checkout Values")
    @Description("This Test Entering The Details To The Checkout Page")
    public void test04_CheckoutValues(){
         WebElement countryElement = NopcommerceCheckout.btn_Country;
         Select country = new Select(countryElement);
         country.selectByVisibleText("Israel");
         WebFlows.checkoutDetails("atidCollage","Beit-shean","mayRabin","123","0526686864");
         Verifications.verifyTextInElement(NopcommerceCheckout.pageTitle,"Your order has been successfully processed!");
    }
    @Test(description = "Test05_VerifyMain")
    @Description("This Test Verify The Main Page ")
    public void test05_VerifyMain(){
       WebFlows.goToMain();
    }

    @Test(description = "Test06_VerifyVisibilityMain")
    @Description("This Test Verify The Products In The Main Page")
    public void test06_VerifyVisibilityMain(){
        Verifications.visibilityOfElements(NopcommerceMain.List_Menu);
    }

}
