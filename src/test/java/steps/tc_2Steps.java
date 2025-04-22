package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_2Page;
import static org.junit.Assert.assertTrue;

public class tc_2Steps {

    private WebDriver driver;
    private tc_2Page logoutPage;

    public tc_2Steps(WebDriver driver) {
        this.driver = driver;
        logoutPage = PageFactory.initElements(driver, tc_2Page.class);
    }

    @Given("^The user is logged in$")
    public void the_user_is_logged_in() {
        // Assuming user is already logged in
    }

    @When("^The user clicks on the logout button$")
    public void the_user_clicks_on_the_logout_button() {
        logoutPage.clickLogoutButton();
    }

    @Then("^The user should be redirected to the login page$")
    public void the_user_should_be_redirected_to_the_login_page() {
        assertTrue(logoutPage.isOnLoginPage());
    }
}