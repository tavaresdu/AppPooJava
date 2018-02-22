package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestaFaturamento {

    public static void main(String[] args) throws ParseException {
        int[] meses = {1, 3, 5, 3};
        float[] salarios = {600, 500, 400, 600};
        float[] totalAnual = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < meses.length; i++) {
            totalAnual[meses[i]] += salarios[i];
        }

        SimpleDateFormat from = new SimpleDateFormat("M");
        SimpleDateFormat to = new SimpleDateFormat("MMMM", new Locale("pt", "BR"));

        System.out.println("Faturamento:");
        for (int i = 0; i < totalAnual.length; i++) {
            System.out.print(to.format(from.parse(String.valueOf(i + 1))));
            System.out.println(" = R$ " + totalAnual[i]);
        }
    }
}
