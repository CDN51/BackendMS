package co.edu.unicauca.core.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.hibernate.cfg.WrappedInferredData;
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
		return estGlRep.findAll();
	}

	@Override
	public List<Estudiantesglobal> getEstudiantesglobalesIds(List<Integer> ids) {
		return estGlRep.buscarEstudiantesIds(ids);
	}

}
