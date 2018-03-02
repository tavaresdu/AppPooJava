package testes;

import negocio.Cadastro;

public class TestaAlunoCadastro {

    public static void main(String[] args) {
        String[] nomes = {"Huguinho", "Zezinho", "Luizinho"};
        int[] anos = {1990, 2000, 2010};
        float[] mensalidades = {600, 500, 400};
        boolean[] bolsas = {false, false, true};

        Cadastro cadastro = new Cadastro();
        cadastro.setNomes(nomes);
        cadastro.setAnos(anos);
        cadastro.setMensalidades(mensalidades);
        cadastro.setBolsas(bolsas);

        cadastro.exibirNomes();
        cadastro.exibirIdades();
        cadastro.exibirTotalMensalidades();
        cadastro.exibirTotalBolsistas();
        cadastro.exibirAlunoMaisVelho();
        cadastro.exibirAlunoMaiorMensalidade();
        cadastro.exibirQuantidadeAlunos();
        cadastro.exibirMediaIdade();
        cadastro.exibirAlunoZezinho();
        cadastro.exibirMediaMensalidade();
    }
}
