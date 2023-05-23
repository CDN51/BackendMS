package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio {
	@Id
	@Column(name = "servicio_id")
	private Integer servicio_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "centrosalud_id")
	private CentroSalud centrosalid_id;
	
	public Servicio() {
	}

	public Servicio(Integer servicio_id, String nombre, CentroSalud centrosalid_id) {
		super();
		this.servicio_id = servicio_id;
		this.nombre = nombre;
		this.centrosalid_id = centrosalid_id;
	}

	public Integer getServicio_id() {
		return servicio_id;
	}

	public void setServicio_id(Integer servicio_id) {
		this.servicio_id = servicio_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CentroSalud getCentrosalid_id() {
		return centrosalid_id;
	}

	public void setCentrosalid_id(CentroSalud centrosalid_id) {
		this.centrosalid_id = centrosalid_id;
	}
	
}
