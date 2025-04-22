package steps;

import io.cucumber.java.en.*;
import pages.tc_4Page;
import utils.DriverFactory;

public class tc_4Steps {
    tc_4Page passwordRecoveryPage = new tc_4Page(DriverFactory.getDriver());

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        passwordRecoveryPage.navigateToLoginPage();
    }

    @When("the user clicks on 'Forgot Password'")
    public void the_user_clicks_on_forgot_password() {
        passwordRecoveryPage.clickOnForgotPassword();
    }

    @When("the user enters their registered email")
    public void the_user_enters_their_registered_email() {
        passwordRecoveryPage.enterRegisteredEmail("user@example.com");
    }

    @When("the user submits the password recovery form")
    public void the_user_submits_the_password_recovery_form() {
        passwordRecoveryPage.submitRecoveryForm();
    }

    @Then("a recovery link is sent to the registered email address")
    public void a_recovery_link_is_sent() {
        passwordRecoveryPage.verifyRecoveryLinkSent();
    }
}