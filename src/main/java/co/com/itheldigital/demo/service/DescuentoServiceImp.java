package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.DescuentoDTO;
import co.com.itheldigital.demo.model.Descuento;
import co.com.itheldigital.demo.repository.DescuentoRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class DescuentoServiceImp implements DescuentoService {

    @Autowired
    private DescuentoRepository descuentoRepository;


    /**
     *
     * Metodo encargado de agregar un descuento a un curso con las reglas de negocio
     * @param descuentoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public Descuento crearDescuento(DescuentoDTO descuentoDTO) throws Exception {

        double total = 0d;

        Descuento response = new Descuento();

        if (descuentoDTO.getModalidad().equals("PRIVADO")) {

            total = descuentoDTO.getValorCurso() - (descuentoDTO.getValorCurso() * 0.1);

        } else if (descuentoDTO.getModalidad().equals("ONLINE")) {

            total = descuentoDTO.getValorCurso() - (descuentoDTO.getValorCurso() * 0.2);

        } else if (descuentoDTO.getModalidad().equals("ONDEMAND")) {

            total = descuentoDTO.getValorCurso() - (descuentoDTO.getValorCurso() * 0.3);
        }

        response.setNombre(descuentoDTO.getNombre());
        response.setCurso(descuentoDTO.getCurso());
        response.setModalidad(descuentoDTO.getModalidad());
        response.setPais(descuentoDTO.getPais());
        response.setFecha(new Date());
        response.setValorCurso(total);

        response = descuentoRepository.save(response);

        return response;
    }
}
