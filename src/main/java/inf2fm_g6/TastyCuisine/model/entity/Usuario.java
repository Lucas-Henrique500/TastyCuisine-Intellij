package inf2fm_g6.TastyCuisine.model.entity;

public class Usuario {

    private String nomeCompleto;
    private String nomeUsuario;
    private int idade;
    private int Cod_user;
    private String email;
    private String senha;
    private String restriAlimentares;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCod_user() {
        return Cod_user;
    }

    public void setCod_user(int cod_user) {
        Cod_user = cod_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRestriAlimentares() {
        return restriAlimentares;
    }

    public void setRestriAlimentares(String restriAlimentares) {
        this.restriAlimentares = restriAlimentares;
    }
}
