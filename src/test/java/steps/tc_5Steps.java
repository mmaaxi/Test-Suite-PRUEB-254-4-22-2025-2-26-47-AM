import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import pages.tc_5Page;

public class tc_5Steps {
    WebDriver driver;
    tc_5Page registroPage;
    WebDriverWait wait;

    @Dado("el usuario está en la página de registro")
    public void usuarioEnPaginaDeRegistro() {
        registroPage = new tc_5Page(driver);
        registroPage.abrirPaginaDeRegistro();
    }

    @Cuando("el usuario completa el formulario de registro con información válida")
    public void usuarioCompletaFormularioDeRegistro() {
        registroPage.rellenarFormularioDeRegistro("Juan", "Perez", "juan@example.com", "password123");
        registroPage.enviarFormulario();
    }

    @Entonces("el sistema crea el usuario y redirige a la página de bienvenida")
    public void sistemaCreaUsuarioYRedirigeAPaginaDeBienvenida() {
        registroPage.verificarRedireccionPaginaBienvenida();
    }
}