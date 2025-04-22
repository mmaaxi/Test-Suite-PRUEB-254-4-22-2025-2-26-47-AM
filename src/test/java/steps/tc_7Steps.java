package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_7Page;
import static org.junit.Assert.*;

public class tc_7Steps {

    WebDriver driver;
    tc_7Page userProfilePage;

    @Given("the user is logged into their account")
    public void the_user_is_logged_into_their_account() {
        // Code to ensure user is logged in
        driver = // Initialize WebDriver
        userProfilePage = new tc_7Page(driver);
        userProfilePage.login();
    }

    @When("the user navigates to the profile settings")
    public void the_user_navigates_to_the_profile_settings() {
        userProfilePage.navigateToProfileSettings();
    }

    @When("requests to delete their account")
    public void requests_to_delete_their_account() {
        userProfilePage.requestAccountDeletion();
    }

    @Then("the system should delete the user's account")
    public void the_system_should_delete_the_user_s_account() {
        boolean isDeleted = userProfilePage.isAccountDeleted();
        assertTrue("The account was not deleted successfully", isDeleted);
    }

    @Then("confirm the deletion to the user")
    public void confirm_the_deletion_to_the_user() {
        boolean isConfirmed = userProfilePage.isDeletionConfirmed();
        assertTrue("The deletion was not confirmed", isConfirmed);
    }
}