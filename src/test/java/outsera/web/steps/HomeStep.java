package outsera.web.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import outsera.web.funcs.HomeFunc;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Quando("realizar o logout")
    public void realizarLogout() {
        homeFunc.realizarLogout();
    }

    @Então("deve realizar o login com sucesso")
    public void devoVisualizarATelaDeLogin() {
        Assertions.assertTrue(homeFunc.validaLogin());
    }

    @E("adicionar um produto no carrinho")
    public void adicionarUmProdutoNoCarrinho() {
        homeFunc.selecionarProdutoCarrinho();
        homeFunc.acessarCarrinho();
    }


}
