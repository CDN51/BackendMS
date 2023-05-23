package co.edu.unicauca.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.core.entity.CentroSalud;
import co.edu.unicauca.core.entity.Servicio;
import jakarta.transaction.Transactional;

@Repository
public interface ServicioRepo extends JpaRepository<Servicio, Integer> {

	@Modifying
	@Transactional
	@Query(value = "SELECT s.servicio_id as 'servicio_id', s.centrosalud_id as centrosalud_id, s.nombre as nombre FROM centrosalud c inner join servicio s on s.centrosalud_id=c.centrosalud_id where s.centrosalud_id=:param ", nativeQuery=true)
	List<List<String>> getServiciosHospital(Integer param);
	
}
