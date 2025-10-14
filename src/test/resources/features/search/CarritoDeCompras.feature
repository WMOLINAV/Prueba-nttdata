Feature: flujo de compra

  @Compras
  Scenario Outline: Agregar dos productos al carrito
    Given que el usuario ingresa a la pagina saucedemo con "<usuario>" y "<contrasena>"
    When Agregue dos productos al carrito "<producto>"
    Then el deberia ver el carrito y completar el formulario "<nombre>","<apellido>","<codigo>","<mensaje>"
    Examples:
      |@externaldata/dataEjercicio.csv|







