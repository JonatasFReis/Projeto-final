package br.com.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.horario.repository.UsuarioRepository;
import br.com.horario.model.UsuarioModel;



@Controller
public class UsuarioController {
	
		@Autowired
		private UsuarioRepository usuarioRepository;

		@GetMapping("/suaconta")
		public String usuario(ModelMap model)
		{
			model.addAttribute("suaconta",usuarioRepository.findAll());
			return "/suaconta";
		}
	
		@PostMapping(value="/usuario/criar")
		public ModelAndView UsuarioModel(UsuarioModel usuarios) {
		ModelAndView mv = new ModelAndView("redirect:/suaconta");
		usuarioRepository.save(usuarios);
		
		return mv;
		
	}
}


