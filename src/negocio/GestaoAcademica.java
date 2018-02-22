package negocio;

import java.util.ArrayList;

public class GestaoAcademica {
    public Aluno[] alunos;
    public Aluno alunoDevedor;

    public void exibir() {
        float somaMensalidade = 0;
        int maiorAno = Integer.MIN_VALUE;
        String resposta = "NÃO ";

        for (Aluno aluno : this.alunos) {
            if (this.alunoDevedor.equals(aluno))
                resposta = "";
            somaMensalidade += aluno.mensalidade;
            if (maiorAno < aluno.ano_nascimento)
                maiorAno = aluno.ano_nascimento;
            aluno.exibir();
        }

        System.out.println("Soma de mensalidades: " + somaMensalidade);
        System.out.println("Maior ano de nascimento: " + maiorAno);
        System.out.println("O aluno devedor "+resposta+"ESTÁ na lista.");
    }
}
