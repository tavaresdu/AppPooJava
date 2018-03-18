package testes;

import negocio.Reitor;
import negocio.Instituicao;

public class TesteReitor {
    Reitor reitor = new Reitor();
    reitor.setNome("Fulano");
    Instituicao instituicao = new Instituicao();
    instituicao.setCodigo(1234);
    instituicao.setDescricao("Instituto INFNET");
    List<Instituicao> instituicoes = new ArrayList<Instituicao>();
    reitor.setInstituicoes(instituicoes);
    reitor.exibir();
}
