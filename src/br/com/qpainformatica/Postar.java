package br.com.qpainformatica;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Postar
 */
@WebServlet("/Postar")
public class Postar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Postar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("ISO-8859-1");
		String men = new String(request.getParameter("m").getBytes("ISO-8859-1"), "UTF-8");
		String resposta="falhou";
		Gson gson = new Gson();
		Connection conn = DatabaseConnection.getConnection();
		
		if(men != null){
			Mensagem mensagem = gson.fromJson(men, Mensagem.class);
			MensagemDao md = new MensagemDao();
			try {
				md.create(conn, mensagem);
				resposta = "ok";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resposta = "falhou";
			}
			
			
		}
		response.setContentType("text/plain; charset=ISO-8859-1");
		final PrintWriter out = response.getWriter();
		out.write(resposta);
		out.flush();
	}

}
