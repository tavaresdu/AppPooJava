package negocio;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
    private String nome;
    private List<Documento> documentos;

    public Secretaria() {
        documentos = new ArrayList<Documento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
}
