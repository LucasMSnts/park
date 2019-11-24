package br.com.hackathonfc.park.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.hackathonfc.park.domain.Estacionamento;
import br.com.hackathonfc.park.repositories.EstacionamentoRepository;
import br.com.hackathonfc.park.resources.exception.DataIntegrityException;

@Service
public class EstacionamentoService {
	
	@Autowired
	private EstacionamentoRepository repository;
	
	public List<Estacionamento> findAll() {
		return repository.findAll();
	}
	
	public Estacionamento findById(Integer id) {
		Optional<Estacionamento> obj = repository.findById(id);
		return obj.get();
	}
	
	public Estacionamento insert(Estacionamento obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Estacionamento update(Estacionamento obj)	{
		findById(obj.getId());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
		}
	}
}
