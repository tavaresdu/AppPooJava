package testes;

import javax.swing.*;
import java.util.ArrayList;

public class TestaListas {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        for (int i = 0; i < Integer.getInteger(args[0]); i++) {
            nomes.add(JOptionPane.showInputDialog(
                    "Informe o nome do " + i + 1 + "º aluno:"
            ));
        }
    }
}
