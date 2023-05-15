package co.edu.unicauca.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.core.entity.pEntity;
import jakarta.transaction.Transactional;

@Repository
public interface aRep extends JpaRepository<pEntity, Integer> {
/*
	@Modifying
	@Transactional
	@Query(value = "... column=:param ", nativeQuery=true)
	void eliminar( Integer param);
	*/
}
