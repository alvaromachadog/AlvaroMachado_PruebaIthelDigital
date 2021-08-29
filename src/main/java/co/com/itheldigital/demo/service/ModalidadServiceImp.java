package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.ModalidadDTO;
import co.com.itheldigital.demo.model.Modalidad;
import co.com.itheldigital.demo.repository.ModalidadRepositiry;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModalidadServiceImp implements ModalidadService {

    @Autowired
    private ModalidadRepositiry modalidadRepositiry;


    /**
     * Metodo para buscar por id
     *
     * @param id
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public ModalidadDTO findById(Long id) throws ServiceException {

        ModalidadDTO response = null;

        Modalidad modalidad = modalidadRepositiry.findById(id).orElse(null);

        response = new ModalidadDTO();

        response.setId(modalidad.getId());

        response.setNombre(modalidad.getNombre());

        response.setDescripcion(modalidad.getDescripcion());


        return response;
    }

    /**
     *
     * Metodo encargado de buscar por nombre de modalidad
     * @param nombre
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public ModalidadDTO buscarNombre(String nombre) throws ServiceException {

        ModalidadDTO response = null;

        Modalidad modalidad = modalidadRepositiry.buscarModa(nombre);

        response = new ModalidadDTO();

        response.setId(modalidad.getId());
        response.setNombre(modalidad.getNombre());
        response.setDescripcion(modalidad.getDescripcion());

        return response;
    }


    /**
     *
     * Metodo encargado de listar toda la modalidad
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public List<ModalidadDTO> modalidadAll() throws ServiceException {

        List<ModalidadDTO> response = new ArrayList<>();

        List<Modalidad> listModalidad = (List<Modalidad>) modalidadRepositiry.findAll();

        for (Modalidad modalidad : listModalidad) {

            ModalidadDTO dto = new ModalidadDTO();

            dto.setId(modalidad.getId());
            dto.setNombre(modalidad.getNombre());
            dto.setDescripcion(modalidad.getDescripcion());

            response.add(dto);

        }


        return response;
    }
}

