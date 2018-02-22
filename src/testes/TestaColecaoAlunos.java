package testes;

import negocio.Aluno;
import negocio.GestaoAcademica;

import javax.swing.*;

public class TestaColecaoAlunos {

    public static void main(String[] args) {
        int qtde = Integer.valueOf(args.length > 0 ? args[0] : "1");
        Aluno[] listagemAluno = new Aluno[qtde];
        Aluno devedor = new Aluno("Gilmar", 1955);
        for (int i = 0; i < listagemAluno.length; i++) {
            int n = i + 1;
//            listagemAluno[i] = new Aluno(JOptionPane.showInputDialog("Informe o nome do aluno:"));
            listagemAluno[i] = new Aluno(
                    JOptionPane.showInputDialog("Informe o nome do " + n + "º aluno:"),
                    Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de nascimento do " + n + "º aluno:")),
                    Float.valueOf(JOptionPane.showInputDialog("Informe a mensalidade do " + n + "º aluno:"))
            );
        }
        GestaoAcademica gestao = new GestaoAcademica();
        gestao.alunos = listagemAluno;
        gestao.alunoDevedor = devedor;
        gestao.exibir();
    }
}
