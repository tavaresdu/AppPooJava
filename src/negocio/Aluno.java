package negocio;

public class Aluno {
    public String nome;
    public int ano_nascimento;
    public float mensalidade;
    public boolean bolsista;

    public Aluno() {
        this.nome = "Aluno desconhecido";
        this.ano_nascimento = 2018;
        this.mensalidade = 999;
        this.bolsista = true;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    public Aluno(String nome, int ano_nascimento, float mensalidade) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.mensalidade = mensalidade;
    }

    public Aluno(String nome, int ano_nascimento, float mensalidade,
                 boolean bolsista) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.mensalidade = mensalidade;
        this.bolsista = bolsista;
    }

    public void exibir() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nome: " + this.nome + "\n");
        builder.append("Ano de Nascimento: " + this.ano_nascimento + "\n");
        builder.append("Mensalidade: " + this.mensalidade + "\n");
        builder.append("Bolsista: " + (this.bolsista ? "Sim" : "Não"));
        System.out.println(builder.toString());
    }

    public void exibir(Boolean bolsista) {
        this.bolsista = bolsista;
        this.exibir();
    }

    public void exibir(String[] notas) {
        float notas_soma = 0;
        for (String nota : notas) {
            notas_soma += Float.valueOf(nota);
        }
        this.exibir();
        System.out.println("Média = " + (notas_soma / notas.length));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Aluno &&
                ((Aluno) o).nome.toLowerCase().equals(this.nome.toLowerCase()) &&
                ((Aluno) o).ano_nascimento == this.ano_nascimento) {
            return true;
        } else {
            return false;
        }
    }
}
