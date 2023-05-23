package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.core.entity.Etiqueta;
import co.edu.unicauca.core.repository.EtiquetaRep;

@Service
public class EtiquetaServiceImp implements EtiquetaServiceInt {
	@Autowired
	EtiquetaRep etiquetaRep;

	@Override
	public List<Etiqueta> listarEtiquetas() {
		return etiquetaRep.findAll();
	}

	@Override
	public Etiqueta crearEtiqueta(Etiqueta etiqueta) {
		if (etiquetaRep.findById(etiqueta.getEtiqueta_id())==null) {
			return etiquetaRep.save(etiqueta);
		}
		return null;
	}

	@Override
	public Etiqueta eliminarEtiqueta(Integer etiqueta_id) {
		Etiqueta deletedEtiqueta = etiquetaRep.findById(etiqueta_id).get();
		etiquetaRep.deleteById(etiqueta_id);
		return deletedEtiqueta;
		
	}

	@Override
	public Etiqueta asociarServicioEtiqueta(Integer etiqueta_id, String servicio) {
		return etiquetaRep.asociarServicio(etiqueta_id, servicio);
	}

	@Override
	public Etiqueta getEtiqueta(Integer etiqueta_id) {
		return etiquetaRep.findById(etiqueta_id).get();
	}

	@Override
	public Etiqueta eliminarServicioEtiqueta(Integer etiqueta_id) {
		return etiquetaRep.eliminarServicio(etiqueta_id);
	}
	
}
