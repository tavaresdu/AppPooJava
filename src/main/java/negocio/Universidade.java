package negocio;

public class Universidade {
    private String razaoSocial;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Universidade(String razaoSocial, String email, String telefone,
                        Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibir() {
        System.out.println(this.obterRelatorio());
    }

    public String obterRelatorio() {
        return "Razão Social: " + this.razaoSocial + "\n" +
                "E-mail: " + this.email + "\n" +
                "Telefone: " + this.telefone + "\n" +
                "Endereço: " + (this.endereco);
    }
}
