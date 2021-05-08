package co.com.gm.Services;

import java.util.ArrayList;
import java.util.Optional;

import co.com.gm.Models.*;
import co.com.gm.Repositoris.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public boolean comprobarRoll(long id) {
		Optional<UsuarioModel> aux=  this.usuarioRepository.findById(id);
		if(!aux.isEmpty()) {
		if (aux.get().getRoll() && aux.get().getSesion()) {
			return true;
		}else {
			return false;
		}
		}
		return false;
	}
	
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		if (this.usuarioRepository.findByEmail(usuario.getEmail()) != null) {
			return new UsuarioModel();
		}
		return usuarioRepository.save(usuario);
	}

	public UsuarioModel Login(UsuarioModel usuario) {
		UsuarioModel aux = this.usuarioRepository.findByEmail(usuario.getEmail());
		if (aux != null) {
			if (usuario.getPass().equals(aux.getPass())) {
				aux.setSesion(true);
				return usuarioRepository.save(aux);
			}
			return new UsuarioModel();
		} else {
			return new UsuarioModel();
		}

	}

	public boolean logout(long id) {
		try {
		Optional<UsuarioModel> aux= this.usuarioRepository.findById(id);
		aux.get().setSesion(false);
		this.usuarioRepository.save(aux.get());
		return true;
		}
		catch (Exception e) {
			return false;
		}
		
	}

}