#Lenguage: en

Feature: Reserva en Despegar

  Scenario: : Realizar una reserva de alojamiento, vuelo o paquet
    Given el usuario esta en la pagina principal de Despegar
    When selecciona una opcion de busqueda aleatoria
    And ingresa los datos de busqueda y realiza la busqueda
    Then selecciona un resultado cuyo precio esta por debajo del presupuesto
    And diligencia toda la informacion personal y de pago requerida
