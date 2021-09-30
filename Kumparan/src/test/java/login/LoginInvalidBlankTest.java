package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginInvalidBlankTest extends BaseTest {

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
        loginPage.setEmail("");
        loginPage.setPassword("");
        loginPage.clickButtonMasuk();
    }
}
