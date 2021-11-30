package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.Uf;
import com.matchartist.backend.repository.UfRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class UfResource {
	
	@Autowired
	private UfRepository ufRepository;
	
	@GetMapping("/ufs")
	public List<Uf> list(){
		return ufRepository.findAll()
;	}

}
