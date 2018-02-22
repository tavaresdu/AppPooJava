package testes;

import negocio.Aluno;

public class TestaAlunoAvaliacao {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Aluno";
        aluno.ano_nascimento = 1900;
        aluno.mensalidade = 1000;
        aluno.bolsista = false;
        aluno.exibir(args);
    }
}
