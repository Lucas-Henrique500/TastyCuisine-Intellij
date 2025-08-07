package inf2fm_g6.TastyCuisine.model.entity;

public class Receitas {

    private String nomeReceita;
    private String nomeChefe;
    private String categoria;
    private int manual;
    private String descricao;
    private int Cod_chefe;
    private int Cod_receita;

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public String getNomeChefe() {
        return nomeChefe;
    }

    public void setNomeChefe(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getManual() {
        return manual;
    }

    public void setManual(int manual) {
        this.manual = manual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCod_chefe() {
        return Cod_chefe;
    }

    public void setCod_chefe(int cod_chefe) {
        Cod_chefe = cod_chefe;
    }

    public int getCod_receita() {
        return Cod_receita;
    }

    public void setCod_receita(int cod_receita) {
        Cod_receita = cod_receita;
    }
}
