package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coordinador")
public class Coordinador {
	@Id
	@Column(name = "coordinador_id")
	private Integer coordinador_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	public Coordinador() {
		// TODO Auto-generated constructor stub
	}

	public Coordinador(Integer coordinador_id, String nombre) {
		super();
		this.coordinador_id = coordinador_id;
		this.nombre = nombre;
	}

	public Integer getCoordinador_id() {
		return coordinador_id;
	}

	public void setCoordinador_id(Integer coordinador_id) {
		this.coordinador_id = coordinador_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
