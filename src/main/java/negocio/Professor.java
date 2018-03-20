package negocio;

import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibir() {
    }
}
