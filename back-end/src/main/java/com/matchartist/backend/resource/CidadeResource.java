package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.Cidade;
import com.matchartist.backend.repository.CidadeRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class CidadeResource {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping("/cidades")
	public List<Cidade> list(){
		return cidadeRepository.findAll();
	}

}
