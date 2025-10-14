package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.PaginaPrincipal;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CarritoDeComprasStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario ingresa a la pagina saucedemo con {string} y {string}")
    public void usuarioIngresaALaPagina(Actor actor, String usuario, String contrasena)  {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(PaginaPrincipal.class),
                Enter.keyValues(usuario).into(PaginaPrincipal.INPUT_USUARIO),
                Enter.keyValues(contrasena).into(PaginaPrincipal.INPUT_CONTRASENA),
                Click.on(PaginaPrincipal.BOTON_LOGIN)

        );
    }

    @When("Agregue dos productos al carrito {string}")
    public void AgregarProductos(String producto) {
        when(theActorInTheSpotlight()).wasAbleTo(
                Click.on(PaginaPrincipal.PRODUCTO.of(producto))
        );

    }

    @Then("el deberia ver el carrito y completar el formulario {string},{string},{string},{string}")
    public void llenarFormulario (String nombre,String apellido,String codigo,String mensaje) {
        then(theActorInTheSpotlight()).attemptsTo(
                Click.on(PaginaPrincipal.BOTON_CARRITO),
                Click.on(PaginaPrincipal.BOTON_CONTINUAR),
                Enter.keyValues(nombre).into(PaginaPrincipal.INPUT_NOMBRE),
                Enter.keyValues(apellido).into(PaginaPrincipal.INPUT_APELLIDO),
                Enter.keyValues(codigo).into(PaginaPrincipal.INPUT_CODIGO),
                Click.on(PaginaPrincipal.BOTON_FINALIZAR),
                Ensure.that(PaginaPrincipal.MENSAJE.of(mensaje)).isDisabled()
        );

    }
}
