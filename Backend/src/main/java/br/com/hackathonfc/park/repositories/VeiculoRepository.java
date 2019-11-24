package br.com.hackathonfc.park.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hackathonfc.park.domain.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{

}
