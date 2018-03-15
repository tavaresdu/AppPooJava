package controle;

import negocio.Aluno;
import negocio.Endereco;
import negocio.GestaoAcademica;
import negocio.Universidade;

import javax.servlet.annotation.WebServlet;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UniversidadeController")
public class UniversidadeController extends javax.servlet.http.HttpServlet {
    private Aluno[] alunos;
    private int index;

    public UniversidadeController() {
        this.index = 0;
        this.alunos = new Aluno[10];
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Aluno aluno = new Aluno(request.getParameter("name_stu"),
                Integer.valueOf(request.getParameter("year_stu")),
                Float.valueOf(request.getParameter("fee_stu")));
        Endereco endereco = new Endereco(request.getParameter("district_stu"),
                request.getParameter("city_stu"),
                request.getParameter("state_stu")
        );
        Universidade universidade = new Universidade(
                request.getParameter("company_uni"),
                request.getParameter("email_uni"),
                request.getParameter("telephone_uni"),
                new Endereco(request.getParameter("district_uni"),
                        request.getParameter("city_uni"),
                        request.getParameter("state_uni"))
        );
        aluno.setEndereco(endereco);
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
