package pages;

public class CadastroUsuarioInvalidoPages {
    String nome = "Guilherme";
    String senha = "12345678";
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
        CadastroUsuarioValidoPage emaildeTeste = new CadastroUsuarioValidoPage();

            return  emaildeTeste.emailFormatado();
    }
}
