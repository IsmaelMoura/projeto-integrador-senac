package model;

public class JavaBeans {
	
	private String id_cli;
	private String nome_cli;
	private String sobrenome_cli;
	private String email_cli;
	private String telefone_cli;
	private String senha_cli;
	
	private String email_login;
	private String senha_login;
	
	public JavaBeans() {
		super();
	}

	public String getEmail_login() {
		return email_login;
	}

	public void setEmail_login(String email_login) {
		this.email_login = email_login;
	}

	public String getSenha_login() {
		return senha_login;
	}

	public void setSenha_login(String senha_login) {
		this.senha_login = senha_login;
	}
	
	public String getId_cli() {
		return id_cli;
	}
	public void setId_cli(String id_cli) {
		this.id_cli = id_cli;
	}
	public String getNome_cli() {
		return nome_cli;
	}
	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}
	public String getSobrenome_cli() {
		return sobrenome_cli;
	}
	public void setSobrenome_cli(String sobrenome_cli) {
		this.sobrenome_cli = sobrenome_cli;
	}
	public String getEmail_cli() {
		return email_cli;
	}
	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}
	public String getTelefone_cli() {
		return telefone_cli;
	}
	public void setTelefone_cli(String telefone_cli) {
		this.telefone_cli = telefone_cli;
	}
	public String getSenha_cli() {
		return senha_cli;
	}
	public void setSenha_cli(String senha_cli) {
		this.senha_cli = senha_cli;
	}
}
