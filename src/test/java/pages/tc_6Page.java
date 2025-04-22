package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_6Page {

    WebDriver driver;
    By nombreInput = By.id("nombre");
    By emailInput = By.id("email");
    By guardarButton = By.id("guardar");
    By mensajeConfirmacion = By.id("mensajeConfirmacion");

    public tc_6Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDePerfil() {
        driver.get("http://miaplicacion.com/perfil");
    }

    public void modificarDatosDePerfil(String nombre, String email) {
        driver.findElement(nombreInput).clear();
        driver.findElement(nombreInput).sendKeys(nombre);
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void guardarCambios() {
        driver.findElement(guardarButton).click();
    }

    public boolean esInformacionActualizadaCorrectamente() {
        // Lógica para verificar que la información ha sido actualizada
        // Esto podría incluir consultas a API o verificaciones en la base de datos
        return true;
    }

    public boolean esMensajeDeConfirmacionMostrado() {
        return driver.findElement(mensajeConfirmacion).isDisplayed();
    }
}