package com.everis.nttdatacenters_hibernate_t1_gd;
import javax.persistence.*;

@Entity
@Table(name="Cliente")
public class App 
{
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "idCliente")
	
    private long idCliente;
    
    private String nombreCliente;
    
    private String apellidoCliente;
    
    private String dni;

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdCliente() {
		return idCliente;
	}
    
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	
	@Column(name="Nombre_Cliente")
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Column(name="Apellido_Cliente")
	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	
	@Column(name="DNI", unique = true, nullable = false, length = 9)
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
    
    
    
    
}


