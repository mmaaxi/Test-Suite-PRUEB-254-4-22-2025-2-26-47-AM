package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_7Page {

    WebDriver driver;

    By profileSettingsButton = By.id("profile-settings-button");
    By deleteAccountButton = By.id("delete-account-button");
    By confirmationMessage = By.id("confirmation-message");
    By loginIndicator = By.id("login-indicator");

    public tc_7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        // Code to log in the user
        // Assume the user is logged in if this method is called
    }

    public void navigateToProfileSettings() {
        WebElement profileSettings = driver.findElement(profileSettingsButton);
        profileSettings.click();
    }

    public void requestAccountDeletion() {
        WebElement deleteAccount = driver.findElement(deleteAccountButton);
        deleteAccount.click();
        driver.switchTo().alert().accept(); // Assuming there's an alert for confirmation
    }

    public boolean isAccountDeleted() {
        // Check if account is deleted, e.g., by trying to log back in or accessing settings
        return !driver.findElements(loginIndicator).isEmpty();
    }

    public boolean isDeletionConfirmed() {
        WebElement confirmationMsg = driver.findElement(confirmationMessage);
        return confirmationMsg.isDisplayed() && confirmationMsg.getText().contains("Your account has been deleted");
    }
}