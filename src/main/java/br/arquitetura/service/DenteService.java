package br.arquitetura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.arquitetura.dao.DenteRepository;
import br.arquitetura.dao.TratamentoRepository;
import br.arquitetura.dominio.Dente;
import br.arquitetura.dominio.Tratamento;

@Service
public class DenteService{
	@Autowired
	private DenteRepository denteRepository;
	
	public List<Dente> listar(){
		return denteRepository.findAll();
	}

}
