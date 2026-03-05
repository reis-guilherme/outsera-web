package outsera.web.steps;

import io.cucumber.java.pt.*;
import org.junit.jupiter.api.Assertions;
import outsera.web.funcs.CarrinhoFunc;
import outsera.web.funcs.CheckoutFunc;

public class CheckoutStep {

    CarrinhoFunc carrinhoFunc = new CarrinhoFunc();
    CheckoutFunc checkoutFunc = new CheckoutFunc();

    @Quando("realizar o checkout")
    public void realizarCheckout() {
        carrinhoFunc.acessarCheckout();
        checkoutFunc.realizarCheckout();
    }

    @Então("deve validar mensagem de compra com sucesso {string}")
    public void deveValidarCompraComSucesso(String mensagem) {
        Assertions.assertEquals(mensagem, checkoutFunc.retornaMensagemFinalizacaoCheckout());
    }
}
