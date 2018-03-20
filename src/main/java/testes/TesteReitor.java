package testes;

import negocio.Instituicao;
import negocio.Reitor;

import java.util.ArrayList;
import java.util.List;

public class TesteReitor {

    public static void main(String[] args) {
        Reitor reitor = new Reitor();
        reitor.setNome("Fulano");
        Instituicao instituicao = new Instituicao();
        instituicao.setCodigo(1234);
        instituicao.setDescricao("Instituto INFNET");
        List<Instituicao> instituicoes = new ArrayList<Instituicao>();
        reitor.setInstituicoes(instituicoes);
        reitor.exibir();
    }
}
