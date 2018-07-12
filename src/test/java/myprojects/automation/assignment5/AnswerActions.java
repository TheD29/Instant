package myprojects.automation.assignment5;

import myprojects.automation.assignment5.utils.logging.CustomReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AnswerActions {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;
    Actions actions;

    public AnswerActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
    }

    public boolean clientIsWorking() {

        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement buttonYes = driver.findElement(By.xpath("//*[@class=\"working-types\"]/button[1]"));
            wait.until(ExpectedConditions.visibilityOf(buttonYes));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", buttonYes);
            CustomReporter.log("Step Set WorkType is Passed");
            return true;

        } catch (NoSuchElementException ex) {
            WebElement buttonNo = driver.findElement(By.xpath("//*[@class=\"working-types\"]/button[2]"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", buttonNo);
            return false;
        }

    }

    public boolean clientIsntWorking() {

        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement buttonYes = driver.findElement(By.xpath("//*[@class=\"working-types\"]/button[1]"));
            wait.until(ExpectedConditions.visibilityOf(buttonYes));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", buttonYes);
            CustomReporter.log("Step Set WorkType is Passed");
            return true;

        } catch (NoSuchElementException ex) {
            WebElement buttonNo = driver.findElement(By.xpath("//*[@class=\"working-types\"]/button[2]"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", buttonNo);
            return false;
        }

    }

    public void getAnswersWhenClientIsntWork() {

    }

    public void getAnswersWhenClientisWork() {

    }
}
