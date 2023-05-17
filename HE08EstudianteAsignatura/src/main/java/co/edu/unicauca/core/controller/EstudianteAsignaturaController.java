package co.edu.unicauca.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.unicauca.core.entity.EstudianteAsignatura;
import co.edu.unicauca.core.repository.EstudianteAsignaturaRep;
import co.edu.unicauca.core.service.EstudianteAsignaturaServiceInt;


@Controller
@CrossOrigin(origins = "*")
public class EstudianteAsignaturaController {
	
	@Autowired
	private EstudianteAsignaturaServiceInt estudianteAsignaturaServiceInt;

	
	// HE08 - HU01
	@PostMapping("/RegistrarEstudiante")
	@ResponseBody
	public EstudianteAsignatura registrarEstudiante(@RequestBody EstudianteAsignatura estudianteAsignatura ){
		return estudianteAsignaturaServiceInt.registrarEstudianteEnAsignatura(estudianteAsignatura);
	}
	
	// HE08 - HU02
	@DeleteMapping("/EliminarEstudiante/")
	@ResponseBody
	public void eliminarEstudiante(@RequestBody EstudianteAsignatura estudianteAsignatura ) {
		Integer idEstudiante = estudianteAsignatura.getEstudiante_id();
		Integer id_asignatura = estudianteAsignatura.getAsignatura_id();
		estudianteAsignaturaServiceInt.eliminarEstudiante(idEstudiante, id_asignatura);
	}

	// HE08 - HU03
	@GetMapping("/BuscarEstudiante/{id}")
	@ResponseBody
	public Optional<EstudianteAsignatura> buscarEstudiante(@PathVariable Integer id) {
		return estudianteAsignaturaServiceInt.buscarEstudianteEnAsignatura(id);

	}
	
	// HE08 - HU04
	@GetMapping("/ListarEstudiantes/{id}")
	@ResponseBody
	public List<Integer> listarEstudiantes(@PathVariable Integer id){
		return estudianteAsignaturaServiceInt.listarEstudiantes(id);
	}
	
	// HE08 - HU05
	@DeleteMapping("/EliminarEstudiantes/")
	@ResponseBody
	public void eliminarEstudiantes(Integer idAsignatura) {
		estudianteAsignaturaServiceInt.eliminarTodosLosEstudiantes(idAsignatura);
	}
	
}
