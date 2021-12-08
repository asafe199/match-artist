package com.matchartist.backend.resource;

import java.util.List;

import com.matchartist.backend.bean.UsuarioBean;
import com.matchartist.backend.impl.UsuarioServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<Usuario> criar(@RequestBody UsuarioBean usuario) {
		Usuario usuarioSalvo = usuarioRepository.saveUsuario(usuario);
		usuarioSalvo.setPassword(null);
		return ResponseEntity.ok(usuarioSalvo);
	}

}
