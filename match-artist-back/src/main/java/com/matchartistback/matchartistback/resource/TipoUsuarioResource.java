package com.matchartistback.matchartistback.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.matchartistback.matchartistback.model.TipoUsuario;
import com.matchartistback.matchartistback.repository.TipoUsuarioRepository;

@RestController
@RequestMapping
public class TipoUsuarioResource {
	
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	@GetMapping("/tipoUsuario")
	public List<TipoUsuario> listar(){
		return tipoUsuarioRepository.findAll();
	}
	
	@PostMapping("/tipoUsuario")
//	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<TipoUsuario> criar(@RequestBody TipoUsuario tipoUsuario
					, HttpServletResponse response) {
		 TipoUsuario tipoUsuarioSalvo = tipoUsuarioRepository.save(tipoUsuario);
		 
		 URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
				 .path("/{codigo}").buildAndExpand(tipoUsuarioSalvo.getId())
				 .toUri();
		 response.setHeader("Location", uri.toASCIIString());
		 
		 return ResponseEntity.created(uri).body(tipoUsuarioSalvo);
	}
	
	@GetMapping("/tipoUsuario/{id}")
	public Optional<TipoUsuario> buscarTipoUsuario(@PathVariable Integer id) {
		return tipoUsuarioRepository.findById(id);
	}
	
}
