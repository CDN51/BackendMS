package co.edu.unicauca.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "etiqueta")
public class Etiqueta {
	@Id
	@Column(name = "etiqueta_id")
	private Integer etiqueta_id;
	
	@Column(name = "centrosalud_id")
	private Integer centrosalud_id;
	
	@Column(name = "centrosalud_nombre")
	private String centrosalud_nombre;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "servicio")
	private String servicio;
	
	public Etiqueta() {
		// TODO Auto-generated constructor stub
	}

	public Etiqueta(Integer etiqueta_id, Integer centrosalud_id, String centrosalud_nombre, String nombre,
			String servicio) {
		super();
		this.etiqueta_id = etiqueta_id;
		this.centrosalud_id = centrosalud_id;
		this.centrosalud_nombre = centrosalud_nombre;
		this.nombre = nombre;
		this.servicio = servicio;
	}

	public Integer getEtiqueta_id() {
		return etiqueta_id;
	}

	public void setEtiqueta_id(Integer etiqueta_id) {
		this.etiqueta_id = etiqueta_id;
	}

	public Integer getCentrosalud_id() {
		return centrosalud_id;
	}

	public void setCentrosalud_id(Integer centrosalud_id) {
		this.centrosalud_id = centrosalud_id;
	}

	public String getCentrosalud_nombre() {
		return centrosalud_nombre;
	}

	public void setCentrosalud_nombre(String centrosalud_nombre) {
		this.centrosalud_nombre = centrosalud_nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	
	
}
