package inf2fm_g6.TastyCuisine.model.entity;

public class Chefe {

    private int idade;
    private String nome_usuario;
    private String nomeCompleto;
    private String senha;
    private String gmail;
    private int codChefe;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getCodChefe() {
        return codChefe;
    }

    public void setCodChefe(int codChefe) {
        this.codChefe = codChefe;
    }
}
