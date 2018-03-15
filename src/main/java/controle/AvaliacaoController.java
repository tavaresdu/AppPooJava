package controle;

import negocio.Aluno;
import negocio.Avaliacao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@WebServlet("/AvaliacaoController")
public class AvaliacaoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Set<Avaliacao> avaliacoes;
    private Aluno aluno;
    private Avaliacao avaliacao;

    public AvaliacaoController() {
        super();
        aluno = new Aluno();

        avaliacoes = new HashSet<Avaliacao>();

        aluno.setAvaliacoes(avaliacoes);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        aluno.setNome(request.getParameter("aluno_select"));
        avaliacao = new Avaliacao();
        avaliacao.setNomeDisciplina(request.getParameter("disciplina_select"));
        avaliacao.setProva1(Float.valueOf(request.getParameter("p1")));
        avaliacao.setProva2(Float.valueOf(request.getParameter("p2")));
        avaliacao.setTrabalho1(Float.valueOf(request.getParameter("t1")));
        avaliacao.setTrabalho2(Float.valueOf(request.getParameter("t2")));
        avaliacoes.add(avaliacao);
        aluno.exibir();
        request.getRequestDispatcher("testaAvaliacaoAluno.html").forward(request, response);
    }
}
