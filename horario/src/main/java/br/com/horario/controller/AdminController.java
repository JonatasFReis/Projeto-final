package br.com.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.horario.repository.EscolaRepository;
import br.com.horario.repository.UsuarioRepository;

@Controller
public class AdminController {
	
	@Autowired
	private EscolaRepository escolaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/admin")
	public String principal()
	{
		return "admin/admin";
	}
	
	@GetMapping("/escola")
	public String usuarios(ModelMap model)
	{
		model.addAttribute("usuarios",usuarioRepository.findAll());
		return "escola/escolas";
	}
	
}
