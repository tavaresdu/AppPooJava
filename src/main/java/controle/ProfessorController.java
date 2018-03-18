package controle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProfessorController")
public class ProfessorController extends HttpServlet {
    private List<Disciplina> disciplinas;
    private Professor professor;
    private Disciplina disciplina;

    public AvaliacaoController() {
        professor = new Professor();
        disciplinas = new HashSet<Disciplina>();
        professor.setDisciplinas(disciplinas);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        professor.setNome(request.getParameter("nome"));
        disciplina = new Disciplina();
        disciplina.setCodigo(Integer.valueOf(request.getParameter("codigo")));
        disciplina.setDescricao(request.getParameter("descricao"));
        disciplinas.add(disciplina);
        professor.exibir();
        request.getRequestDispatcher("testaAvaliacaoAluno.html").forward(request, response);
    }
}
