package controle;

import negocio.Disciplina;
import negocio.Professor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@WebServlet(name = "ProfessorController")
public class ProfessorController extends HttpServlet {
    private List<Disciplina> disciplinas;
    private Professor professor;
    private Disciplina disciplina;

    public ProfessorController() {
        professor = new Professor();
        disciplinas = new ArrayList<Disciplina>();
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
