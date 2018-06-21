package com.proyecto.jpa.data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ordenadores database table.
 * 
 */
@Entity
@Table(name="ordenadores")
@NamedQuery(name="Ordenadores.findAll", query="SELECT o FROM Ordenadores o")
public class Ordenadores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpc;
	@Column(name="caja")
	private String caja;
	@Column(name="discoduro")
	private String discoduro;
	@Column(name="fuente")
	private String fuente;
	@Column(name="montador")
	private String montador;
	@Column(name="placa")
	private String placa;
	@Column(name="processador")
	private String processador;
	@Column(name="ram")
	private String ram;

	@Column(name="tarjeta_grafica")
	private String tarjeta_grafica;

	public Ordenadores() {
	}

	public int getIdpc() {
		return this.idpc;
	}

	public void setIdpc(int idpc) {
		this.idpc = idpc;
	}

	public String getCaja() {
		return this.caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public String getDiscoduro() {
		return this.discoduro;
	}

	public void setDiscoduro(String discoduro) {
		this.discoduro = discoduro;
	}

	public String getFuente() {
		return this.fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getMontador() {
		return this.montador;
	}

	public void setMontador(String montador) {
		this.montador = montador;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getProcessador() {
		return this.processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getTarjeta_grafica() {
		return this.tarjeta_grafica;
	}

	public void setTarjeta_grafica(String tarjeta_grafica) {
		this.tarjeta_grafica = tarjeta_grafica;
	}

}