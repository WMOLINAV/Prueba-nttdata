Feature:Ejercicio de APIS

  Background:
    * url baseUrl

  Scenario: Agregar una nueva mascota a la tienda
    Given request { "id": 12345, "name": "Doggie", "status": "available" }
    When method POST
    And path 'pet'
    Then status 200
    And match response.id == 12345

  Scenario: Obtener  la mascota por identificacion
    Given path 'pet', 12345
    When method GET
    Then status 200
    And match response.name == 'Doggie'

  Scenario: Actualizar el nombre y el estado de la mascota
    Given request { "id": 12345, "name": "DoggieUpdated", "status": "sold" }
    When method PUT
    And path 'pet'
    Then status 200
    And match response.status == 'sold'

  Scenario: Buecar mascotas por estado
    Given path 'pet/findByStatus'
    And param status = 'sold'
    When method GET
    Then status 200
    And match response[*].status contains 'sold'
