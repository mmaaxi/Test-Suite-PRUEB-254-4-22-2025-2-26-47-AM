package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Tc_9Page;
import static org.junit.Assert.*;

public class Tc_9Steps {
    
    WebDriver driver;
    Tc_9Page searchPage;

    public Tc_9Steps() {
        this.driver = Hooks.getDriver();
        this.searchPage = PageFactory.initElements(driver, Tc_9Page.class);
    }

    @Given("^el usuario está en la página de búsqueda$")
    public void usuario_esta_en_pagina_de_busqueda() {
        driver.get("http://example.com/search");
    }

    @When("^el usuario ingresa \"([^\"]*)\" en el campo de búsqueda$")
    public void usuario_ingresa_termino_en_campo_de_busqueda(String terminoBusqueda) {
        searchPage.ingresarTerminoDeBusqueda(terminoBusqueda);
    }

    @When("^ejecuta la búsqueda$")
    public void ejecuta_la_busqueda() {
        searchPage.ejecutarBusqueda();
    }

    @Then("^el sistema muestra resultados filtrados acorde al término ingresado$")
    public void sistema_muestra_resultados_filtrados() {
        assertTrue(searchPage.resultadosSonRelevantes());
    }
}