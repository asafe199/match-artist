package com.matchartist.backend.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.matchartist.backend.impl.UsuarioServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.matchartist.backend.model.Usuario;


@RestController
@RequestMapping
@CrossOrigin("*")
public class UsuarioResource {
	
	@Autowired
	private UsuarioServiceImpl usuarioRepository;
	

	@GetMapping("/usuario")
	public  List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
	
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario, HttpServletResponse response) {
		Usuario usuarioSalvo = usuarioRepository.saveUsuario(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(usuarioSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		usuarioSalvo.setPassword(null);
		return ResponseEntity.created(uri).body(usuarioSalvo);
	}

}
