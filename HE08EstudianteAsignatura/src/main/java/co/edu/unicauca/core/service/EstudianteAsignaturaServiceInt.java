package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import co.edu.unicauca.core.entity.EstudianteAsignatura;


public interface EstudianteAsignaturaServiceInt {

	public EstudianteAsignatura registrarEstudianteEnAsignatura(EstudianteAsignatura nuevoRegistro);
	public void eliminarEstudiante(Integer idEstudiante, Integer idAsignatura);
	public Optional<EstudianteAsignatura> buscarEstudianteEnAsignatura(Integer id);
	public List<EstudianteAsignatura> listarEstudiantes();
	public void eliminarTodosLosEstudiantes();
	
}