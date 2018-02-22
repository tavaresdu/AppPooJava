package testes;

public class TestaInformacao {

    public static void main(String[] args) {
        String nome = "Eduardo";
        int ano_nascimento = 1994;
        float mensalidade = 1234.56f;
        boolean bolsista = true;

        StringBuilder builder = new StringBuilder();
        builder.append("Nome: " + nome + "\n");
        builder.append("Ano de Nascimento: " + ano_nascimento + "\n");
        builder.append("Mensalidade: " + mensalidade + "\n");
        builder.append("Bolsista: " + (bolsista ? "Sim" : "Não"));
        System.out.println(builder.toString());
    }
}
