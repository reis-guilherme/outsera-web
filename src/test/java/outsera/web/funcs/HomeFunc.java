package outsera.web.funcs;

import outsera.web.common.BaseTest;
import outsera.web.pages.HomePage;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public void realizarLogout(){
        driver.findElement(homePage.getBotaoMenu()).click();
        driver.findElement(homePage.getBotaoLogout()).click();
    }

    public boolean validaLogin(){
        return driver.findElement(homePage.getListaProdutos()).isDisplayed();
    }

    public void selecionarProdutoCarrinho(){
        driver.findElement(homePage.getAddToCartBackPack()).click();

    }

    public void acessarCarrinho(){
        driver.findElement(homePage.getLinkCarrinho()).click();
    }
}
