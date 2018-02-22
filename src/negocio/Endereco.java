package negocio;

public class Endereco {
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String bairro, String cidade, String uf) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return this.bairro + " - " +
                this.cidade + " - " +
                this.uf;
    }

    public void exibir() {
        System.out.println(
                "Bairro: " + this.bairro + "\n" +
                "Cidade: " + this.cidade + "\n" +
                "UF: " + this.uf
        );
    }
}
