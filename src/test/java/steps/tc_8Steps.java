package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_8Page;

public class tc_8Steps {
    WebDriver driver;
    tc_8Page dashboardPage;

    @Given("the user is on the main menu")
    public void theUserIsOnTheMainMenu() {
        // Assume driver is initialized and user is on the menu
        dashboardPage = new tc_8Page(driver);
    }

    @When("the user clicks on the \"Dashboard\" link")
    public void theUserClicksOnTheDashboardLink() {
        dashboardPage.clickDashboardLink();
    }

    @Then("the dashboard is displayed with relevant information")
    public void theDashboardIsDisplayedWithRelevantInformation() {
        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
    }
}