package negocio;

import java.util.ArrayList;
import java.util.Calendar;

public class Cadastro {
    public String[] nomes;
    public int[] anos;
    public float[] mensalidades;
    public boolean[] bolsas;

    private void exibir(String titulo, Object[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(titulo + ":\n");
        for (Object arg : args)
            stringBuilder.append("> " + arg + "\n");
        System.out.println(stringBuilder.toString());
    }

    public void exibirNomes() {
        this.exibir("Alunos", this.nomes);
    }

    private Integer[] calculaIdades() {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        Calendar calendar = Calendar.getInstance();
        for (int ano : this.anos)
            idades.add(calendar.get(Calendar.YEAR) - ano);
        Integer[] modelo = new Integer[idades.size()];
        return idades.toArray(modelo);
    }

    public void exibirIdades() {
        this.exibir("Idades", this.calculaIdades());
    }

    private float somaMensalidades() {
        float soma = 0;
        for (float mensalidade : this.mensalidades)
            soma += mensalidade;
        return soma;
    }

    public void exibirTotalMensalidades() {
        Float[] soma = {this.somaMensalidades()};
        this.exibir("Total das mensalidades", soma);
    }

    public void exibirTotalBolsistas() {
        Integer[] bolsas = {0};
        for (boolean bolsa : this.bolsas)
            bolsas[0] += bolsa ? 1 : 0;
        this.exibir("Total de bolsistas", bolsas);
    }

    public void exibirAlunoMaisVelho() {
        String[] nome = new String[1];
        int menorAno = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < this.nomes.length; i++) {
            if (this.anos[i] < menorAno) {
                menorAno = this.anos[i];
                nome[0] = this.nomes[i];
            }
        }
        this.exibir("Aluno mais velho", nome);
    }

    public void exibirAlunoMaiorMensalidade() {
        String[] nome = new String[1];
        int maiorMensalidade = Integer.MIN_VALUE;
        for (int i = 0; i < this.nomes.length; i++) {
            if (this.mensalidades[i] > maiorMensalidade) {
                maiorMensalidade = this.anos[i];
                nome[0] = this.nomes[i];
            }
        }
        this.exibir("Aluno com maior mensalidade", nome);
    }

    public void exibirQuantidadeAlunos() {
        Integer[] quantidade = {this.nomes.length};
        this.exibir("Quantidade de alunos", quantidade);
    }

    public void exibirMediaIdade() {
        Float[] media = {0f};
        Integer[] idades = this.calculaIdades();
        for (int idade : idades) {
            media[0] += idade;
        }
        media[0] /= idades.length;
        this.exibir("Média de idade de alunos", media);
    }

    public void exibirAlunoZezinho() {
        String[] resposta = {"Não"};
        for (String nome : this.nomes) {
            if (nome.toLowerCase().equals("zezinho")) {
                resposta[0] = "Sim";
                break;
            }
        }
        this.exibir("Existe um aluno chamado Zezinho", resposta);
    }

    public void exibirMediaMensalidade() {
        Float[] media = {somaMensalidades()};
        media[0] /= this.mensalidades.length;
        this.exibir("Média de mensalidades", media);
    }
}
