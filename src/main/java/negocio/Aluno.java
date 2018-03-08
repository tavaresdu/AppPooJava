package negocio;

import java.util.List;

public class Aluno {
    private String nome;
    private int anoNascimento;
    private float mensalidade;
    private boolean bolsista;
    private Endereco endereco;
    private Universidade universidade;

    public Aluno() {
        this.nome = "Aluno desconhecido";
        this.anoNascimento = 2018;
        this.mensalidade = 999;
        this.bolsista = true;
        this.endereco = new Endereco("Bairro", "Cidade", "UF");
        this.universidade = new Universidade(
                "Universidade",
                "universidade@universidade",
                "+55 21 99999-9999",
                new Endereco("Bairro", "Cidade", "UF")
        );
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int ano_nascimento) {
        this.nome = nome;
        this.anoNascimento = ano_nascimento;
    }

    public Aluno(String nome, int ano_nascimento, float mensalidade) {
        this.nome = nome;
        this.anoNascimento = ano_nascimento;
        this.mensalidade = mensalidade;
    }

    public Aluno(String nome, int ano_nascimento, float mensalidade,
                 boolean bolsista) {
        this.nome = nome;
        this.anoNascimento = ano_nascimento;
        this.mensalidade = mensalidade;
        this.bolsista = bolsista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public void exibir() {
        System.out.println(this.obterRelatorio());
    }

    public void exibir(Boolean bolsista) {
        this.bolsista = bolsista;
        this.exibir();
    }

    public void exibir(List<String> notas) {
        float notas_soma = 0;
        for (String nota : notas) {
            notas_soma += Float.valueOf(nota);
        }
        this.exibir();
        System.out.println("Média = " + (notas_soma / notas.size()));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Aluno &&
                ((Aluno) o).getNome().toLowerCase().equals(
                        this.nome.toLowerCase()) &&
                ((Aluno) o).getAnoNascimento() == this.anoNascimento) {
            return true;
        } else {
            return false;
        }
    }

    public String obterRelatorio() {
        return "Nome: " + this.nome + "\n" +
                "Ano de Nascimento: " + this.anoNascimento + "\n" +
                "Mensalidade: " + this.mensalidade + "\n" +
                "Bolsista: " + (this.bolsista ? "Sim" : "Não") + "\n" +
                (this.endereco != null ? "Endereço: " +
                        (this.endereco) + "\n" : "") +
                (this.universidade != null ? "Universidade: " +
                        this.universidade.getRazaoSocial() : "");
    }
}
