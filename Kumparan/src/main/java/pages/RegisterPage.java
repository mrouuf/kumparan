package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    private By inputEmail = By.className("email");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
    }
}
