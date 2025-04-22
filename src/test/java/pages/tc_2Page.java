package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_2Page {

    private WebDriver driver;

    private By logoutButton = By.id("logoutButton");
    private By loginPageIdentifier = By.id("loginPageIdentifier");

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public boolean isOnLoginPage() {
        return driver.findElement(loginPageIdentifier).isDisplayed();
    }
}