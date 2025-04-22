import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_5Page {
    WebDriver driver;

    By nombreField = By.id("nombre");
    By apellidoField = By.id("apellido");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By submitButton = By.id("submit");

    public tc_5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirPaginaDeRegistro() {
        driver.get("https://www.example.com/registro");
    }

    public void rellenarFormularioDeRegistro(String nombre, String apellido, String email, String password) {
        driver.findElement(nombreField).sendKeys(nombre);
        driver.findElement(apellidoField).sendKeys(apellido);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enviarFormulario() {
        driver.findElement(submitButton).click();
    }

    public void verificarRedireccionPaginaBienvenida() {
        // Implementación de verificación de redirección a la página de bienvenida
        // Ejemplo: Assert.assertTrue(driver.getCurrentUrl().contains("bienvenida"));
    }
}