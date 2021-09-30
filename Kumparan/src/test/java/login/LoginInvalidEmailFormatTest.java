package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginInvalidEmailFormatTest extends BaseTest {

    @Test
    public void clickTidakAlert() {
        homePage.alert_clickToDismiss();
    }

    @Test (dependsOnMethods = "clickTidakAlert")
    public void clickButtonMasuk(){
        homePage.clickLoginPage();
    }

    @Test (dependsOnMethods = "clickButtonMasuk")
    public void successLogin(){
        loginPage.setEmail("rouuf");
        loginPage.setPassword("789123456Kumparan");
        loginPage.clickButtonMasuk();
    }
}
