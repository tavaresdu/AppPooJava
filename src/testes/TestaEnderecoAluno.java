package testes;

import negocio.Aluno;
import negocio.Endereco;
import negocio.GestaoAcademica;

import javax.swing.*;

public class TestaEnderecoAluno {

    public static void main(String[] args) {
        int qtde = Integer.valueOf(args.length > 0 ? args[0] : "1");
        Aluno[] listagemAluno = new Aluno[qtde];
        Aluno devedor = new Aluno("Gilmar", 1955);
        for (int i = 0; i < listagemAluno.length; i++) {
            int n = i + 1;
            listagemAluno[i] = new Aluno(
                    JOptionPane.showInputDialog(
                            "Informe o nome do " + n + "º aluno:"
                    ),
                    Integer.valueOf(
                            JOptionPane.showInputDialog(
                                    "Informe o ano de nascimento do " + n +
                                            "º aluno:"
                            )
                    ),
                    Float.valueOf(JOptionPane.showInputDialog(
                            "Informe a mensalidade do " + n + "º aluno:")
                    )
            );
            Endereco endereco = new Endereco(
                    JOptionPane.showInputDialog(
                            "Informe o bairro do " + n + "º aluno:"
                    ),
                    JOptionPane.showInputDialog(
                            "Informe a cidade do " + n + "º aluno:"
                    ),
                    JOptionPane.showInputDialog(
                            "Informe a UF do " + n + "º aluno:"
                    )
            );
            listagemAluno[i].setEndereco(endereco);
        }
        GestaoAcademica gestao = new GestaoAcademica();
        gestao.setAlunos(listagemAluno);
        gestao.setAlunoDevedor(devedor);
        gestao.exibir();
    }
}
