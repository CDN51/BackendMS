package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import co.edu.unicauca.core.entity.Estudiantesglobal;


public interface EstudiantesGlobalServiceInt {

	public List<Estudiantesglobal> getEstudiantesglobales();
		
}