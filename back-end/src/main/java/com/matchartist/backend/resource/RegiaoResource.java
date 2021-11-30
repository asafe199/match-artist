package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.Regiao;
import com.matchartist.backend.repository.RegiaoRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class RegiaoResource {
	@Autowired
	private RegiaoRepository regiaoRepository;
	
	@GetMapping("/regioes")
	public List<Regiao> list(){
		return regiaoRepository.findAll();
	}
}
