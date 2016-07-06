package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Dente;

@Repository
public interface DenteRepository extends JpaRepository<Dente, Integer>{

}
