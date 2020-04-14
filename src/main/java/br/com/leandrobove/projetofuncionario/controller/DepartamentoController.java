package br.com.leandrobove.projetofuncionario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/departamentos")
public class DepartamentoController {
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String cadastrar() {
		return "/departamento/cadastro";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar() {
		return "/departamento/lista";
	}

}
