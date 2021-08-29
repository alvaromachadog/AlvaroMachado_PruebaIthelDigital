package co.com.itheldigital.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "DESCUENTO")
public class Descuento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "MODALIDAD")
    private String modalidad;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "DESCUENTO")
    private Double descuento;

    @Column(name = "CURSO")
    private String curso;

    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "VALOR")
    private Double valorCurso;

    public Descuento() {
    }

    public Descuento(Long id, String nombre, String modalidad, String pais, Double descuento, String curso, Date fecha, Double valorCurso) {
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
