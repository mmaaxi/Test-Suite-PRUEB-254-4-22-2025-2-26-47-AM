package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_8Page {
    WebDriver driver;

    private By dashboardLink = By.linkText("Dashboard");
    private By dashboardContent = By.id("dashboardContent");

    public tc_8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDashboardLink() {
        driver.findElement(dashboardLink).click();
    }
    
    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardContent).isDisplayed();
    }
}