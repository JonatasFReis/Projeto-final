package br.com.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.horario.repository.PostagemRepository;

@Controller
public class DocenteController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping("/docentes")
	public String docentes(ModelMap model)
	{
		model.addAttribute("postagens",postagemRepository.findAll());
		return "docentes/postagens";
	}
}
