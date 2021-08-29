package co.com.itheldigital.demo.repository;

import co.com.itheldigital.demo.model.Modalidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ModalidadRepositiry extends CrudRepository<Modalidad, Long> {

	/**
	 *
	 * Query buscar por modalidad
	 * @param nombre
	 * @return
	 */
	@Query(value = "SELECT  * from  modalidad where nombre = ?", nativeQuery = true)
	Modalidad buscarModa(String nombre);



}
