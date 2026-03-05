package outsera.web.pages;

import org.openqa.selenium.By;

public class LoginPage {

    By campoEmailRegistrado = By.id("user-name");
    By campoSenhaRegistrada = By.id("password");
    By botaoEntrar = By.id("login-button");
    By erroMensagemLogin = By.xpath("//h3[@data-test='error']");


    public By getCampoEmailRegistrado() {return campoEmailRegistrado;}

    public By getCampoSenhaRegistrada() {return campoSenhaRegistrada;}

    public By getBotaoEntrar() {return botaoEntrar;}

    public By erroMensagemLogin() {
        return erroMensagemLogin;
    }
}
