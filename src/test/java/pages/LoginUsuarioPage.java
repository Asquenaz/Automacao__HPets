package pages;

public class LoginUsuarioPage {

    private String usuario = "automatizado@teste.com.br";
    private String senha = "12345678";

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public  void Realizarlogin (String usuario, String senha){
        setUsuario(usuario);
        setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}

