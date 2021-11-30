package com.matchartist.backend.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.matchartist.backend.model.Estabelecimento;
import com.matchartist.backend.repository.EstabelecimentoRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class EstabelecimentoResource {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@GetMapping("/estabelecimentos")
	public List<Estabelecimento> list(){
		return estabelecimentoRepository.findAll();
	}
	
	@PostMapping("/estabelecimento")
	public ResponseEntity<Estabelecimento> criar(@RequestBody Estabelecimento estabelecimento, HttpServletResponse response) {
		Estabelecimento estabelecimentoSalvo = estabelecimentoRepository.save(estabelecimento);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(estabelecimentoSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(estabelecimentoSalvo);
	}
	
}
	
	
	
