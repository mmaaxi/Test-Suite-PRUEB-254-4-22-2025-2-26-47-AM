import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_10Page {

    WebDriver driver;

    By reportList = By.id("reportList");
    By exportButton = By.id("exportButton");
    By downloadConfirmation = By.id("downloadConfirmation");

    public tc_10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportPage() {
        driver.get("https://example.com/reports");
    }

    public void selectDesiredReport() {
        WebElement report = driver.findElement(reportList).findElement(By.tagName("li"));
        report.click();
    }

    public void clickExportButton() {
        driver.findElement(exportButton).click();
    }

    public void verifyReportIsDownloaded(String format) {
        // Implementación para verificar que el reporte ha sido descargado en el formato necesario
        // Esto podría incluir la validación de un mensaje de confirmación de descarga
        WebElement confirmation = driver.findElement(downloadConfirmation);
        if (confirmation.isDisplayed() && confirmation.getText().contains(format)) {
            System.out.println("Reporte descargado en formato " + format);
        }
    }
}