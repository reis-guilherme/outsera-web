package outsera.web.funcs;

import outsera.web.common.BaseTest;
import outsera.web.pages.LoginPage;

public class LoginFunc extends BaseTest {
    LoginPage loginPage = new LoginPage();
    public void acessarTelaLogin(){
        driver.get("https://www.saucedemo.com/");
    }

    public void realizarLogin(String usuario, String senha){
        driver.findElement(loginPage.getCampoEmailRegistrado()).sendKeys(usuario);
        driver.findElement(loginPage.getCampoSenhaRegistrada()).sendKeys(senha);
        driver.findElement(loginPage.getBotaoEntrar()).click();
    }

    public boolean validaExistenciaTelaLogin(){
        return driver.findElement(loginPage.getBotaoEntrar()).isDisplayed();
    }

    public String validarMensagemErroAutenticacao(){
        return driver.findElement(loginPage.erroMensagemLogin()).getText();
    }
}
