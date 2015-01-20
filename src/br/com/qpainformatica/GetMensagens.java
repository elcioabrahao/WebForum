package br.com.qpainformatica;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetMensagens
 */
@WebServlet("/GetMensagens")
public class GetMensagens extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMensagens() {
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
		String id = request.getParameter("id");
		String resposta = "falhou";
		Connection conn = DatabaseConnection.getConnection();
		List<Cliente> lista;
		
		if(id !=null){
			
			Gson gson = new Gson();
			MensagemDao cd = new MensagemDao();
			try {
				resposta=gson.toJson(cd.loadAllFromId(conn, Integer.parseInt(id)));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e){
				e.printStackTrace();
			}

			
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
