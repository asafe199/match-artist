package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.Endereco;
import com.matchartist.backend.repository.EnderecoRepository;



@RestController
@RequestMapping
public class EnderecoResource {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@GetMapping("/enderecos")
	public List<Endereco> list(){
		return enderecoRepository.findAll();
	}

}
