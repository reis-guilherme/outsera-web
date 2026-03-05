package outsera.web.funcs;

import outsera.web.common.BaseTest;
import outsera.web.pages.CheckoutPage;

public class CheckoutFunc extends BaseTest {

    CheckoutPage checkoutPage = new CheckoutPage();

    public void realizarCheckout() {
        driver.findElement(checkoutPage.getCampoPrimeiroNome()).sendKeys(faker.name().firstName());
        driver.findElement(checkoutPage.getCampoUltimoNome()).sendKeys(faker.name().lastName());
        driver.findElement(checkoutPage.getCampoCEP()).sendKeys(faker.address().zipCode());
        driver.findElement(checkoutPage.getBotaoContinue()).click();
        driver.findElement(checkoutPage.getBotaoFinalizar()).click();
    }

    public String retornaMensagemFinalizacaoCheckout(){
        return driver.findElement(checkoutPage.getRetornoMensagemFinalizacaoCheckout()).getText();
    }
}
