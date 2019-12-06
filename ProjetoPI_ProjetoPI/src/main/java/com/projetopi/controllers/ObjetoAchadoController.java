package com.projetopi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projetopi.models.ObjetoAchado;
import com.projetopi.Repository.ObjetoAchadoRepository;

@Controller
public class ObjetoAchadoController {

	@Autowired
	public ObjetoAchadoRepository coa;

	@RequestMapping(value = "/CadastroObjetoAchado", method = RequestMethod.GET)
	public String form1() {
		return "objetosachados/formObjetoAchado";

	}

	@RequestMapping(value = "/CadastroObjetoAchado", method = RequestMethod.POST)
	public String form(ObjetoAchado objetoAchado) {
		System.out.println(objetoAchado);
		coa.save(objetoAchado);
		return "redirect:/CadastroObjetoAchado";

	}

	@RequestMapping("/ListarObjetoAchado")
	public ModelAndView listaObjetosAchados() {
		ModelAndView mv = new ModelAndView("objetosachados/ListarObjetoAchado");
		Iterable<ObjetoAchado> objetosachados = coa.findAll();
		mv.addObject("objetosachados", objetosachados);
		return mv;
	}

	@RequestMapping("/deletarObjetoAchado")
	public String deletarObjeto(long codigo) {
		ObjetoAchado objeto = coa.findByCodigo(codigo);
		coa.delete(objeto);
		return "redirect:/ListarObjetoAchado";
	}
}
