package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import co.edu.unicauca.core.entity.CentroSalud;
import co.edu.unicauca.core.entity.Servicio;


public interface CentroSaludServiceInt {

	public List<CentroSalud> getHospitales();
	public List<Servicio> getServicios(Integer hospital_id);
	
}