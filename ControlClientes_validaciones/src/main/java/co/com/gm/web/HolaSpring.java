package co.com.gm.web;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import co.com.gm.domain.persona;
import lombok.extern.slf4j.Slf4j;
import co.com.gm.Service.PersonaService;


@Controller
@Slf4j
public class HolaSpring {
	
	@Autowired
	private PersonaService servicePersona;
	@GetMapping("/")
	public String inicio(Model model) {

   
	
		 var personas = servicePersona.listarPersonas();
		log.info("Spring MVC");
		
		
	model.addAttribute("personas",personas);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(persona persona) {
	return "Modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@Valid persona persona, Errors errors) {
		if (errors.hasErrors()) {
			return "modificar";
		}
	servicePersona.guaradar(persona);
	return "redirect:/";
	}
	
	@GetMapping("/editar/{idpersona}")
	public String editar(persona persona,Model model) {
		
		persona =servicePersona.encontrarPersona(persona);
		model.addAttribute("persona",persona);
		
		return "Modificar";
	}
	@GetMapping("/eliminar/{idpersona}")
	public String eliminar(persona persona) {
	 servicePersona.eliminar(persona);
		
		return "redirect:/";
	}
}
