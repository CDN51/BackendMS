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

import co.edu.unicauca.core.entity.Asignatura;
import co.edu.unicauca.core.entity.Coordinador;
import co.edu.unicauca.core.service.CoordinadorAsignaturaServiceInt;


@Controller
@CrossOrigin(origins = "*")
public class CoordinadorAsignaturaController {
	
	@Autowired
	private CoordinadorAsignaturaServiceInt coordAsigServiceInt;
	
	@GetMapping("/Asignatura")
	@ResponseBody
	public List<Asignatura> listarAsignaturas(){
		return coordAsigServiceInt.obtenerAsignaturas();
	}
	
	@GetMapping("/Coordinador")
	@ResponseBody
	public Coordinador listarCoordinador() {
		return coordAsigServiceInt.obtenerDatosCoordinador();
	}
}
