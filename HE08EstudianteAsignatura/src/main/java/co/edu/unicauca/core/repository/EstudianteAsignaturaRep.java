package co.edu.unicauca.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.core.entity.EstudianteAsignatura;
import jakarta.transaction.Transactional;

@Repository
public interface EstudianteAsignaturaRep extends JpaRepository<EstudianteAsignatura, Integer> {

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM estudianteasignatura WHERE ESTUDIANTE_ID=:idEstudiante AND ASIGNATURA_ID=:id_asignatura", nativeQuery=true)
	void eliminar( Integer idEstudiante,  Integer id_asignatura);
	
}
