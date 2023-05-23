package co.edu.unicauca.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.core.entity.Etiqueta;
import jakarta.transaction.Transactional;

@Repository
public interface EtiquetaRep extends JpaRepository<Etiqueta, Integer> {

	@Modifying
	@Transactional
	@Query(value = "UPDATE `msetiquetas`.`etiqueta` SET `servicio` =:servicio WHERE (`etiqueta_id` =:etiqueta_id) ", nativeQuery=true)
	Etiqueta asociarServicio(Integer etiqueta_id, String servicio);
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE `msetiquetas`.`etiqueta` SET `servicio` = NULL WHERE (`etiqueta_id` =:etiqueta_id) ", nativeQuery=true)
	Etiqueta eliminarServicio(Integer etiqueta_id);
}
