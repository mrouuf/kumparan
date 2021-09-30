package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailPage {
    private WebDriver driver;
    private By commentArea = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/div[3]/div/div[5]/div[10]/div/div[2]/div/div/div");
    private By commentButton = By.id("track_submit_comment");

    public DetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setComment(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(commentArea));
        driver.findElement(commentArea).sendKeys("coba komen");
    }

    public void clickCommentButton(){
        driver.findElement(commentButton).click();
    }
}
