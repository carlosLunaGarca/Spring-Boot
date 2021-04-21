package co.com.gm.Service;
import co.com.gm.domain.persona;
import java.util.List;
public interface PersonaService {

public List<persona> listarPersonas();

public void guaradar(persona persona);


public void eliminar(persona persona);


public persona encontrarPersona(persona persona);

	
}
