package outsera.web.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.*;
import org.junit.jupiter.api.Assertions;
import outsera.web.funcs.LoginFunc;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();
    @Dado("que o cliente esteja na tela de login")
    public void estiverNaTelaLogin(){
        loginFunc.acessarTelaLogin();
    }

    @Quando("inserir os dados do usuário")
    public void inserirOsDadosDoUsuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.getFirst().get("usuario");
        String senha = usuario.getFirst().get("senha");
        loginFunc.realizarLogin(email, senha);
    }

    @Então("devo realizar o logout com sucesso")
    public void devoVisualizarATelaDeLogin() {
        Assertions.assertTrue(loginFunc.validaExistenciaTelaLogin());
    }

    @Então("deve exibir a mensagem {string} de login incorreto com sucesso")
    public void validarMesangemAutenticacoIncorreta(String mensagem) {
        Assertions.assertEquals(mensagem, loginFunc.validarMensagemErroAutenticacao());
    }


}
