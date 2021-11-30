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

import com.matchartist.backend.model.Endereco;
import com.matchartist.backend.model.Estabelecimento;
import com.matchartist.backend.repository.EnderecoRepository;



@RestController
@RequestMapping
@CrossOrigin("*")
public class EnderecoResource {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@GetMapping("/enderecos")
	public List<Endereco> list(){
		return enderecoRepository.findAll();
	}
	
	@PostMapping("/endereco")
	public ResponseEntity<Endereco> criar(@RequestBody Endereco endereco, HttpServletResponse response) {
		Endereco enderecoSalvo = enderecoRepository.save(endereco);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(enderecoSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(enderecoSalvo);
	}

}
