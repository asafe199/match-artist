package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.StatusConta;
import com.matchartist.backend.repository.StatusContaRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class StatusContaResource {
	@Autowired
	private StatusContaRepository statusContaRepository;
	
	@GetMapping("/statusConta")
	public List<StatusConta> list(){
		return statusContaRepository.findAll();
	}
	
	@PostMapping("/statusConta")
	@ResponseStatus(HttpStatus.CREATED)
	public  void create (@RequestBody StatusConta statusConta){
		statusContaRepository.save(statusConta);
	}

	
}
