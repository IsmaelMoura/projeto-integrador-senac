package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/projetoint?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

	// Conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}

	public void inserirCliente(JavaBeans cliente) {
		String SQLinsert = "insert into clientes(nome, email, telefone, senha) values(?, ?, ?, md5(?));";

		try {
			Connection con = conectar();
			// Preparar a query
			PreparedStatement pst = con.prepareStatement(SQLinsert);

			// Substituir as ?
			pst.setString(1, cliente.getNome_cli().concat(" " + cliente.getSobrenome_cli()));
			pst.setString(2, cliente.getEmail_cli());
			pst.setString(3, cliente.getTelefone_cli());
			pst.setString(4, cliente.getSenha_cli());

			// Executar SQL
			pst.executeUpdate();

			// Encerrar a conexão
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void inserirUsuario(JavaBeans usuario) {
		String SQLinsert = "insert into usuarios(nome, email, telefone, senha, perfil) values(?, ?, ?, md5(?), ?);";

		try {
			Connection con = conectar();
			// Preparar a query
			PreparedStatement pst = con.prepareStatement(SQLinsert);

			// Substituir as ?
			pst.setString(1, usuario.getNome_usu());
			pst.setString(2, usuario.getEmail_usu());
			pst.setString(3, usuario.getTelefone_usu());
			pst.setString(4, usuario.getSenha_usu());
			pst.setString(5, usuario.getPerfil_usu());

			// Executar SQL
			pst.executeUpdate();

			// Encerrar a conexão
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void inserirSolicitacao(JavaBeans solicitacao) {
		String SQLinsert = "insert into solicitacao(nome, email, carro) values(?, ?, ?);";

		try {
			Connection con = conectar();
			// Preparar a query
			PreparedStatement pst = con.prepareStatement(SQLinsert);

			// Substituir as ?
			pst.setString(1, solicitacao.getNome_soli());
			pst.setString(2, solicitacao.getEmail_soli());
			pst.setString(3, solicitacao.getCarro_soli());

			// Executar SQL
			pst.executeUpdate();

			// Encerrar a conexão
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void inserirCarro(JavaBeans carro) {
		String SQLinsert = "insert into carros(fabricante, modelo, ano, cor, combustivel, valor) values(?, ?, ?, ?, ?, ?);";

		try {
			Connection con = conectar();
			// Preparar a query
			PreparedStatement pst = con.prepareStatement(SQLinsert);

			// Substituir as ?
			pst.setString(1, carro.getFabricante_car());
			pst.setString(2, carro.getModelo_car());
			pst.setString(3, carro.getAno_car());
			pst.setString(4, carro.getCor_car());
			pst.setString(5, carro.getCombustivel_car());
			pst.setString(6, carro.getValor_car());

			// Executar SQL
			pst.executeUpdate();

			// Encerrar a conexão
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public ArrayList<JavaBeans> listaClientes() {
		ArrayList<JavaBeans> clientes = new ArrayList<JavaBeans>();
		String sqlRead = "select * from clientes order by nome";

		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlRead);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id_cli = rs.getString(1);
				String nome_cli = rs.getString(2);
				String email_cli = rs.getString(3);
				String telefone_cli = rs.getString(4);
				String senha_cli = rs.getString(5);

				// Enviando a matriz
				clientes.add(new JavaBeans(id_cli, nome_cli, email_cli, telefone_cli, senha_cli));
			}

			con.close();
			return clientes;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
	public ArrayList<JavaBeans> listaUsuarios() {
		ArrayList<JavaBeans> usuarios = new ArrayList<JavaBeans>();
		String sqlRead = "select * from usuarios order by nome";

		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlRead);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id_usu = rs.getString(1);
				String nome_usu = rs.getString(2);
				String email_usu = rs.getString(3);
				String telefone_usu = rs.getString(4);
				String senha_usu = rs.getString(5);
				String perfil_usu = rs.getString(5);

				// Enviando a matriz
				usuarios.add(new JavaBeans(id_usu, nome_usu, email_usu, telefone_usu, senha_usu, perfil_usu));
			}

			con.close();
			return usuarios;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
	public ArrayList<JavaBeans> listaSolicitacao() {
		ArrayList<JavaBeans> solicitacoes = new ArrayList<JavaBeans>();
		String sqlRead = "select * from solicitacao order by data_soli";

		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlRead);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id_soli = rs.getString(1);
				String nome_soli = rs.getString(3);
				String email_soli = rs.getString(4);
				String carro_soli = rs.getString(5);

				// Enviando a matriz
				solicitacoes.add(new JavaBeans(id_soli, nome_soli, email_soli, carro_soli));
			}

			con.close();
			return solicitacoes;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
	public ArrayList<JavaBeans> listaCarro() {
		ArrayList<JavaBeans> carros = new ArrayList<JavaBeans>();
		String sqlRead = "select * from carros order by fabricante";

		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlRead);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id_car = rs.getString(1);
				String fabricante_car = rs.getString(2);
				String modelo_car = rs.getString(3);
				String ano_car = rs.getString(4);
				String cor_car = rs.getString(5);
				String combustivel_car = rs.getString(6);
				String valor_car = rs.getString(7);

				// Enviando a matriz
				carros.add(new JavaBeans(id_car, fabricante_car, modelo_car, ano_car, cor_car, combustivel_car, valor_car));
			}

			con.close();
			return carros;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}

	public void selecionarCliente(JavaBeans cliente) {
		String sqlSelect = "select * from clientes where id_cli = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlSelect);
			pst.setString(1, cliente.getId_cli());
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				cliente.setId_cli(rs.getString(1));
				cliente.setNome_cli(rs.getString(2));
				cliente.setEmail_cli(rs.getString(3));
				cliente.setTelefone_cli(rs.getString(4));
				cliente.setSenha_cli(rs.getString(5));
			}

			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void selecionarUsuario(JavaBeans usuario) {
		String sqlSelect = "select * from usuarios where id_usu = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlSelect);
			pst.setString(1, usuario.getId_usu());
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				usuario.setId_usu(rs.getString(1));
				usuario.setNome_usu(rs.getString(2));
				usuario.setEmail_usu(rs.getString(3));
				usuario.setTelefone_usu(rs.getString(4));
				usuario.setSenha_usu(rs.getString(5));
				usuario.setPerfil_usu(rs.getString(5));
			}

			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void selecionarCarro(JavaBeans carro) {
		String sqlSelect = "select * from carros where id_car = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlSelect);
			pst.setString(1, carro.getId_car());
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				carro.setId_car(rs.getString(1));
				carro.setFabricante_car(rs.getString(2));
				carro.setModelo_car(rs.getString(3));
				carro.setAno_car(rs.getString(4));
				carro.setCor_car(rs.getString(5));
				carro.setCombustivel_car(rs.getString(6));
				carro.setValor_car(rs.getString(7));
			}

			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public void logar(JavaBeans login) {
		String SQLinsert = "select * from usuarios where email = ? and senha = md5(?);";

		try {
			Connection con = conectar();
			// Preparar a query
			PreparedStatement pst = con.prepareStatement(SQLinsert);

			// Substituir as ?
			pst.setString(1, login.getEmail_login());
			pst.setString(2, login.getSenha_login());

			// Executar SQL
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				System.out.println("ben voiando");
			} else {
				System.out.println("sai fora vagabundo");
			}

			// Encerrar a conexão
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	// CRUD Update
	public void editarCliente(JavaBeans cliente) {
		String sqlUpdate = "update clientes set nome = ?, email = ?, telefone = ?, senha = md5(?) where id_cli = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlUpdate);

			pst.setString(1, cliente.getNome_cli());
			pst.setString(2, cliente.getEmail_cli());
			pst.setString(3, cliente.getTelefone_cli());
			pst.setString(4, cliente.getSenha_cli());
			pst.setString(5, cliente.getId_cli());

			pst.executeUpdate();

			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	// CRUD Update
		public void editarUsuario(JavaBeans usuario) {
			String sqlUpdate = "update usuarios set nome = ?, email = ?, telefone = ?, senha = md5(?), perfil = ? where id_usu = ?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(sqlUpdate);

				pst.setString(1, usuario.getNome_usu());
				pst.setString(2, usuario.getEmail_usu());
				pst.setString(3, usuario.getTelefone_usu());
				pst.setString(4, usuario.getSenha_usu());
				pst.setString(5, usuario.getPerfil_usu());
				pst.setString(6, usuario.getId_usu());

				pst.executeUpdate();

				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
		public void editarCarro(JavaBeans carro) {
			String sqlUpdate = "update carros set fabricante = ?, modelo = ?, ano = ?, cor = ?, combustivel = ?, valor = ? where id_car = ?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(sqlUpdate);

				pst.setString(1, carro.getFabricante_car());
				pst.setString(2, carro.getModelo_car());
				pst.setString(3, carro.getAno_car());
				pst.setString(4, carro.getCor_car());
				pst.setString(5, carro.getCombustivel_car());
				pst.setString(6, carro.getValor_car());
				pst.setString(7, carro.getId_car());

				pst.executeUpdate();

				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	
	// CRUD Delete
	public void deletarCliente(JavaBeans cliente) {
		String sqlDelete = "delete from clientes where id_cli = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlDelete);
			pst.setString(1, cliente.getId_cli());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception]
			System.out.println(e);
		}
	}
	
	// CRUD Delete
	public void deletarUsuario(JavaBeans usuario) {
		String sqlDelete = "delete from usuarios where id_usu = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sqlDelete);
			pst.setString(1, usuario.getId_usu());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception]
			System.out.println(e);
		}
	}
	
	// CRUD Delete
		public void deletarCarro(JavaBeans carro) {
			String sqlDelete = "delete from carros where id_car = ?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(sqlDelete);
				pst.setString(1, carro.getId_car());
				pst.executeUpdate();
				con.close();
			} catch (Exception e) {
				// TODO: handle exception]
				System.out.println(e);
			}
		}

	// Teste de conexão
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
