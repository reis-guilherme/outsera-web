package outsera.web.pages;

import org.openqa.selenium.By;

public class CheckoutPage {

    By campoPrimeiroNome = By.id("first-name");
    By campoUltimoNome = By.id("last-name");
    By campoCEP = By.id("postal-code");
    By botaoContinue = By.id("continue");
    By botaoFinalizar = By.id("finish");
    By retornoMensagemFinalizacaoCheckout = By.cssSelector(".complete-header");

    public By getCampoPrimeiroNome() {
        return campoPrimeiroNome;
    }

    public By getCampoUltimoNome() {
        return campoUltimoNome;
    }

    public By getCampoCEP() {
        return campoCEP;
    }

    public By getBotaoContinue() {
        return botaoContinue;
    }

    public By getBotaoFinalizar() {
        return botaoFinalizar;
    }

    public By getRetornoMensagemFinalizacaoCheckout() {
        return retornoMensagemFinalizacaoCheckout;
    }
}
