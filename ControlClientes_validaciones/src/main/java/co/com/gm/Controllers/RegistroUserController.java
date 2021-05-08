package co.com.gm.Controllers;


import co.com.gm.Models.*;

import co.com.gm.Services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Registrar")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class RegistroUserController {
    @Autowired
    UsuarioService usuarioService;
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
    	usuario.setRoll(false);
    	usuario.setSesion(false);
        return this.usuarioService.guardarUsuario(usuario);
    }
}