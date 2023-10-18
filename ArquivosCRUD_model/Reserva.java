package model;

import java.util.Date;

public class Reserva {
	
	private int idReserva;
	private Date dataIda;
	private Date dataVolta;
	
	
	
	//Construtores
	public Reserva() {}
	
	public Reserva(int id, Date dataIda, Date dataVolta) {
		super();
		this.idReserva = id;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
	}
	
	
	//Getters and Setters
	public int getId() {
		return idReserva;
	}
	public void setId(int id) {
		this.idReserva = id;
	}
	public Date getDataIda() {
		return dataIda;
	}
	public void setDataIda(Date dataIda) {
		this.dataIda = dataIda;
	}
	public Date getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(Date dataVolta) {
		this.dataVolta = dataVolta;
	}
	
	
	
}
