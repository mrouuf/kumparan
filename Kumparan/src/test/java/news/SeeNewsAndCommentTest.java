package news;

import base.BaseTest;
import org.testng.annotations.Test;

public class SeeNewsAndCommentTest extends BaseTest {

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
        loginPage.setPassword("789123456Kumparan");
        loginPage.clickButtonMasuk();
    }

    @Test (dependsOnMethods = "successLogin")
    public void seeNews(){
        homePage.clickTrending();
        trendingPage.clickBrita1();
    }

    @Test (dependsOnMethods = "seeNews")
    public void comentOnNews(){
        detailPage.setComment();
        detailPage.clickCommentButton();
    }



}
