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

import co.edu.unicauca.core.entity.Estudiantesglobal;
import co.edu.unicauca.core.repository.EstudiantesGlobalRep;
import co.edu.unicauca.core.service.EstudiantesGlobalServiceInt;


@Controller
@CrossOrigin(origins = "*")
public class EstudiantesGlobalController {	
	
	@Autowired
	private EstudiantesGlobalServiceInt estGlService;
	
	@GetMapping("/estudiantesglobales")
	@ResponseBody
	public List<Estudiantesglobal> estudiantesGlobales(){
		return estGlService.getEstudiantesglobales();
	}
	//
	@GetMapping("/estudiantesglobalesid")
	@ResponseBody
	public List<Estudiantesglobal> estudiantesGlobalesId(@RequestBody List<Integer> ids){
		return estGlService.getEstudiantesglobalesIds(ids);
	}
	
	
}
