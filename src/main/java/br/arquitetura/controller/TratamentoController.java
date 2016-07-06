package br.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.arquitetura.dominio.Tratamento;
import br.arquitetura.service.TratamentoService;


@RestController
@RequestMapping(value="/tratamento")
public class TratamentoController {
	
	@Autowired
	private TratamentoService tratamentoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Tratamento> search(){
		System.out.println("Chamando a Consulta.");
		return tratamentoService.listar();
	}

}
