package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.CategoriaTratamento;

@Repository
public interface CategoriaTratamentoRepository extends JpaRepository<CategoriaTratamento, Integer>{

}
