
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/main", "/inserir", "/logar" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO();
	JavaBeans cliente = new JavaBeans();
	JavaBeans login = new JavaBeans();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Teste de conexão
		/*
		 * DAO dao = new DAO(); dao.testeConexao();
		 */
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			clientes(request, response);
		} else if (action.equals("/inserir")) {
			novoCliente(request, response);
		} else if(action.equals("/logar")) {
			acessarLogin(request, response);
		}
	}
	
	protected void clientes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.html");
	}
	
	protected void novoCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cliente.setNome_cli(request.getParameter("nome_cli"));
		cliente.setSobrenome_cli(request.getParameter("sobrenome_cli"));
		cliente.setEmail_cli(request.getParameter("email_cli"));
		cliente.setTelefone_cli(request.getParameter("telefone_cli"));
		cliente.setSenha_cli(request.getParameter("senha_cli"));
		
		dao.inserirCliente(cliente);
		
		response.sendRedirect("main");
	}
	
	protected void acessarLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login.setEmail_login(request.getParameter("email_login"));
		login.setSenha_login(request.getParameter("senha_login"));
		
		dao.logar(login);
		
		response.sendRedirect("main");
	}

}
