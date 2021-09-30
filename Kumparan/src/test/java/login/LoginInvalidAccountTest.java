package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginInvalidAccountTest extends BaseTest {

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
        loginPage.setEmail("rouufkumparan@gmail.com");
        loginPage.setPassword("789123456");
        loginPage.clickButtonMasuk();
    }
}
