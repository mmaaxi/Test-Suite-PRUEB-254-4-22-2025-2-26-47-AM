package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_3Page;

public class tc_3Steps {

    WebDriver driver;
    tc_3Page loginPage;

    @Given("^el usuario está en la página de inicio de sesión$")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        driver = Hooks.getDriver();
        loginPage = PageFactory.initElements(driver, tc_3Page.class);
        driver.get("http://example.com/login");
    }

    @When("^el usuario ingresa un nombre de usuario y contraseña incorrectos$")
    public void el_usuario_ingresa_credenciales_incorrectos() {
        loginPage.enterUsername("username_incorrecto");
        loginPage.enterPassword("password_incorrecto");
        loginPage.clickLoginButton();
    }

    @Then("^el sistema muestra un mensaje de error y no permite el acceso$")
    public void el_sistema_muestra_mensaje_de_error() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }
}