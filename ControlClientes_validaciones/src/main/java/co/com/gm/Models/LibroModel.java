package co.com.gm.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class LibroModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(unique = true,nullable = false)
private Long id;
private String nombre;
private String autor;
private String categoria;
private Integer cant;
private Integer disp;
private Integer tarifa;
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
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public Integer getCant() {
	return cant;
}
public void setCant(Integer cant) {
	this.cant = cant;
}
public Integer getDisp() {
	return disp;
}
public void setDisp(Integer disp) {
	this.disp = disp;
}
public Integer getTarifa() {
	return tarifa;
}
public void setTarifa(Integer tarifa) {
	this.tarifa = tarifa;
}

}
