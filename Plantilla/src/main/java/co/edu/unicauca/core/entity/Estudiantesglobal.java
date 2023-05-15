package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantesglobal")
public class Estudiantesglobal {
	@Id
	@Column(name = "ESTUDIANTE_ID")
	private Integer estudiante_id;
	
	@Column(name = "NOMBRE", nullable=false)
	private String nombre;

	public Estudiantesglobal() {
		// TODO Auto-generated constructor stub
	}
	
	public Estudiantesglobal(Integer estudiante_id, String nombre) {
		super();
		this.estudiante_id = estudiante_id;
		this.nombre = nombre;
	}

	public Integer getEstudiante_id() {
		return estudiante_id;
	}

	public void setEstudiante_id(Integer estudiante_id) {
		this.estudiante_id = estudiante_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
