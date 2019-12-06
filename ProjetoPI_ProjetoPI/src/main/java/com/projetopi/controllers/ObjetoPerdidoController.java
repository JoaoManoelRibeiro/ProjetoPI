package com.projetopi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projetopi.models.ObjetoPerdido;
import com.projetopi.Repository.ObjetoPerdidoRepository;

	@Controller
	public class ObjetoPerdidoController {

		@Autowired
		public ObjetoPerdidoRepository cop;

		@RequestMapping(value = "/CadastroObjetoPerdido", method = RequestMethod.GET)
		public String form() {
			return "objetosperdidos/formObjetoPerdido";
		}

		@RequestMapping(value = "/CadastroObjetoPerdido", method = RequestMethod.POST)
		public String form(@Valid ObjetoPerdido objetoperdido, BindingResult result, RedirectAttributes attributes){
			System.out.println("Nome:" + objetoperdido.getNome());
			System.out.println("Descricao:" + objetoperdido.getDescricaoPerdido());
			System.out.println("Proprietario:" + objetoperdido.getProprietario());
			System.out.println("Data de desaparecimento:" + objetoperdido.getDataDesaparecimento());
			System.out.println("Local onde foi visto pela última vez:" + objetoperdido.getLocal());
			System.out.println("Observações:" + objetoperdido.getObservacoes());
			cop.save(objetoperdido);
			return "redirect:/CadastroObjetoPerdido";
			
		}

		@RequestMapping("/ListarObjetoPerdido")
		public ModelAndView listaObjetosPerdidos() {
			ModelAndView mv = new ModelAndView("objetosperdidos/ListarObjetoPerdido");
			Iterable<ObjetoPerdido> objetosperdidos = cop.findAll();
			mv.addObject("objetosperdidos", objetosperdidos);
			return mv;
		}
		
		@RequestMapping("/deletarObjeto")
		public String deletarObjeto(long codigo){
			ObjetoPerdido objetosperdidos = cop.findByCodigo(codigo);
			cop.delete(objetosperdidos);
			return "redirect:/ListarObjetoPerdido";
		}
	}

