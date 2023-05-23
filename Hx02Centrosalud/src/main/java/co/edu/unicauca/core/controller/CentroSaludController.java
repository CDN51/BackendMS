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

import co.edu.unicauca.core.entity.CentroSalud;
import co.edu.unicauca.core.entity.Servicio;
import co.edu.unicauca.core.service.CentroSaludServiceInt;

//Hx02 V1

@Controller
@CrossOrigin(origins = "*")
public class CentroSaludController {
	
	@Autowired
	CentroSaludServiceInt centroSaludService;
	
	@GetMapping("/CentroSalud")
	@ResponseBody
	public List<CentroSalud> getCentrosSalud(){
		return centroSaludService.getHospitales();
	}
	
	@GetMapping("/ServiciosCentroSalud/{centrosalud_id}")
	@ResponseBody
	public List<Servicio> getServiciosCentroSalud(@PathVariable Integer centrosalud_id){
		return centroSaludService.getServicios(centrosalud_id);
	}
}