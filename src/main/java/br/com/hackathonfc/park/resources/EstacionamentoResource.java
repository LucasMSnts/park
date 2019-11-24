package br.com.hackathonfc.park.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.hackathonfc.park.domain.Estacionamento;
import br.com.hackathonfc.park.services.EstacionamentoService;

@RestController
@RequestMapping(value="/estacionamentos")
public class EstacionamentoResource {
	
	@Autowired
	private EstacionamentoService service;

	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Estacionamento>> findAll() {	
		List<Estacionamento> lista = service.findAll();		
		return ResponseEntity.ok().body(lista);
	}
	
	@CrossOrigin
	@GetMapping(value="/{id}")
	public ResponseEntity<Estacionamento> findById(@PathVariable Integer id) {	
		Estacionamento obj = service.findById(id);		
		return ResponseEntity.ok().body(obj);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Estacionamento obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@CrossOrigin
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Estacionamento obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

	@CrossOrigin
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}

