package testes;

import negocio.Aluno;

public class TestaAlunoSobrecarga {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(args[0]);
        a1.ano_nascimento = Integer.valueOf(args[1]);
        a1.mensalidade = Float.valueOf(args[2]);
        a1.bolsista = Boolean.valueOf(args[3]);
        a1.exibir();

        Aluno a2 = new Aluno(args[0], Integer.valueOf(args[1]));
        a2.mensalidade = Float.valueOf(args[2]);
        a2.bolsista = Boolean.valueOf(args[3]);
        a2.exibir();

        Aluno a3 = new Aluno(args[0], Integer.valueOf(args[1]),
                Float.valueOf(args[2]));
        a3.exibir(Boolean.valueOf(args[3]));

        new Aluno(args[0], Integer.valueOf(args[1]), Float.valueOf(args[2]),
                Boolean.valueOf(args[3])).exibir();

        new Aluno().exibir();
    }
}
