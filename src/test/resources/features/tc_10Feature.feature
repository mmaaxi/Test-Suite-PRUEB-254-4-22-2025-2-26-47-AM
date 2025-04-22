Feature: Exportación de reportes

  Scenario: Descargar un reporte en formato PDF
    Given el usuario está en la página de reportes
    When selecciona el reporte deseado
    And hace clic en 'Exportar'
    Then el sistema descarga el reporte en el formato PDF