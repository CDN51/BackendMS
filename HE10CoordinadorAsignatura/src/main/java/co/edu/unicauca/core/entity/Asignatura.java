package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignatura")
public class Asignatura {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asignatura_id")
	private Integer asignatura_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "coordinador_id")
	private Integer coordinador_id;
	
	public Asignatura() {
		// TODO Auto-generated constructor stub
	}

	public Asignatura(Integer asignatura_id, String nombre, String area, Integer coordinador_id) {
		super();
		this.asignatura_id = asignatura_id;
		this.nombre = nombre;
		this.area = area;
		this.coordinador_id = coordinador_id;
	}

	public Integer getAsignatura_id() {
		return asignatura_id;
	}

	public void setAsignatura_id(Integer asignatura_id) {
		this.asignatura_id = asignatura_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getCoordinador_id() {
		return coordinador_id;
	}

	public void setCoordinador_id(Integer coordinador_id) {
		this.coordinador_id = coordinador_id;
	}	
}
