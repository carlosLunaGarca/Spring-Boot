package co.com.gm.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.gm.Models.LibroModel;
import co.com.gm.Repositoris.LibroRepository;

@Service
public class LibroService {
@Autowired
LibroRepository libroRepository;

public LibroModel guardarlibro(LibroModel LIBRO) {
	return this.libroRepository.save(LIBRO);
}
public ArrayList<LibroModel> obtenerLibros(){
    return (ArrayList<LibroModel>) libroRepository.findAll();

}
public LibroModel actualizar(LibroModel LIBRO) {
	return this.libroRepository.save(LIBRO);
}
public boolean eliminarLibro(Long id) {
    try{
        libroRepository.deleteById(id);
        return true;
    }catch(Exception err){
        return false;
    }
}
}