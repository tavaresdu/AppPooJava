package negocio;

import java.util.ArrayList;

public class GestaoAcademica {
    private Aluno[] alunos;
    private Aluno alunoDevedor;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno getAlunoDevedor() {
        return alunoDevedor;
    }

    public void setAlunoDevedor(Aluno alunoDevedor) {
        this.alunoDevedor = alunoDevedor;
    }

    public void exibir() {
        float somaMensalidade = 0;
        int maiorAno = Integer.MIN_VALUE;
        String resposta = "NÃO ";

        for (Aluno aluno : this.alunos) {
            if (this.alunoDevedor.equals(aluno))
                resposta = "";
            somaMensalidade += aluno.getMensalidade();
            if (maiorAno < aluno.getAnoNascimento())
                maiorAno = aluno.getAnoNascimento();
            aluno.exibir();
        }

        System.out.println("Soma de mensalidades: " + somaMensalidade);
        System.out.println("Maior ano de nascimento: " + maiorAno);
        System.out.println("O aluno devedor "+resposta+"ESTÁ na lista.");
    }
}
