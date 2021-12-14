package pages;

import java.util.Random;

public class CadastroUsuarioPage {
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

        String email = "Automatizado";
        String complementoEmail = "@guilherme.com.br";
        String getEmailFinal =  email + numero + complementoEmail;

        return  getEmailFinal;
    }
}
