package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Tc_9Page {

    WebDriver driver;

    private By campoBusqueda = By.id("search-input");
    private By botonBusqueda = By.id("search-button");
    private By resultados = By.cssSelector(".search-results .result-item");

    public Tc_9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarTerminoDeBusqueda(String termino) {
        driver.findElement(campoBusqueda).clear();
        driver.findElement(campoBusqueda).sendKeys(termino);
    }

    public void ejecutarBusqueda() {
        driver.findElement(botonBusqueda).click();
    }

    public boolean resultadosSonRelevantes() {
        List<WebElement> listaResultados = driver.findElements(resultados);
        return listaResultados.size() > 0; // Implementar lógica de validación más robusta según reglas del negocio
    }
}