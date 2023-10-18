package model;

public class Destino {

	private int idDestino;
	private String nomeDestino;
	
	
	//Construtores
	public Destino() {}
	
	public Destino(int idDestino, String nomeDestino) {
		super();
		this.idDestino = idDestino;
		this.nomeDestino = nomeDestino;
	}
	
	
	//Getters and Setters
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getNomeDestino() {
		return nomeDestino;
	}
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	
	
	
}
