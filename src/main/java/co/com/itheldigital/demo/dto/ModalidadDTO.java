package co.com.itheldigital.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString
public class ModalidadDTO implements Serializable {

    private Long id;

    private String nombre;

    private String descripcion;

    public ModalidadDTO() {
    }

    public ModalidadDTO(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
    
}
