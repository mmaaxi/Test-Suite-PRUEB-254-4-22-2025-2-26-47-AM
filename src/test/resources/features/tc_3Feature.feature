Feature: Autenticación con credenciales inválidas

  Scenario: Usuario intenta autenticarse con credenciales inválidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa un nombre de usuario y contraseña incorrectos
    Then el sistema muestra un mensaje de error y no permite el acceso