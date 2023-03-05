package workFlows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {
    @Step("Business flow : login")
    public static void login(String email, String pass){
        UIActions.updateText(NopcommerceLogin.txt_Email, email);
        UIActions.updateText(NopcommerceLogin.txt_Password, pass);
        UIActions.click(NopcommerceLogin.btn_Login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);

    }
    @Step("Business flow : checkout Lenovo")
    public static void checkOutLenovo(){
        UIActions.click(NopcommerceDesktops.btn_addLenovo);
        UIActions.click(NopcommerceDesktops.btn_Buy_Lenovo);
        UIActions.click(NopcommerceDesktops.Click_soppingCart);
        UIActions.click(NopcommerceLenovo.Update_cart);
        UIActions.click(NopcommerceLenovo.ClickOnAgree);
        UIActions.click(NopcommerceLenovo.Checkout);
    }
    @Step("Business flow : checkout Details")
    public static void checkoutDetails(String company,String city,String address,String zipPostal,String phoneNumber){
        UIActions.updateText(NopcommerceCheckout.txt_company,company);
        UIActions.updateText(NopcommerceCheckout.txt_city,city);
        UIActions.updateText(NopcommerceCheckout.txt_address,address);
        UIActions.updateText(NopcommerceCheckout.txt_zipPostal,zipPostal);
        UIActions.updateText(NopcommerceCheckout.txt_phoneNumber,phoneNumber);
        UIActions.click(NopcommerceCheckout.btn_Continue);
        UIActions.click(NopcommerceCheckout.btn_forCHeck);
        UIActions.click(NopcommerceCheckout.btn_payment);
        UIActions.click(NopcommerceCheckout.btn_InfoPayment);
        UIActions.click(NopcommerceCheckout.btn_Confirm);

    }
    @Step("Business flow : Goto Main")
    public static void goToMain(){
        UIActions.click(goToMain.Go_ToMenu);
    }
}