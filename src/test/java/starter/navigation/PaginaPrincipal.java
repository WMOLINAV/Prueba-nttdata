package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.saucedemo.com/")
public class PaginaPrincipal extends PageObject {
    public static final Target INPUT_USUARIO = Target.the("INPUT USUARIO").locatedBy("//input[@id='user-name']");
    public static final Target INPUT_CONTRASENA = Target.the("INPUT CONTRASENA").locatedBy("//input[@id='password']");
    public static final Target BOTON_LOGIN = Target.the("BOTONLOGIN").locatedBy("//input[@id='login-button']");
    public static final Target PRODUCTO_UNO = Target.the("PRODUCTO UNO").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target PRODUCTO_DOS = Target.the("PRODUCTO DOS").locatedBy("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final Target BOTON_CARRITO = Target.the("BOTON CARRITO").locatedBy("//span[@class='shopping_cart_badge']");
    public static final Target BOTON_CHECK = Target.the("BOTON CHECK").locatedBy("//button[@id='checkout']");
    public static final Target INPUT_NOMBRE = Target.the("NOMBRE").locatedBy("//input[@id='first-name']");
    public static final Target INPUT_APELLIDO = Target.the("APELLIDO").locatedBy("//input[@id='last-name']");
    public static final Target INPUT_CODIGO = Target.the("CODIGO_POSTAL").locatedBy("//input[@id='postal-code']");
    public static final Target BOTON_CONTINUAR = Target.the("CONTINUAR").locatedBy("//input[@id='continue']");
    public static final Target BOTON_FINALIZAR = Target.the("FINALIZAR").locatedBy("//button[@id='finish']");
    public static final Target MENSAJE = Target.the("MENSAJE").locatedBy("//h2[normalize-space()='{0}']");
}

