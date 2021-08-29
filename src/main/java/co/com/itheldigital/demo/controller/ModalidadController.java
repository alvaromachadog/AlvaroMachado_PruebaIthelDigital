package co.com.itheldigital.demo.controller;

import co.com.itheldigital.demo.dto.ModalidadDTO;
import co.com.itheldigital.demo.service.ModalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ModalidadController {

    @Autowired
    private ModalidadService modalidaService;

    @GetMapping("/buscar/{nombre}")
    public ResponseEntity modalidadAll(@PathVariable String nombre) {

        ModalidadDTO response = modalidaService.buscarNombre(nombre);
        if (response != null) {
            return ResponseEntity.ok(response);
        }
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ModalidadDTO>> list() {

        List<ModalidadDTO> response = modalidaService.modalidadAll();
        if (response != null) {
            return new ResponseEntity<List<ModalidadDTO>>(response, HttpStatus.OK);
        }
        return new ResponseEntity<List<ModalidadDTO>>((List<ModalidadDTO>) null, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/modalidadId/{id}")
    public ResponseEntity findById(@PathVariable("id") @RequestBody Long id) {
        ModalidadDTO response = modalidaService.findById(id);
        if (response == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("se debe mandar por lo menos un id valido");
        }
        return ResponseEntity.ok(response);
    }

}
