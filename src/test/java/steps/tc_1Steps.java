import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;

public class tc_1Steps {

    private WebDriver driver;
    private tc_1Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver = new WebDriver(); // Inicializa tu WebDriver apropiadamente
        loginPage = PageFactory.initElements(driver, tc_1Page.class);
        driver.get("https://miaplicacion.com/login");
    }

    @When("el usuario ingresa el nombre de usuario {string}")
    public void el_usuario_ingresa_el_nombre_de_usuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("el usuario ingresa la contraseña {string}")
    public void el_usuario_ingresa_la_contraseña(String password) {
        loginPage.enterPassword(password);
    }

    @And("el usuario hace clic en el botón de iniciar sesión")
    public void el_usuario_hace_clic_en_el_botón_de_iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("el usuario debería ser redirigido al dashboard")
    public void el_usuario_debería_ser_redirigido_al_dashboard() {
        // Aquí se comprueba que la URL o algún elemento de la página del dashboard esté presente
        assertTrue(driver.getCurrentUrl().contains("/dashboard"));
    }
}