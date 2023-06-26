package co.edu.unicauca.core.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import co.edu.unicauca.core.entity.Jornada;
import co.edu.unicauca.core.entity.Turno;


public interface TurnoServiceInt {

	//HU01
	//Registrar turno
	public Turno registrarTurno(Turno turno);
	
	//HU02
	//Editar Turno
	public Turno editarTurno(Turno turno);
	
	//HU03
	//Eliminar las asociaciones de un turno seleccionado
	public Integer eliminarAsociacionesTurno(Turno turno);
	
	public void eliminarTurnoId(Integer turno_id);

	//HU04
	//Listar turnos
	public List<Turno> listarTurnos();

	//HU05
	//listar turno en especifico
	public Turno listarTurno(Integer turno_id);

	//HU06
	//Listar estudiantes que son validos para la alimentacion

	//HU07
	//Validar turnos realizados por estudiante
	
	
	//REQUERIDAS
	public List<Jornada> listarJornadas();
	
	public List<Turno> listarTurnosEstudiante(Integer estudiante_id);
	
	public List<Turno> listarTurnosFecha(LocalDate fecha);
	
	public List<Turno> listarTurnosEstudianteFecha(List<String> params);
	
	
	
}