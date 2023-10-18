package model;

public class Cliente {

	private int idCliente;
	private String nome;
	private String emailCliente;
	private String senha;
	
	//Construtores
	public Cliente(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}
	
	public Cliente() {}
	
	
	
	//getters and setters
	public int getId() {
		return idCliente;
	}
	public void setId(int id) {
		this.idCliente = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente (String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
} 
