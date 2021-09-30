package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrendingPage {
    private WebDriver driver;
    private By brita1 = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div/nav/div[2]/div/div[1]/div/div[1]/div/div/div[1]/a/span");

    public TrendingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DetailPage clickBrita1(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(brita1));
        driver.findElement(brita1).click();
        return new DetailPage(driver);
    }
}
