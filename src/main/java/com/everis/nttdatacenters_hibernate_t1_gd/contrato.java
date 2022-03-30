package com.everis.nttdatacenters_hibernate_t1_gd;

import javax.persistence.*;


@Entity
@Table(name="contrato")
public class contrato {
	 
	@ManyToOne
	@JoinColumn(name="ID_Cliente")
	private Long idCliente;
	
	private Long idContrato;
	
	private String vigencia;
	
	private String caducidad;
	
	private Double precio;
	
	private String relacion;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	@Column(name="Fecha_Vigencia")
	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	@Column(name="Fecha_Caducidad")
	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}
	
	@Column(name="Precio_Mensual")
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Column(name="Relacion")
	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}
	
	
	
}
