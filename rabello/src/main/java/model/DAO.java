package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			
			//Encerrar a conexão
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void logar(JavaBeans login) {
		String SQLinsert = "select * from clientes where email = ? and senha = md5(?);";
		
		try {
			Connection con = conectar();
			// Preparar a query
			PreparedStatement pst = con.prepareStatement(SQLinsert);
			
			// Substituir as ?
			pst.setString(1, login.getEmail_login());
			pst.setString(2, login.getSenha_login());
			
			// Executar SQL
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				System.out.println("logado com cucesso");
			} else {
				System.out.println("sai fora vagabundo");
			}
			
			//Encerrar a conexão
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
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
