package controle;

import negocio.Aluno;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AlunoController")
public class AlunoController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Aluno aluno = new Aluno();
        aluno.setNome(request.getParameter("name"));
        aluno.setAnoNascimento(Integer.valueOf(request.getParameter("year")));
        aluno.setMensalidade(Float.valueOf(request.getParameter("fee")));
        aluno.setBolsista(Boolean.valueOf(request.getParameter("scholarship")));
        PrintWriter out = response.getWriter();
        out.printf(aluno.obterRelatorio());
    }
}