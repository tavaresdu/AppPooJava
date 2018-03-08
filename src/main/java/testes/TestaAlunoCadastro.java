package testes;

import negocio.Cadastro;

import java.util.Arrays;

public class TestaAlunoCadastro {

    public static void main(String[] args) {
        String[] nomes = {"Huguinho", "Zezinho", "Luizinho"};
        Integer[] anos = {1990, 2000, 2010};
        Float[] mensalidades = {600f, 500f, 400f};
        Boolean[] bolsas = {false, false, true};

        Cadastro cadastro = new Cadastro();
        cadastro.setNomes(Arrays.asList(nomes));
        cadastro.setAnos(Arrays.asList(anos));
        cadastro.setMensalidades(Arrays.asList(mensalidades));
        cadastro.setBolsas(Arrays.asList(bolsas));

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
