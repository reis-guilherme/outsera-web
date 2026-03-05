package outsera.web.funcs;

import outsera.web.common.BaseTest;
import outsera.web.pages.CarrinhoPage;

public class CarrinhoFunc extends BaseTest {

    CarrinhoPage carrinhoPage = new CarrinhoPage();

    public void acessarCheckout() {
        driver.findElement(carrinhoPage.getBotaoCheckout()).click();
    }
}
