package br.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.arquitetura.dominio.Dente;
import br.arquitetura.dominio.Tratamento;
import br.arquitetura.service.DenteService;
import br.arquitetura.service.TratamentoService;


@RestController
@RequestMapping(value="/dente")
public class DenteController {
	
	@Autowired
	private DenteService denteService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Dente> search(){
		return denteService.listar();
	}

}
