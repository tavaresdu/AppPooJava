package testes;

public class TestaParametro {

    public static void main(String[] args) {
        String nome = args[0];
        int ano_nascimento = Integer.valueOf(args[1]);
        float mensalidade = Float.valueOf(args[2]);
        boolean bolsista = Boolean.valueOf(args[3]);

        System.out.println(
                "Nome: " + nome + "\n" +
                "Ano de Nascimento: " + ano_nascimento + "\n" +
                "Mensalidade: " + mensalidade + "\n" +
                "Bolsista: " + (bolsista ? "Sim" : "Não")
        );
    }
}
