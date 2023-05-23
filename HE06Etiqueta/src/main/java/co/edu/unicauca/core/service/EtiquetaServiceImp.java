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
		Etiqueta aux;
		try {
			aux=etiquetaRep.findById(etiqueta.getEtiqueta_id()).get();
			if (aux!=null) {
				return null;
			}
			return etiquetaRep.save(etiqueta);
			
			
		} catch (Exception e) {
			return etiquetaRep.save(etiqueta);
		}
		
	}

	@Override
	public Etiqueta eliminarEtiqueta(Integer etiqueta_id) {
		Etiqueta deletedEtiqueta;
		try {
			deletedEtiqueta = etiquetaRep.findById(etiqueta_id).get();
			if (deletedEtiqueta!=null) {
				etiquetaRep.deleteById(etiqueta_id);
				return deletedEtiqueta;
			}
			return null;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public Etiqueta asociarServicioEtiqueta(Integer etiqueta_id, String servicio) {
		Integer result = etiquetaRep.asociarServicio(etiqueta_id, servicio);
		if (result==1) {
			return etiquetaRep.findById(etiqueta_id).get();
		}
		return null;
	}

	@Override
	public Etiqueta getEtiqueta(Integer etiqueta_id) {
		try {
			return etiquetaRep.findById(etiqueta_id).get();
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public Etiqueta eliminarServicioEtiqueta(Integer etiqueta_id) {
		Integer aux = etiquetaRep.eliminarServicio(etiqueta_id);
		if (aux==1) {
			return etiquetaRep.findById(etiqueta_id).get();
		}
		return null;
	}
	
}
