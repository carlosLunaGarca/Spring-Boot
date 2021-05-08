package co.com.gm.Controllers;


import co.com.gm.Models.*;

import co.com.gm.Services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Login")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LoginController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public UsuarioModel login(@RequestBody UsuarioModel usuario){
    	usuario.setRoll(false);
        return this.usuarioService.Login(usuario);
    }
    
    @PatchMapping(path = "/{id}")
    public boolean logout(@PathVariable("id") long id) {
    	return this.usuarioService.logout(id);
    }

    

   

}