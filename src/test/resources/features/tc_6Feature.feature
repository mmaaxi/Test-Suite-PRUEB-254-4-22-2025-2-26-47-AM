Feature: Actualización de perfil de usuario

  Scenario: Modificar datos del perfil y guardar los cambios
    Given el usuario está en la página de perfil
    When el usuario modifica los datos del perfil
    And guarda los cambios
    Then el sistema actualiza la información
    And muestra un mensaje de confirmación