package co.com.gm.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.gm.dao.I_PersonaDao;
import co.com.gm.domain.persona;
@Service
public class PersonaServiceImpl implements PersonaService {
   @Autowired
   private I_PersonaDao personaDao;
	
   @Override
   @Transactional(readOnly = true)
	public List<persona> listarPersonas() {
		
		return (List<persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public void guaradar(persona persona) {
	   
		personaDao.save(persona);
		
	}

	@Override
	@Transactional
	public void eliminar(persona persona) {
		
		personaDao.delete(persona);
		
	}

	@Override
	@Transactional(readOnly = true)
	public persona encontrarPersona(persona persona) {
		
		return personaDao.findById(persona.getIdpersona()).orElse(null);
	}

}
