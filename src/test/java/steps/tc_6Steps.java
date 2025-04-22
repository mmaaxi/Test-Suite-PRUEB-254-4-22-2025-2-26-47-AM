package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_6Page;
import static org.junit.Assert.assertTrue;

public class tc_6Steps {
    WebDriver driver;
    tc_6Page profilePage;

    public tc_6Steps() {
        this.driver = Hooks.driver;
        profilePage = new tc_6Page(driver);
    }

    @Given("el usuario está en la página de perfil")
    public void el_usuario_esta_en_la_pagina_de_perfil() {
        profilePage.navegarAPaginaDePerfil();
    }

    @When("el usuario modifica los datos del perfil")
    public void el_usuario_modifica_los_datos_del_perfil() {
        profilePage.modificarDatosDePerfil("NuevoNombre", "nuevoemail@example.com");
    }

    @When("guarda los cambios")
    public void guarda_los_cambios() {
        profilePage.guardarCambios();
    }

    @Then("el sistema actualiza la información")
    public void el_sistema_actualiza_la_informacion() {
        assertTrue(profilePage.esInformacionActualizadaCorrectamente());
    }

    @Then("muestra un mensaje de confirmación")
    public void muestra_un_mensaje_de_confirmacion() {
        assertTrue(profilePage.esMensajeDeConfirmacionMostrado());
    }
}