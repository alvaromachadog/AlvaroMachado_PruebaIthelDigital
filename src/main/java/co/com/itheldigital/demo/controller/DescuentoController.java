package co.com.itheldigital.demo.controller;


import co.com.itheldigital.demo.dto.DescuentoDTO;
import co.com.itheldigital.demo.model.Descuento;
import co.com.itheldigital.demo.service.DescuentoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@ApiOperation(value = "Metodo de crear descuentos", response = ResponseEntity.class)
@RestController
@RequestMapping("/api")
public class DescuentoController {

    @Autowired
    private DescuentoService descuentoService;

    @PostMapping("/crearDescuento")
    public ResponseEntity agregarUsuario(@RequestBody DescuentoDTO descuentoDTO) throws Exception {

        Descuento response = descuentoService.crearDescuento(descuentoDTO);
        if (response == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear usuario");
        }
        return ResponseEntity.ok(response);
    }
}
