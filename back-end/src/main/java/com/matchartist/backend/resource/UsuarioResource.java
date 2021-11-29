package com.matchartist.backend.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.matchartist.backend.repository.UsuarioRepository;
import com.matchartist.backend.model.Endereco;
import com.matchartist.backend.model.TipoUsuario;
import com.matchartist.backend.model.Usuario;


@RestController
@RequestMapping
public class UsuarioResource {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private final PasswordEncoder encoder;
	
	public UsuarioResource(UsuarioRepository usuarioRepository, PasswordEncoder encoder) {
		this.usuarioRepository = usuarioRepository;
		this.encoder = encoder;
	}
	
	@GetMapping("/usuario")
	public  List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
	
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario, HttpServletResponse response) {
		//criptografa a senha antes de salvar
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(usuarioSalvo.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(usuarioSalvo);
	}

}
