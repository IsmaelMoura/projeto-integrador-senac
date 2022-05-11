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
	private boolean valid;

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	private String id_usu;
	private String nome_usu;
	private String email_usu;
	private String telefone_usu;
	private String senha_usu;
	private String perfil_usu;
	
	private String id_car;
	private String fabricante_car;
	private String modelo_car;
	private String ano_car;
	private String cor_car;
	private String combustivel_car;
	
	public String getCombustivel_car() {
		return combustivel_car;
	}

	public void setCombustivel_car(String combustivel_car) {
		this.combustivel_car = combustivel_car;
	}

	private String valor_car;
	
	public JavaBeans(String id_car, String fabricante_car, String modelo_car, String ano_car, String cor_car, String combustivel_Car,
			String valor_car) {
		super();
		this.id_car = id_car;
		this.fabricante_car = fabricante_car;
		this.modelo_car = modelo_car;
		this.ano_car = ano_car;
		this.cor_car = cor_car;
		this.valor_car = valor_car;
	}

	public String getId_car() {
		return id_car;
	}

	public void setId_car(String id_car) {
		this.id_car = id_car;
	}

	public String getFabricante_car() {
		return fabricante_car;
	}

	public void setFabricante_car(String fabricante_car) {
		this.fabricante_car = fabricante_car;
	}

	public String getModelo_car() {
		return modelo_car;
	}

	public void setModelo_car(String modelo_car) {
		this.modelo_car = modelo_car;
	}

	public String getAno_car() {
		return ano_car;
	}

	public void setAno_car(String ano_car) {
		this.ano_car = ano_car;
	}

	public String getCor_car() {
		return cor_car;
	}

	public void setCor_car(String cor_car) {
		this.cor_car = cor_car;
	}

	public String getValor_car() {
		return valor_car;
	}

	public void setValor_car(String valor_car) {
		this.valor_car = valor_car;
	}

	private String id_soli;
	public JavaBeans(String id_soli, String nome_soli, String email_soli, String carro_soli) {
		super();
		this.id_soli = id_soli;
		this.nome_soli = nome_soli;
		this.email_soli = email_soli;
		this.carro_soli = carro_soli;
	}

	public String getId_soli() {
		return id_soli;
	}

	public void setId_soli(String id_soli) {
		this.id_soli = id_soli;
	}

	private String nome_soli;
	private String email_soli;
	private String carro_soli;

	public String getNome_soli() {
		return nome_soli;
	}

	public void setNome_soli(String nome_soli) {
		this.nome_soli = nome_soli;
	}

	public String getEmail_soli() {
		return email_soli;
	}

	public void setEmail_soli(String email_soli) {
		this.email_soli = email_soli;
	}

	public String getCarro_soli() {
		return carro_soli;
	}

	public void setCarro_soli(String carro_soli) {
		this.carro_soli = carro_soli;
	}

	public JavaBeans() {
		super();
	}

	public JavaBeans(String id_cli, String nome_cli, String email_cli, String telefone_cli, String senha_cli) {
		super();
		this.id_cli = id_cli;
		this.nome_cli = nome_cli;
		this.email_cli = email_cli;
		this.telefone_cli = telefone_cli;
		this.senha_cli = senha_cli;
	}
	
	public JavaBeans(String id_usu, String nome_usu, String email_usu, String telefone_usu, String senha_usu,
			String perfil_usu) {
		super();
		this.id_usu = id_usu;
		this.nome_usu = nome_usu;
		this.email_usu = email_usu;
		this.telefone_usu = telefone_usu;
		this.senha_usu = senha_usu;
		this.perfil_usu = perfil_usu;
	}
	
	public String getTelefone_usu() {
		return telefone_usu;
	}

	public void setTelefone_usu(String telefone_usu) {
		this.telefone_usu = telefone_usu;
	}

	public String getId_usu() {
		return id_usu;
	}

	public void setId_usu(String id_usu) {
		this.id_usu = id_usu;
	}

	public String getNome_usu() {
		return nome_usu;
	}

	public void setNome_usu(String nome_usu) {
		this.nome_usu = nome_usu;
	}

	public String getEmail_usu() {
		return email_usu;
	}

	public void setEmail_usu(String email_usu) {
		this.email_usu = email_usu;
	}

	public String getSenha_usu() {
		return senha_usu;
	}

	public void setSenha_usu(String senha_usu) {
		this.senha_usu = senha_usu;
	}

	public String getPerfil_usu() {
		return perfil_usu;
	}

	public void setPerfil_usu(String perfil_usu) {
		this.perfil_usu = perfil_usu;
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
