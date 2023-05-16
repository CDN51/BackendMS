package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.core.entity.EstudianteAsignatura;
import co.edu.unicauca.core.repository.EstudianteAsignaturaRep;

@Service
public class EstudianteAsignaturaServiceImp implements EstudianteAsignaturaServiceInt {

	@Autowired
	private EstudianteAsignaturaRep estudianteAsignaturaRep;
	
	@Override
	public EstudianteAsignatura registrarEstudianteEnAsignatura(EstudianteAsignatura nuevoRegistro) {
		return estudianteAsignaturaRep.save(nuevoRegistro);
	}


	@Override
	public void eliminarEstudiante(Integer idEstudiante, Integer idAsignatura) {
		estudianteAsignaturaRep.eliminar(idEstudiante, idAsignatura);
		
	}
	

	@Override
	public Optional<EstudianteAsignatura> buscarEstudianteEnAsignatura(Integer id) {
		return estudianteAsignaturaRep.findById(id);
	}


	@Override
	public List<EstudianteAsignatura> listarEstudiantes() {
		return estudianteAsignaturaRep.findAll();
	}

	@Override
	public void eliminarTodosLosEstudiantes(Integer idAsignatura) {
		estudianteAsignaturaRep.eliminarEstudiantesPorAsignatura(idAsignatura);
	}
}
