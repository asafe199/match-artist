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
import com.matchartist.backend.model.StatusEvento;
import com.matchartist.backend.repository.StatusEventoRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class StatusEventoResource {
	
	@Autowired
	private StatusEventoRepository statusEventoRepository;
	
	@GetMapping("/statusEventos")
	public List<StatusEvento> list(){
		return statusEventoRepository.findAll();
	}
	
	@PostMapping("/statusEvento")
	public ResponseEntity<StatusEvento> criar(@RequestBody StatusEvento statusEvento, HttpServletResponse response) {
		StatusEvento statusEventoSalvo = statusEventoRepository.save(statusEvento);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(statusEventoSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(statusEventoSalvo);
	}

}
