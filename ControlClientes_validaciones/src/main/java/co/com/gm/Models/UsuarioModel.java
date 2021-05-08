package co.com.gm.Models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")

public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String Nombre;
	private String email;
	private String pass;
	private Boolean roll;
	private Boolean sesion;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setRoll(Boolean roll) {
		this.roll = roll;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getRoll() {
		return roll;
	}

	public Boolean getSesion() {
		return sesion;
	}

	public void setSesion(Boolean sesion) {
		this.sesion = sesion;
	}

}
