package br.com.hackathonfc.park.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hackathonfc.park.domain.Estacionamento;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Integer>{

}
