package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.core.entity.Asignatura;
import co.edu.unicauca.core.entity.Coordinador;
import co.edu.unicauca.core.repository.AsignaturaRep;
import co.edu.unicauca.core.repository.CoordinadorRep;

@Service
public class CoordinadorAsignaturaServiceImp implements CoordinadorAsignaturaServiceInt {

	@Autowired
	private CoordinadorRep coordinadorRep;
	@Autowired
	private AsignaturaRep asignaturaRep;
	
	@Override
	public List<Asignatura> obtenerAsignaturas() {
		return asignaturaRep.findAll();
	}
	@Override
	public Coordinador obtenerDatosCoordinador() {
		return coordinadorRep.findAll().get(0);
	}
}
