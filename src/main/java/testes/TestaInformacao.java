package testes;

public class TestaInformacao {

    public static void main(String[] args) {
        String nome = "Eduardo";
        int ano_nascimento = 1994;
        float mensalidade = 1234.56f;
        boolean bolsista = true;

        System.out.println(
                "Nome: " + nome + "\n" +
                "Ano de Nascimento: " + ano_nascimento + "\n" +
                "Mensalidade: " + mensalidade + "\n" +
                "Bolsista: " + (bolsista ? "Sim" : "Não")
        );
    }
}
