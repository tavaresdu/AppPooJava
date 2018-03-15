package testes;

import negocio.Aluno;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome(args[0]);
        aluno.setAnoNascimento(Integer.valueOf(args[1]));
        aluno.setMensalidade(Float.valueOf(args[2]));
        aluno.setBolsista(Boolean.valueOf(args[3]));
        aluno.exibir();
    }
}
