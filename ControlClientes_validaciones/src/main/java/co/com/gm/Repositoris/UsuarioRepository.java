package co.com.gm.Repositoris;

import co.com.gm.Models.*;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract UsuarioModel findByEmail(String email);

}