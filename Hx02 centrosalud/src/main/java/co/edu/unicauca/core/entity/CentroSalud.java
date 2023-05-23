package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "centrosalud")
public class CentroSalud {
	@Id
	@Column(name = "centrosalud_id")
	private Integer centrosalud_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	public CentroSalud() {
		// TODO Auto-generated constructor stub
	}

	public CentroSalud(Integer centrosalud_id, String nombre) {
		super();
		this.centrosalud_id = centrosalud_id;
		this.nombre = nombre;
	}

	public Integer getCentrosalud_id() {
		return centrosalud_id;
	}

	public void setCentrosalud_id(Integer centrosalud_id) {
		this.centrosalud_id = centrosalud_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
