package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.CursoDTO;
import org.hibernate.service.spi.ServiceException;

public interface CursoService {

    /**
     * Metodo que permite agregar curso
     * @param cursoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */

    CursoDTO agregar(CursoDTO cursoDTO) throws ServiceException;


    /**
     *
     * Metodo para la edicion de curso
     * @param cursoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    CursoDTO editar(CursoDTO cursoDTO) throws ServiceException;

}
