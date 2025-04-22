package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_4Page {

    private WebDriver driver;
    private By forgotPasswordLink = By.id("forgot-password-link");
    private By emailInputField = By.id("email-input");
    private By submitButton = By.id("submit-button");
    private By successMessage = By.id("success-message");

    public tc_4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void clickOnForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void enterRegisteredEmail(String email) {
        driver.findElement(emailInputField).sendKeys(email);
    }

    public void submitRecoveryForm() {
        driver.findElement(submitButton).click();
    }

    public void verifyRecoveryLinkSent() {
        String message = driver.findElement(successMessage).getText();
        if (!message.contains("recovery link has been sent")) {
            throw new AssertionError("Recovery link not sent!");
        }
    }
}