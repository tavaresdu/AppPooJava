package negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Cadastro {
    private List<String> nomes;
    private List<Integer> anos;
    private List<Float> mensalidades;
    private List<Boolean> bolsas;

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public List<Integer> getAnos() {
        return anos;
    }

    public void setAnos(List<Integer> anos) {
        this.anos = anos;
    }

    public List<Float> getMensalidades() {
        return mensalidades;
    }

    public void setMensalidades(List<Float> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public List<Boolean> getBolsas() {
        return bolsas;
    }

    public void setBolsas(List<Boolean> bolsas) {
        this.bolsas = bolsas;
    }

    private void exibir(String titulo, List args) {
        String string = titulo + ":\n";
        for (Object arg : args)
            string += "> " + arg + "\n";
        System.out.println(string);
    }

    public void exibirNomes() {
        this.exibir("Alunos", this.nomes);
    }

    private List<Integer> calculaIdades() {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        Calendar calendar = Calendar.getInstance();
        for (int ano : this.anos)
            idades.add(calendar.get(Calendar.YEAR) - ano);
        return idades;
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
        this.exibir("Total das mensalidades", Arrays.asList(soma));
    }

    public void exibirTotalBolsistas() {
        Integer[] bolsas = {0};
        for (boolean bolsa : this.bolsas)
            bolsas[0] += bolsa ? 1 : 0;
        this.exibir("Total de bolsistas", Arrays.asList(bolsas));
    }

    public void exibirAlunoMaisVelho() {
        String[] nome = new String[1];
        int menorAno = Calendar.getInstance().get(Calendar.YEAR);
        for (int ano : anos) {
            if (ano < menorAno) {
                menorAno = ano;
                nome[0] = nomes.get(anos.indexOf(ano));
            }
        }
        this.exibir("Aluno mais velho", Arrays.asList(nome));
    }

    public void exibirAlunoMaiorMensalidade() {
        String[] nome = new String[1];
        int maiorMensalidade = Integer.MIN_VALUE;
        for (int i = 0; i < this.nomes.size(); i++) {
            if (this.mensalidades.get(i) > maiorMensalidade) {
                maiorMensalidade = this.anos.get(i);
                nome[0] = this.nomes.get(i);
            }
        }
        this.exibir("Aluno com maior mensalidade", Arrays.asList(nome));
    }

    public void exibirQuantidadeAlunos() {
        Integer[] quantidade = {this.nomes.size()};
        this.exibir("Quantidade de alunos", Arrays.asList(quantidade));
    }

    public void exibirMediaIdade() {
        Float[] media = {0f};
        List<Integer> idades = this.calculaIdades();
        for (int idade : idades) {
            media[0] += idade;
        }
        media[0] /= idades.size();
        this.exibir("Média de idade de alunos", Arrays.asList(media));
    }

    public void exibirAlunoZezinho() {
        List<String> resposta = new ArrayList<String>();
        for (String nome : this.nomes) {
            if (nome.toLowerCase().equals("zezinho")) {
                resposta.add("Sim");
                break;
            } else {
                resposta.add("Não");
                break;
            }
        }
        this.exibir("Existe um aluno chamado Zezinho", resposta);
    }

    public void exibirMediaMensalidade() {
        List<Float> media = new ArrayList<Float>();
        media.add(somaMensalidades() / this.mensalidades.size());
        this.exibir("Média de mensalidades", media);
    }
}
