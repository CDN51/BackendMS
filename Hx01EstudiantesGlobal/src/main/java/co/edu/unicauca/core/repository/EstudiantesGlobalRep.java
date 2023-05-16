package co.edu.unicauca.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.core.entity.Estudiantesglobal;
import jakarta.transaction.Transactional;

@Repository
public interface EstudiantesGlobalRep extends JpaRepository<Estudiantesglobal, Integer> {
/*
	@Modifying
	@Transactional
	@Query(value = "... column=:param ", nativeQuery=true)
	void eliminar( Integer param);
	*/
	
	
	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM estudiantesglobal where ESTUDIANTE_ID in :param ", nativeQuery=true)
	List<Estudiantesglobal> buscarEstudiantesIds( List<Integer> param);
}
