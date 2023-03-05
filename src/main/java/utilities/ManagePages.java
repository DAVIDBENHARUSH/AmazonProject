package utilities;

import org.openqa.selenium.support.PageFactory;


public class ManagePages extends Base {
     public static void initNopcommerce(){

          NopcommerceLogin = PageFactory.initElements(driver,pageObjects.nopcommerce.LoginPage.class);
          NopcommerceMain = PageFactory.initElements(driver,pageObjects.nopcommerce.MainPage.class);
          NopcommerceTopMenu = PageFactory.initElements(driver,pageObjects.nopcommerce.TopMenuPage.class);
          NopcommerceComputers = PageFactory.initElements(driver,pageObjects.nopcommerce.ComputersPage.class);
          NopcommerceDesktops = PageFactory.initElements(driver,pageObjects.nopcommerce.DesktopPage.class);
          NopcommerceLenovo = PageFactory.initElements(driver,pageObjects.nopcommerce.ShoppingCartLenovo.class);
          NopcommerceCheckout = PageFactory.initElements(driver,pageObjects.nopcommerce.CheckoutPage.class);
          goToMain = PageFactory.initElements(driver,pageObjects.nopcommerce.GoToMain.class);



     }
}
