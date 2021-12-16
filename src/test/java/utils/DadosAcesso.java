package utils;

public class DadosAcesso {
    private String usuario = "automatizado@teste.com.br";
    private String senha = "12345678";
    private String data_nasc = "01-12-2021";
    private String cor = "Preto e Branco";
    private String nome = "Aya";


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
}
