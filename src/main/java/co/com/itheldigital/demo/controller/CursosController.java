package co.com.itheldigital.demo.controller;

import co.com.itheldigital.demo.dto.CursoDTO;
import co.com.itheldigital.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CursosController {

    @Autowired
    private CursoService cursoService;


    @PostMapping("/saveCurso")
    public ResponseEntity agregarUsuario(@RequestBody CursoDTO cursoDTO) {

        CursoDTO response = cursoService.agregar(cursoDTO);

        if (response == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear usuario");
        }
        return ResponseEntity.ok(response);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity editarUsuario(@PathVariable long id, @RequestBody CursoDTO cursoDTO) {

        CursoDTO response = cursoService.agregar(cursoDTO);

        if (response == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al editar usuario");
        }
        return ResponseEntity.ok(response);
    }

}
