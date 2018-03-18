package negocio;

public class Avaliacao {
    private String nomeDisciplina;
    private float prova1;
    private float trabalho1;
    private float prova2;
    private float trabalho2;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getTrabalho1() {
        return trabalho1;
    }

    public void setTrabalho1(float trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float getTrabalho2() {
        return trabalho2;
    }

    public void setTrabalho2(float trabalho2) {
        this.trabalho2 = trabalho2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Avaliacao other = (Avaliacao) obj;
        if (nomeDisciplina == null) {
            if (other.nomeDisciplina != null)
                return false;
        } else if (!nomeDisciplina.equals(other.nomeDisciplina))
            return false;
        return true;
    }

    public void exibir() {
        System.out.println(this.obterRelatorio());
    }

    public String obterRelatorio() {
        return "Disciplina: " + this.nomeDisciplina + "\n" +
                "Prova 1: " + this.prova1 + "\n" +
                "Trabalho 1: " + this.trabalho1 + "\n" +
                "Prova 2: " + this.prova2 + "\n" +
                "trabalho 2: " + this.trabalho2 + "\n" +
                "Média: " + this.calculaMedia() + "\n";
    }

    private float calculaMedia() {
        return (this.prova1 + this.trabalho1) * 0.4f +
                (this.prova2 + this.trabalho2) * 0.6f;
    }
}
