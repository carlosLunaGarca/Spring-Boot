package co.com.gm.dao;


import org.springframework.data.repository.CrudRepository;
import co.com.gm.domain.persona;

//import org.springframework.stereotype.Repository;

//@Repository
//@ComponentScan("mx.com.gm.dao.I_PersonaDao")
public interface I_PersonaDao extends CrudRepository<persona, Long> {
	

}
