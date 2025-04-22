Feature: Inicio de sesión exitoso

  Scenario: El usuario inicia sesión con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa el nombre de usuario "usuario_valido"
    And el usuario ingresa la contraseña "contraseña_valida"
    And el usuario hace clic en el botón de iniciar sesión
    Then el usuario debería ser redirigido al dashboard