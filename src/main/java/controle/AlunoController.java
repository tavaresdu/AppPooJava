package controle;

import com.sun.org.apache.xpath.internal.operations.Bool;
import negocio.Aluno;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AlunoController")
public class AlunoController extends javax.servlet.http.HttpServlet {
    private Aluno[] alunos;
    private int index;

    public AlunoController() {
        this.index = 0;
        this.alunos = new Aluno[10];
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Aluno aluno = new Aluno();
        aluno.setNome(request.getParameter("name"));
        aluno.setAnoNascimento(Integer.valueOf(request.getParameter("year")));
        aluno.setMensalidade(Float.valueOf(request.getParameter("fee")));
        aluno.setBolsista(Boolean.valueOf(request.getParameter("scholarship")));
        if (Boolean.valueOf(request.getParameter("print"))) {
            for (int i = 0; i < this.index; i++) {
                PrintWriter out = response.getWriter();
                out.printf(alunos[i].obterRelatorio());
            }
        } else {
            request.getRequestDispatcher("index.html").forward(request, response);
        }
        this.alunos[this.index] = aluno;
        this.index++;
    }
}