package co.edu.unicauca.core.repository;

import java.util.List;

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
	
	@Modifying
	@Query(value = "SELECT * FROM estudianteasignatura WHERE ESTUDIANTE_ID=:idEstudiante AND ASIGNATURA_ID=:id_asignatura", nativeQuery=true)
	void buscarEstudianteEnAsignatura( Integer idEstudiante,  Integer id_asignatura);
	
	@Modifying
	@Query(value = "SELECT ESTUDIANTE_ID FROM estudianteasignatura WHERE ASIGNATURA_ID=:idAsignatura", nativeQuery=true)
	List<Integer> listarEstudianteEnAsignatura(Integer idAsignatura);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM estudianteasignatura WHERE ASIGNATURA_ID=:idAsignatura", nativeQuery=true)
	void eliminarEstudiantesPorAsignatura(Integer idAsignatura);
}
