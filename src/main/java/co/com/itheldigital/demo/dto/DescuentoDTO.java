package co.com.itheldigital.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class DescuentoDTO implements Serializable {

    private Long id;

    private String nombre;

    private String modalidad;

    private String pais;

    private Double descuento;

    private String curso;

    private Date fecha;

    private Double valorCurso;

    public DescuentoDTO() {
    }

    public DescuentoDTO(Long id, String nombre, String modalidad, String pais, Double descuento, String curso, Date fecha, Double valorCurso) {
        this.id = id;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.pais = pais;
        this.descuento = descuento;
        this.curso = curso;
        this.fecha = fecha;
        this.valorCurso = valorCurso;
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

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(Double valorCurso) {
		this.valorCurso = valorCurso;
	}
    
    
}
