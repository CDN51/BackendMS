package co.edu.unicauca.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.core.entity.Estudiantesglobal;
import co.edu.unicauca.core.repository.EstudiantesGlobalRep;

@Service
public class EstudiantesGlobalServiceImp implements EstudiantesGlobalServiceInt {

	@Autowired
	private EstudiantesGlobalRep estGlRep;

	@Override
	public List<Estudiantesglobal> getEstudiantesglobales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiantesglobal buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
