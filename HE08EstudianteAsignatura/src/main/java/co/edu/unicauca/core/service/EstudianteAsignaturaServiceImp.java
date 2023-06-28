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
	public List<Integer> listarEstudiantes(Integer idAsignatura) {
		return estudianteAsignaturaRep.listarEstudianteEnAsignatura(idAsignatura);
	}

	@Override
	public void eliminarTodosLosEstudiantes(Integer idAsignatura) {
		estudianteAsignaturaRep.eliminarEstudiantesPorAsignatura(idAsignatura);
	}

	@Override
	public List<EstudianteAsignatura> listarTodo() {
		return estudianteAsignaturaRep.findAll();
	}


	@Override
	public Integer setEstado() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer setEstadoON(List<String> params) {
		Integer estudiante_id;
		Integer asignatura_id;
		try {
			estudiante_id=Integer.parseInt(params.get(0));
			asignatura_id=Integer.parseInt(params.get(1));
			return estudianteAsignaturaRep.setEstadoON(asignatura_id, estudiante_id);
		} catch (Exception e) {
			return 0; 
		}		
	}


	@Override
	public Integer setEstadoOFF(List<String> params) {
		Integer estudiante_id;
		Integer asignatura_id;
		try {
			estudiante_id=Integer.parseInt(params.get(0));
			asignatura_id=Integer.parseInt(params.get(1));
			return estudianteAsignaturaRep.setEstadoOFF(asignatura_id, estudiante_id);
		} catch (Exception e) {
			return 0; 
		}		
	}

}
