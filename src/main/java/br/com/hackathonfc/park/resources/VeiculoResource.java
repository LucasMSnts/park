package br.com.hackathonfc.park.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathonfc.park.domain.Veiculo;
import br.com.hackathonfc.park.services.VeiculoService;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;

	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll() {	
		List<Veiculo> lista = service.findAll();		
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Veiculo> findById(@PathVariable Integer id) {	
		Veiculo obj = service.findById(id);		
		return ResponseEntity.ok().body(obj);
	}
}
