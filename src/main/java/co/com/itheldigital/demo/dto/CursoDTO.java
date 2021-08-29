package co.com.itheldigital.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString
public class CursoDTO  implements Serializable {


    private Long id;

    private String nombre;

    private Double costo;

    private String descripcion;

    private Long horas;

    private String dirigido;

    private String modalidad;

    public CursoDTO() {
    }

    public CursoDTO(Long id, String nombre, Double costo, String descripcion, Long horas, String dirigido, String modalidad) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.descripcion = descripcion;
        this.horas = horas;
        this.dirigido = dirigido;
        this.modalidad = modalidad;
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

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getHoras() {
		return horas;
	}

	public void setHoras(Long horas) {
		this.horas = horas;
	}

	public String getDirigido() {
		return dirigido;
	}

	public void setDirigido(String dirigido) {
		this.dirigido = dirigido;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
    
    


}
