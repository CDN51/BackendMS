package co.edu.unicauca.core.entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudianteasignatura")
public class EstudianteAsignatura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "estudianteasignatura_id")
	private Integer estudianteasignatura_id;
	
	@Column(name = "asignatura_id")
	private Integer asignatura_id;
	
	
	@Column(name = "estudiante_id")
	private Integer estudiante_id;
	
	@Column(name = "estado")
	private Integer estado;
	
	@PrePersist
	private void valid() {
		if (estado==null) {
			estado=0;
		}
	}
	
	public EstudianteAsignatura() {
	}

	public EstudianteAsignatura(Integer estudianteasignatura_id, Integer asignatura_id, Integer estudiante_id,
			Integer estado) {
		super();
		this.estudianteasignatura_id = estudianteasignatura_id;
		this.asignatura_id = asignatura_id;
		this.estudiante_id = estudiante_id;
		this.estado = estado;
	}


	public Integer getEstudianteasignatura_id() {
		return estudianteasignatura_id;
	}

	public void setEstudianteasignatura_id(Integer estudianteasignatura_id) {
		this.estudianteasignatura_id = estudianteasignatura_id;
	}

	public Integer getAsignatura_id() {
		return asignatura_id;
	}

	public void setAsignatura_id(Integer asignatura_id) {
		this.asignatura_id = asignatura_id;
	}

	public Integer getEstudiante_id() {
		return estudiante_id;
	}

	public void setEstudiante_id(Integer estudiante_id) {
		this.estudiante_id = estudiante_id;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	

}
