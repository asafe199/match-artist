package com.matchartist.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.backend.model.TipoUsuario;
import com.matchartist.backend.repository.TipoUsuarioRepository;

@RestController
@RequestMapping
public class TipoUsuarioResource {
	
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	@GetMapping("/tipoUsuario")
	public  List<TipoUsuario> listar(){
		return tipoUsuarioRepository.findAll();
	}

	
}
