package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import co.edu.unicauca.core.entity.Etiqueta;


public interface EtiquetaServiceInt {

	//public methods
	List<Etiqueta> listarEtiquetas();
	Etiqueta crearEtiqueta(Etiqueta etiqueta);
	Etiqueta eliminarEtiqueta(Integer etiqueta_id);
	Etiqueta asociarServicioEtiqueta(Integer etiqueta_id, String servicio);
	Etiqueta getEtiqueta(Integer etiqueta_id);
	Etiqueta eliminarServicioEtiqueta(Integer etiqueta_id);
	
}