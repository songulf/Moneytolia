package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    /* public void waitUntilElementVisible(By by) {
         WebDriverWait wait = new WebDriverWait(driver, 60);
         wait.until(ExpectedConditions.visibilityOfElementLocated(by));
     }

     public void waitUntilElementClickable(By by) {
         WebDriverWait wait = new WebDriverWait(driver, 60);
         wait.until(ExpectedConditions.elementToBeClickable(by));
     }
 */
    public void click(By by) {

        driver.findElement(by).click();
    }

    public WebElement getElement(By by) {

        return driver.findElement(by);
    }

    public List<WebElement> getElements(By by) {

        return driver.findElements(by);
    }

    public void sendKeys(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }




}