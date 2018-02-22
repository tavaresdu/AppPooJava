package testes;

import negocio.Aluno;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = args[0];
        aluno.ano_nascimento = Integer.valueOf(args[1]);
        aluno.mensalidade = Float.valueOf(args[2]);
        aluno.bolsista = Boolean.valueOf(args[3]);
        aluno.exibir();
    }
}
