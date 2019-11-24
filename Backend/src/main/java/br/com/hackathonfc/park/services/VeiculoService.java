package br.com.hackathonfc.park.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathonfc.park.domain.Veiculo;
import br.com.hackathonfc.park.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repository;
	
	public List<Veiculo> findAll() {
		return repository.findAll();
	}
	
	public Veiculo findById(Integer id) {
		Optional<Veiculo> obj = repository.findById(id);
		return obj.get();
	}
}
