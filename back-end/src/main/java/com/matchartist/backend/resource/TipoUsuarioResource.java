package com.matchartist.backend.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.matchartist.backend.model.TipoUsuario;
import com.matchartist.backend.repository.TipoUsuarioRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class TipoUsuarioResource {
	
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	@GetMapping("/tipoUsuario")
	public  List<TipoUsuario> listar(){
		return tipoUsuarioRepository.findAll();
	}
	
//	@PostMapping("/tipoUsuario")
//	@ResponseStatus(HttpStatus.CREATED)
//	public  void create (@RequestBody TipoUsuario tipoUsuario){
//		tipoUsuarioRepository.save(tipoUsuario);
//	}
	
	@PostMapping("/tipoUsuario")
	public ResponseEntity<TipoUsuario> criar(@RequestBody TipoUsuario tipoUsuario, HttpServletResponse response) {
		TipoUsuario tipoUsuarioSalvo = tipoUsuarioRepository.save(tipoUsuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(tipoUsuarioSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(tipoUsuarioSalvo);
	}
	

	
}
