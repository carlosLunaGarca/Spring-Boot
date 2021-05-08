package co.com.gm.Controllers;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.com.gm.Models.LibroModel;
import co.com.gm.Services.LibroService;
import co.com.gm.Services.UsuarioService;

@RestController
@RequestMapping("/Libro")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LibroController {
    @Autowired
    LibroService LibroService;
    @Autowired
    UsuarioService usuarioService;
    @PostMapping(path = "/{id}")
    public LibroModel guardarLibro(@RequestBody  LibroModel libro,@PathVariable("id") long id){
    	if(this.usuarioService.comprobarRoll(id)) {
    		return this.LibroService.guardarlibro(libro);
    	}else {
    		return new LibroModel();
    	}
    }
   
    @PatchMapping(path = "/{id}")
    public LibroModel actualizar(@RequestBody  LibroModel libro,@PathVariable("id") long id){
    	if(this.usuarioService.comprobarRoll(id)) {
    		return this.LibroService.actualizar(libro);
    	}else {
    		return new LibroModel();
    	}
    }
    
    @DeleteMapping(path = "/{id}")
    public boolean eliminar(@PathVariable("id") long id,@RequestParam("id") long idL) {
    	if(this.usuarioService.comprobarRoll(id)) {
    		this.LibroService.eliminarLibro(idL);
    		return true;
    	}else {
    		return false;
    	}
    	
    }
    
}