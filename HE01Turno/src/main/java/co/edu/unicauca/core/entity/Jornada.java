package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jornada")
public class Jornada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jornada_id")
	private Integer jornada_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	public Jornada() {
		// TODO Auto-generated constructor stub
	}

	public Jornada(Integer jornada_id, String nombre) {
		super();
		this.jornada_id = jornada_id;
		this.nombre = nombre;
	}

	public Integer getJornada_id() {
		return jornada_id;
	}

	public void setJornada_id(Integer jornada_id) {
		this.jornada_id = jornada_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
