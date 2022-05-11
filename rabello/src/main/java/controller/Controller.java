
package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = { "/Controller", "/main", "/mainusu", "/mainsoli", "/maincar", "/inserir", "/inserirusu", "/inserircar", "/solicitar", "/select", "/selectusu", "/selectcar", "/update", "/updateusu", "/updatecar", "/delete", "/deleteusu", "/deletecar", "/deletesoli" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO();
	JavaBeans cliente = new JavaBeans();
	JavaBeans usuario = new JavaBeans();
	JavaBeans solicitacao = new JavaBeans();
	JavaBeans carro = new JavaBeans();
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
		if (action.equals("/mainusu")) {
			usuarios(request, response);
		} else if (action.equals("/main")) {
			clientes(request, response);
		} else if (action.equals("/mainsoli")) {
			solicitacoes(request, response);
		} else if (action.equals("/maincar")) {
			carros(request, response);
		} else if (action.equals("/inserir")) {
			novoCliente(request, response);
		} else if (action.equals("/solicitar")) {
			fazerSolicitacao(request, response);
		} else if (action.equals("/inserirusu")) {
			novoUsuario(request, response);
		} else if (action.equals("/inserircar")) {
			novoCarro(request, response);
		} else if (action.equals("/select")) {
			listarCliente(request, response);
		} else if (action.equals("/selectusu")) {
			listarUsuario(request, response);
		} else if (action.equals("/selectcar")) {
			listarCarro(request, response);
		} else if (action.equals("/update")) {
			alterarCliente(request, response);
		} else if (action.equals("/updateusu")) {
			alterarUsuario(request, response);
		} else if (action.equals("/updatecar")) {
			alterarCarro(request, response);
		} else if (action.equals("/delete")) {
			removerCliente(request, response);
		} else if (action.equals("/deleteusu")) {
			removerUsuario(request, response);
		} else if (action.equals("/deletecar")) {
			removerCarro(request, response);
		} else if (action.equals("/deletesoli")) {
			removerSolicitacao(request, response);
		} else {
			response.sendRedirect("index.html");
		}
		
		
	}
	
	protected void clientes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("index.html");
		
		// Receber dados da instância JavaBeans
		ArrayList<JavaBeans> lista = dao.listaClientes();
		
		// Atribui o apelido para o objeto
		request.setAttribute("clientes", lista);
		
		// Para onde será despachado
		RequestDispatcher rd = request.getRequestDispatcher("clientes/clientes.jsp");
		
		// Despacha para o caminho declarado
		rd.forward(request, response);
	}
	
	protected void usuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("index.html");
		
		// Receber dados da instância JavaBeans
		ArrayList<JavaBeans> lista = dao.listaUsuarios();
		
		// Atribui o apelido para o objeto
		request.setAttribute("usuarios", lista);
		
		// Para onde será despachado
		RequestDispatcher rd = request.getRequestDispatcher("usuarios/usuarios.jsp");
		
		// Despacha para o caminho declarado
		rd.forward(request, response);
	}
	
	protected void solicitacoes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("index.html");
		
		// Receber dados da instância JavaBeans
		ArrayList<JavaBeans> lista = dao.listaSolicitacao();
		
		// Atribui o apelido para o objeto
		request.setAttribute("solicitacoes", lista);
		
		// Para onde será despachado
		RequestDispatcher rd = request.getRequestDispatcher("solicitacoes/solicitacoes.jsp");
		
		// Despacha para o caminho declarado
		rd.forward(request, response);
	}
	
	protected void carros(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("index.html");
		
		// Receber dados da instância JavaBeans
		ArrayList<JavaBeans> lista = dao.listaCarro();
		
		// Atribui o apelido para o objeto
		request.setAttribute("carros", lista);
		
		// Para onde será despachado
		RequestDispatcher rd = request.getRequestDispatcher("carros/carros.jsp");
		
		// Despacha para o caminho declarado
		rd.forward(request, response);
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
	
	protected void fazerSolicitacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		solicitacao.setNome_soli(request.getParameter("nome_soli"));
		solicitacao.setEmail_soli(request.getParameter("email_soli"));
		solicitacao.setCarro_soli(request.getParameter("carro_soli"));
		
		dao.inserirSolicitacao(solicitacao);
		
		response.sendRedirect("index.html");
	}
	
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usuario.setNome_usu(request.getParameter("nome_usu"));
		usuario.setEmail_usu(request.getParameter("email_usu"));
		usuario.setTelefone_usu(request.getParameter("telefone_usu"));
		usuario.setSenha_usu(request.getParameter("senha_usu"));
		usuario.setPerfil_usu(request.getParameter("perfil_usu"));
		
		dao.inserirUsuario(usuario);
		
		response.sendRedirect("mainusu");
	}
	
	protected void novoCarro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		carro.setFabricante_car(request.getParameter("fabricante_car"));
		carro.setModelo_car(request.getParameter("modelo_car"));
		carro.setAno_car(request.getParameter("ano_car"));
		carro.setCor_car(request.getParameter("cor_car"));
		carro.setCombustivel_car(request.getParameter("combustivel_car"));
		carro.setValor_car(request.getParameter("valor_car"));
		
		dao.inserirCarro(carro);
		
		response.sendRedirect("maincar");
	}
	
	protected void listarCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebe o parâmetro idcon
		String id_cli = request.getParameter("id_cli");

		// testa o envio do parametro
		//System.out.println(id_cli);

		// configura o parametro no objeto
		this.cliente.setId_cli(id_cli);

		// selecionar o contato
		this.dao.selecionarCliente(cliente);

		request.setAttribute("id_cli", cliente.getId_cli());
		request.setAttribute("nome_cli", cliente.getNome_cli());
		request.setAttribute("email_cli", cliente.getEmail_cli());
		request.setAttribute("telefone_cli", cliente.getTelefone_cli());
		request.setAttribute("senha_cli", cliente.getSenha_cli());
		RequestDispatcher rd = request.getRequestDispatcher("clientes/editarcli.jsp");
		rd.forward(request, response);
	}
	
	protected void listarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebe o parâmetro idcon
		String id_usu = request.getParameter("id_usu");

		// testa o envio do parametro
		//System.out.println(id_cli);

		// configura o parametro no objeto
		this.usuario.setId_usu(id_usu);

		// selecionar o contato
		this.dao.selecionarUsuario(usuario);

		request.setAttribute("id_usu", usuario.getId_usu());
		request.setAttribute("nome_usu", usuario.getNome_usu());
		request.setAttribute("email_usu", usuario.getEmail_usu());
		request.setAttribute("telefone_usu", usuario.getTelefone_usu());
		request.setAttribute("senha_usu", usuario.getSenha_usu());
		request.setAttribute("perfil_usu", usuario.getPerfil_usu());
		RequestDispatcher rd = request.getRequestDispatcher("usuarios/editarusu.jsp");
		rd.forward(request, response);
	}
	
	protected void listarCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebe o parâmetro idcon
		String id_car = request.getParameter("id_car");

		// configura o parametro no objeto
		this.carro.setId_car(id_car);

		// selecionar o contato
		this.dao.selecionarCarro(carro);

		request.setAttribute("id_car", carro.getId_car());
		request.setAttribute("fabricante_car", carro.getFabricante_car());
		request.setAttribute("modelo_car", carro.getModelo_car());
		request.setAttribute("ano_car", carro.getAno_car());
		request.setAttribute("cor_car", carro.getCor_car());
		request.setAttribute("combustivel_car", carro.getCombustivel_car());
		request.setAttribute("valor_car", carro.getValor_car());
		RequestDispatcher rd = request.getRequestDispatcher("carros/editarcar.jsp");
		rd.forward(request, response);
	}
	
	protected void alterarCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.cliente.setId_cli(request.getParameter("id_cli"));
		this.cliente.setNome_cli(request.getParameter("nome_cli"));
		this.cliente.setEmail_cli(request.getParameter("email_cli"));
		this.cliente.setTelefone_cli(request.getParameter("telefone_cli"));
		this.cliente.setSenha_cli(request.getParameter("senha_cli"));
		
		this.dao.editarCliente(this.cliente);
		response.sendRedirect("main");
	}
	
	protected void alterarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.usuario.setId_usu(request.getParameter("id_usu"));
		this.usuario.setNome_usu(request.getParameter("nome_usu"));
		this.usuario.setEmail_usu(request.getParameter("email_usu"));
		this.usuario.setTelefone_usu(request.getParameter("telefone_usu"));
		this.usuario.setSenha_usu(request.getParameter("senha_usu"));
		this.usuario.setPerfil_usu(request.getParameter("perfil_usu"));
		
		this.dao.editarUsuario(this.usuario);
		response.sendRedirect("mainusu");
	}
	
	protected void alterarCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.carro.setId_car(request.getParameter("id_car"));
		this.carro.setFabricante_car(request.getParameter("fabricante_car"));
		this.carro.setModelo_car(request.getParameter("modelo_car"));
		this.carro.setAno_car(request.getParameter("ano_car"));
		this.carro.setCor_car(request.getParameter("cor_car"));
		this.carro.setCombustivel_car(request.getParameter("combustivel_car"));
		this.carro.setValor_car(request.getParameter("valor_car"));
		
		this.dao.editarCarro(this.carro);
		response.sendRedirect("maincar");
	}
	
	protected void removerCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id_cli = request.getParameter("id_cli");
		cliente.setId_cli(id_cli);
		dao.deletarCliente(cliente);
		response.sendRedirect("main");
	}
	
	protected void removerUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id_usu = request.getParameter("id_usu");
		usuario.setId_usu(id_usu);
		dao.deletarUsuario(usuario);
		response.sendRedirect("mainusu");
	}
	
	protected void removerCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id_car = request.getParameter("id_car");
		carro.setId_car(id_car);
		dao.deletarCarro(carro);
		response.sendRedirect("maincar");
	}
	
	protected void removerSolicitacao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id_soli = request.getParameter("id_soli");
		solicitacao.setId_soli(id_soli);
		dao.deletarSolicitacao(solicitacao);
		response.sendRedirect("mainsoli");
	}

}
