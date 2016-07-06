package br.arquitetura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.arquitetura.dao.TratamentoRepository;
import br.arquitetura.dominio.Tratamento;

@Service
public class TratamentoService{
	@Autowired
	private TratamentoRepository tratamentoRepository;
	
	public List<Tratamento> listar(){
		return tratamentoRepository.findAll();
	}

}
