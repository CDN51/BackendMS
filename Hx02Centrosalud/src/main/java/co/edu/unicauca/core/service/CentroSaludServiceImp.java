package co.edu.unicauca.core.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.core.entity.CentroSalud;
import co.edu.unicauca.core.entity.Servicio;
import co.edu.unicauca.core.repository.CentroSaludRepo;
import co.edu.unicauca.core.repository.ServicioRepo;

@Service
public class CentroSaludServiceImp implements CentroSaludServiceInt {

	@Autowired
	private CentroSaludRepo centroSaludRep;
	@Autowired
	private ServicioRepo servicioRep;
	
	@Override
	public List<CentroSalud> getHospitales() {
		return centroSaludRep.findAll();
	}
	@Override
	public List<Servicio> getServicios(Integer hospital_id) {
		
		List<List<String>> lsServices = servicioRep.getServiciosHospital(hospital_id);
		List<Servicio> lsRet= new ArrayList<>();
		Integer idCentroSalud;
		Integer idServicio;
		String nombreServicio;
		CentroSalud centroSalud;
		try {
			for (List<String> lsPrs : lsServices) {
				idServicio=Integer.parseInt(lsPrs.get(0));
				idCentroSalud=Integer.parseInt(lsPrs.get(1));
				nombreServicio=lsPrs.get(2);
				centroSalud= centroSaludRep.findById(idCentroSalud).get();
				
				lsRet.add(new Servicio(idServicio, nombreServicio, centroSalud));
			}
		} catch (Exception e) {
			//nothing
		}
		
		
		return lsRet;
	}
	
	
	
}
