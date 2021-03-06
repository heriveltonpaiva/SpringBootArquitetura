package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Tratamento;

@Repository
public interface TratamentoRepository extends JpaRepository<Tratamento, Integer>{

   
}
