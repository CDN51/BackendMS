package co.edu.unicauca.core.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turno")
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "turno_id")
	private Integer turno_id;
	
	@Column(name = "etiqueta_id")
	private Integer etiqueta_id;
	
	@Column(name = "estudiante_id")
	private Integer estudiante_id;
	
	@Column(name = "jornada_id")
	private Integer jornada_id;
	
	@Column(name = "escenario")
	private String escenario;
	
	@Column(name = "fecha")
	private LocalDate fecha;
	
	public Turno() {
		// TODO Auto-generated constructor stub
	}

	public Turno(Integer turno_id, Integer etiqueta_id, Integer estudiante_id, Integer jornada_id, String escenario,
			LocalDate fecha) {
		super();
		this.turno_id = turno_id;
		this.etiqueta_id = etiqueta_id;
		this.estudiante_id = estudiante_id;
		this.jornada_id = jornada_id;
		this.escenario = escenario;
		this.fecha = fecha;
	}



	public Integer getTurno_id() {
		return turno_id;
	}

	public void setTurno_id(Integer turno_id) {
		this.turno_id = turno_id;
	}

	public Integer getEtiqueta_id() {
		return etiqueta_id;
	}

	public void setEtiqueta_id(Integer etiqueta_id) {
		this.etiqueta_id = etiqueta_id;
	}

	public Integer getEstudiante_id() {
		return estudiante_id;
	}

	public void setEstudiante_id(Integer estudiante_id) {
		this.estudiante_id = estudiante_id;
	}

	public Integer getJornada_id() {
		return jornada_id;
	}

	public void setJornada_id(Integer jornada_id) {
		this.jornada_id = jornada_id;
	}

	public String getEscenario() {
		return escenario;
	}

	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
}
