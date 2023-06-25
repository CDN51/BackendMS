package co.edu.unicauca.core.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.unicauca.core.entity.Jornada;
import co.edu.unicauca.core.entity.Turno;
import co.edu.unicauca.core.service.TurnoServiceInt;

//v 1

@Controller
@CrossOrigin(origins = "*")
public class TurnoController {
	@Autowired
	private TurnoServiceInt turnoServiceInt;

	//HE01
	@PostMapping("/Turno")
	@ResponseBody
	public Turno registrarTurno(@RequestBody Turno turno) {
		return turnoServiceInt.registrarTurno(turno);
	}
	
	//HE02
	@PutMapping("/Turno")
	@ResponseBody
	public Turno editarTurno(@RequestBody Turno turno) {
		return turnoServiceInt.editarTurno(turno);
	}
	
	//HE03
	@DeleteMapping("/Turno")
	@ResponseBody
	public Integer eliminarAsociacionesTurno(@RequestBody Turno turno) {
		return turnoServiceInt.eliminarAsociacionesTurno(turno);
	}
	
	@DeleteMapping("/Turno/{turno_id}")
	@ResponseBody
	public void elimarTurnoId(@PathVariable Integer turno_id) {
		turnoServiceInt.eliminarTurnoId(turno_id);
	}
	
	//HE04
	@GetMapping("/Turno")
	@ResponseBody
	public List<Turno> listarTurnos(){
		return turnoServiceInt.listarTurnos();
	}
	
	//HE05
	@GetMapping("/Turno/{turno_id}")
	@ResponseBody
	public Turno listarTurno(@PathVariable Integer turno_id) {
		return turnoServiceInt.listarTurno(turno_id);
	}
	
	//HE06
	//HE07
	


	//REQUERIDAS
	@GetMapping("/Jornada")
	@ResponseBody
	public List<Jornada> getJornadas(){
		return turnoServiceInt.listarJornadas();
	}
	
}
