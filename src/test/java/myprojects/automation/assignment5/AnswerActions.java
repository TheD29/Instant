package myprojects.automation.assignment5;

import myprojects.automation.assignment5.model.Answers;
import myprojects.automation.assignment5.utils.logging.CustomReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnswerActions {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;
    Actions actions;

    By buttonAnswer = By.xpath("//*[@class=\"profile-wrapper\"]/button[1]");
    By titleText = By.xpath("//p[.=\"Answers\"]");

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
            Answers.workingType = driver
                    .findElement(By.xpath("//*[@class=\"working-types\"]/button[1]"))
                    .getText();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", buttonYes);
            CustomReporter.log("Step Set WorkType is Passed");
            return true;

        } catch (NoSuchElementException ex) {
            return false;
        }

    }

    public boolean clientIsntWorking() {

        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement buttonNo = driver.findElement(By.xpath("//*[@class=\"working-types\"]/button[2]"));
            Answers.workingType = driver
                    .findElement(By.xpath("//*[@class=\"working-types\"]/button[2]"))
                    .getText();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", buttonNo);
            CustomReporter.log("Step Set WorkType is Passed");
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }

    }

    public void getAnswersWhenClientIsntWork() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAnswer)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(titleText));
        List<WebElement> answers = driver.findElements(By.xpath("//*[@class=\"answer-item\"]/b"));


        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            for (int i = 0; i < answers.size() - 1; i++) {
                if (answers.get(i).equals(0)) {
                    Assert.assertEquals(answers.get(i).getText(), Answers.monthlyBudget);
                    break;
                }
            }


        } catch (NoSuchElementException e) {

        }

    }

    public void getAnswersWhenClientisWork() {

    }
}
