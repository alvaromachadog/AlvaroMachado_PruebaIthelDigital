package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.DescuentoDTO;
import co.com.itheldigital.demo.model.Descuento;

public interface DescuentoService {


    /**
     *
     * Metodo que permite crear descuento con las condiciones de negocio
     * @param descuentoDTO
     * @return
     * @throws Exception
     */
    Descuento crearDescuento(DescuentoDTO descuentoDTO) throws Exception;
}
