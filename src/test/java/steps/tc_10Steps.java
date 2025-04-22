import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_10Page;

public class tc_10Steps {

    tc_10Page reportPage = new tc_10Page();

    @Given("el usuario está en la página de reportes")
    public void el_usuario_esta_en_la_pagina_de_reportes() {
        reportPage.navigateToReportPage();
    }

    @When("selecciona el reporte deseado")
    public void selecciona_el_reporte_deseado() {
        reportPage.selectDesiredReport();
    }

    @When("hace clic en 'Exportar'")
    public void hace_clic_en_exportar() {
        reportPage.clickExportButton();
    }

    @Then("el sistema descarga el reporte en el formato PDF")
    public void el_sistema_descarga_el_reporte_en_el_formato_pdf() {
        reportPage.verifyReportIsDownloaded("PDF");
    }
}