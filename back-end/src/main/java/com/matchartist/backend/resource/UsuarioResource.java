package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.matchartist.backend.repository.UsuarioRepository;
import com.matchartist.backend.model.TipoUsuario;
import com.matchartist.backend.model.Usuario;


@RestController
@RequestMapping
public class UsuarioResource {
	
	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	@GetMapping("/usuario")
	public  List<Usuario> listar(){
		return UsuarioRepository.findAll();
	}
	
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public  void create (@RequestBody Usuario usuario){
		UsuarioRepository.save(usuario);
	}

}
