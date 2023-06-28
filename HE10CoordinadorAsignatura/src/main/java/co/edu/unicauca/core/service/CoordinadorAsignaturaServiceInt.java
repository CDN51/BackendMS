package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import co.edu.unicauca.core.entity.Asignatura;
import co.edu.unicauca.core.entity.Coordinador;

public interface CoordinadorAsignaturaServiceInt {

	//HU01
	public List<Asignatura> obtenerAsignaturas();
	public Coordinador obtenerDatosCoordinador();
	
}