Feature: Búsqueda de datos en la aplicación

  Scenario: El usuario busca datos a través de una palabra clave
    Given el usuario está en la página de búsqueda
    When el usuario ingresa "Selenium Testing" en el campo de búsqueda
    And ejecuta la búsqueda
    Then el sistema muestra resultados filtrados acorde al término ingresado