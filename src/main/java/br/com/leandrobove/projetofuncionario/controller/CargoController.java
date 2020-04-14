package br.com.leandrobove.projetofuncionario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/cargos")
public class CargoController {
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String cadastrar() {
		return "/cargo/cadastro";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar() {
		return "/cargo/lista";
	}

}
