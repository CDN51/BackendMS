package co.edu.unicauca.core.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.core.entity.Jornada;
import co.edu.unicauca.core.entity.Turno;
import jakarta.transaction.Transactional;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer> {
/*
	@Modifying
	@Transactional
	@Query(value = "... column=:param ", nativeQuery=true)
	void eliminar( Integer param);
	*/
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Turno t WHERE t.estudiante_id=:pestudiante_id AND t.fecha=:pfecha ")
	Integer eliminarAsociacionesTurno(@Param("pestudiante_id") Integer estudiante_id, @Param("pfecha") LocalDate fecha);
	
	@Query(" SELECT t FROM Turno t WHERE t.estudiante_id=:pestudiante_id ")
	List<Turno> findByEstudiante(@Param("pestudiante_id") Integer estudiante_id);
	
	@Query(" SELECT t FROM Turno t WHERE t.fecha=:pfecha ")
	List<Turno> findByFecha(@Param("pfecha") LocalDate fecha);
	
	@Query(" SELECT t FROM Turno t WHERE t.estudiante_id=:pestudiante_id and t.fecha=:pfecha ")
	List<Turno> findByEstudianteFecha(@Param("pestudiante_id") Integer estudiante_id, @Param("pfecha") LocalDate fecha);
}
