package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.Estabelecimento;
import com.matchartist.backend.repository.EstabelecimentoRepository;

@RestController
@RequestMapping
public class EstabelecimentoResource {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@GetMapping("/estabelecimentos")
	public List<Estabelecimento> list(){
		return estabelecimentoRepository.findAll();
	}
	
}
