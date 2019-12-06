package com.projetopi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.projetopi.Repository.ObjetoAchadoRepository;
import com.projetopi.models.ObjetoAchado;

@Controller
public class IndexController {

	@Autowired
	public ObjetoAchadoRepository coa;
	
	@RequestMapping("/")
	public ModelAndView listaObjetosAchados() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<ObjetoAchado> objetosachados = coa.findAll();
		mv.addObject("objetosachados", objetosachados);
		return mv;
	}
}