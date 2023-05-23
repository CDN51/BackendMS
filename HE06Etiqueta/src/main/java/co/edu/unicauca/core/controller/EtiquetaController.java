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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.unicauca.core.entity.Etiqueta;
import co.edu.unicauca.core.repository.EtiquetaRep;
import co.edu.unicauca.core.service.EtiquetaServiceInt;


@Controller
@CrossOrigin(origins = "*")
public class EtiquetaController {
	@Autowired
	private EtiquetaServiceInt etiquetaServ;
	
	//HU01 Listar Etiquetas
	
	@GetMapping("/Etiquetas")
	@ResponseBody
	public List<Etiqueta> listarEtiquetas(){
		return etiquetaServ.listarEtiquetas();
	}

	//HU02 Crear Etiqueta
	@PostMapping("/Etiquetas")
	@ResponseBody
	public Etiqueta crearEtiqueta(@RequestBody Etiqueta etiqueta) {
		return etiquetaServ.crearEtiqueta(etiqueta);
	}
	
	//HU03 Eliminar etiqueta
	@DeleteMapping("/Etiquetas/{etiqueta_id}")
	@ResponseBody
	public Etiqueta eliminarEtiqueta(@PathVariable Integer etiqueta_id) {
		return etiquetaServ.eliminarEtiqueta(etiqueta_id);
	}
	
	//HU04 Asociar un servicio a una etiqueta
	@PostMapping("/EtiquetaServicio")
	@ResponseBody
	public Etiqueta asociarServicioEtiqueta(@RequestBody List<String> ids) {
		Integer etiqueta_id;
		String servicio;
		try {
			etiqueta_id=Integer.parseInt(ids.get(0));
			servicio=ids.get(1);
		} catch (Exception e) {
			return null;
		}
		return etiquetaServ.asociarServicioEtiqueta(etiqueta_id, servicio);
	}
	
	//HU05 Listar asociaciones de las etiquetas
	@GetMapping("/Etiqueta/{etiqueta_id}")
	@ResponseBody
	public Etiqueta obtenerEtiqueta(@PathVariable Integer etiqueta_id) {
		return etiquetaServ.getEtiqueta(etiqueta_id);
	}
	
	//HU06 Eliminar un servicio asociado a una etiqueta
	@PutMapping("/Etiqueta/{etiqueta_id}")
	@ResponseBody
	public Etiqueta eliminarServicioEtiqueta(@PathVariable Integer etiqueta_id) {
		return etiquetaServ.eliminarServicioEtiqueta(etiqueta_id);
	}
	
	
	
}
