Feature: Registro de nuevo usuario

  Scenario: Registro exitoso con información válida
    Given el usuario está en la página de registro
    When el usuario completa el formulario de registro con información válida
    Then el sistema crea el usuario y redirige a la página de bienvenida