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

/**
 * Servlet implementation class Registrar
 */
@WebServlet("/Registrar")
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrar() {
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
		String nome = new String(request.getParameter("nome").getBytes("ISO-8859-1"), "UTF-8");
		String resposta = "falhou";
		Connection conn = DatabaseConnection.getConnection();
		
		if(nome !=null){
			
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			ClienteDao cd = new ClienteDao();
			try {
				cd.create(conn, cliente);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resposta = ""+cliente.getId();
			
			
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/plain; charset=ISO-8859-1");
		final PrintWriter out = response.getWriter();
		out.write(resposta);
		out.flush();
		
	}

}
