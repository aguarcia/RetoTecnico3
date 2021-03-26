Feature: Información de Productos de Inversiones
  Yo como cliente
  Quiero una pagina web del banco
  Para informarme sobre los productos de inversion

  Scenario: Descargar Reglamento de Inversion
    Given Agustin ingresa a la web de Bancolombia
    When navega hasta los productos de inversion
    And selecciona el reglamente de inversion
    Then se realiza la descarga de un documento PDF