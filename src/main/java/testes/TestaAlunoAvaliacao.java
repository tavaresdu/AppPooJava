package testes;

import negocio.Aluno;

import java.util.Arrays;

public class TestaAlunoAvaliacao {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno");
        aluno.setAnoNascimento(1900);
        aluno.setMensalidade(1000);
        aluno.setBolsista(false);
        aluno.exibir(Arrays.asList(args));
    }
}
