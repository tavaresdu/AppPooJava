package testes;

public class TestaParametro {

    public static void main(String[] args) {
        String nome = args[0];
        int ano_nascimento = Integer.valueOf(args[1]);
        float mensalidade = Float.valueOf(args[2]);
        boolean bolsista = Boolean.valueOf(args[3]);

        StringBuilder builder = new StringBuilder();
        builder.append("Nome: " + nome + "\n");
        builder.append("Ano de Nascimento: " + ano_nascimento + "\n");
        builder.append("Mensalidade: " + mensalidade + "\n");
        builder.append("Bolsista: " + (bolsista ? "Sim" : "Não"));
        System.out.println(builder.toString());
    }
}
