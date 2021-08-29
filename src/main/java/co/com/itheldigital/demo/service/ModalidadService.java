package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.ModalidadDTO;
import org.hibernate.service.spi.ServiceException;

import java.util.List;

public interface ModalidadService {


    /**
     * Metodo para buscar por id
     *
     * @param id
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    ModalidadDTO findById(Long id) throws ServiceException;


    /**
     * Metodo para buscar por nombre
     *
     * @param nombre
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    ModalidadDTO buscarNombre(String nombre) throws ServiceException;

    /**
     * Metodo para listar  el objeto
     *
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    List<ModalidadDTO> modalidadAll() throws ServiceException;

}
