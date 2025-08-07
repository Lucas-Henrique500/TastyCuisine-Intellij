package inf2fm_g6.TastyCuisine.model.entity;

public class Restaurante {

    private String nomeRestaurante;
    private String nomeProprietario;
    private String CEP;
    private int Cod_Restaurante;
    private String descricao;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getCod_Restaurante() {
        return Cod_Restaurante;
    }

    public void setCod_Restaurante(int cod_Restaurante) {
        Cod_Restaurante = cod_Restaurante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
