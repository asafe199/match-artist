package com.matchartist.matchartist.resource;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchartist.matchartist.model.TipoUsuario;
import com.matchartist.matchartist.repository.TipoUsuarioRepository;


@RestController
@RequestMapping("/tipoUsuario")
public class TipoUsuarioResource {
	
	 TipoUsuarioRepository tipoUsuarioRepository;
	
	@GetMapping
	public List<TipoUsuario> listar(){
		
		
		return tipoUsuarioRepository.findAll();
	}

}
  