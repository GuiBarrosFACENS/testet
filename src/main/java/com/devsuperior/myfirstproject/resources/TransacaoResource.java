package com.devsuperior.myfirstproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myfirstproject.entities.Transacao;
import com.devsuperior.myfirstproject.repositories.TransacaoRepository;

@RestController
@RequestMapping(value = "/transacao")
public class TransacaoResource {
	
	@Autowired
	private TransacaoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Transacao>> findAll() {
		List<Transacao> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Transacao> findById(@PathVariable Long id) {
		Transacao obj = repository.findById(id).get();
		return ResponseEntity.ok().body(obj);
	} 
	
}
