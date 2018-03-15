package testes;

import negocio.Aluno;
import negocio.Avaliacao;
import negocio.Endereco;
import negocio.Universidade;

import java.util.ArrayList;
import java.util.List;

public class TestaAvaliacao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Eduardo");
        aluno.setAnoNascimento(1994);
        aluno.setMensalidade(2000);
        aluno.setBolsista(true);
        Endereco enderecoAluno = new Endereco(
                "Cavalcanti",
                "Rio de janeiro",
                "RJ"
        );
        aluno.setEndereco(enderecoAluno);
        Endereco enderecoUniversidade = new Endereco(
                "Centro",
                "Rio de janeiro",
                "RJ"
        );
        Universidade universidade = new Universidade(
                "Instituto INFNET",
                "infnet@infnet.edu.br",
                "+552132659874",
                enderecoUniversidade
        );
        aluno.setUniversidade(universidade);
        List<Avaliacao> avList = new ArrayList<Avaliacao>();
        Avaliacao avJava = new Avaliacao();
        avJava.setNomeDisciplina("Java");
        avJava.setProva1(8);
        avJava.setTrabalho1(6);
        avJava.setProva2(7);
        avJava.setProva2(9.5f);
        avList.add(avJava);
        Avaliacao avRedes = new Avaliacao();
        avRedes.setNomeDisciplina("Redes");
        avRedes.setProva1(7.8f);
        avRedes.setTrabalho1(4);
        avRedes.setProva2(9);
        avRedes.setProva2(8);
        avList.add(avRedes);
    }
}
