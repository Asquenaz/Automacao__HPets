package utils;

import java.util.Random;

public class DadosAcesso {
    //Dados para Login
    private String usuario = "automatizado@teste.com.br";
    private String senha = "12345678";

    //Dados para Cadastro do animal
    private String data_nasc = "01-12-2021";
    private String cor = "Preto e Branco";
    private String nome = "Aya";

    //Dados para cadastro invalido
    private String nomeCadastro = "Guilherme";
    private String senhaCadastro = "12345678";
    private String confirmacaoSenha = senhaCadastro ;

    //Dados para cadastro valido
    String nomeValido = "Guilherme Teste";
    String senhaValido = "12345678G@";
    String confirmacaoSenhaValida = senhaValido ;

    public String getNomeValido() {
        return nomeValido;
    }

    public String getSenhaValido() {
        return senhaValido;
    }

    public String getConfirmacaoSenhaValida() {
        return confirmacaoSenhaValida;
    }

    public String  getEmail() {
        return  this.usuario;
    }
    public  String getSenha(){
        return this.senha;
    }

    public String getData_nasc() {
        return this.data_nasc;
    }

    public String getCor() {
        return this.cor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNomeCadastro() {
        return nomeCadastro;
    }

    public String getSenhaCadastro() {
        return senhaCadastro;
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
