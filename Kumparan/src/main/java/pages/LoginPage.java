package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private By buttonDaftarSekarang = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[5]/a");
    private By inputEmail = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/input");
    private By inputPassword = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/input");
    private By buttonMasuk = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[4]/button/div");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(inputEmail));
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickButtonMasuk(){
        driver.findElement(buttonMasuk).click();
    }


    /*public void clickDaftarSekarang() {
        *//*WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(buttonDaftarSekarang));*//*
        *//*WebElement element = driver.findElement(buttonDaftarSekarang);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("scroll(0, 250)");
        element.click();*//*
        WebElement element = driver.findElement(buttonDaftarSekarang);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }*/
}
