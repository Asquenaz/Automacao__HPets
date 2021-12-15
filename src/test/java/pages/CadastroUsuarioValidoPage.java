package pages;

import java.util.Random;

public class CadastroUsuarioValidoPage {
    String nome = "Guilherme Teste";
    String senha = "12345678G@";
    String confirmacaoSenha = senha ;

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }


    public String emailFormatado(){
        Random random = new Random();

        int numero = random. nextInt(100);
        String complementoEmail = "@guilherme.com.br";

        return  "Automatizado" + numero + complementoEmail;
    }
}
