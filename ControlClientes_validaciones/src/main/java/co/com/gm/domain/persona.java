package co.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name="persona")

public class persona implements Serializable {
private static final long serialVersionUID=1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idpersona;
@NotEmpty
private String nombre; 
@NotEmpty
private String apellido;
@NotEmpty
private String email;

private String telefono; 

}
