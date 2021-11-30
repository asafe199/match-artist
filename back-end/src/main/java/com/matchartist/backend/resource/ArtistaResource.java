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

import com.matchartist.backend.model.Artista;
import com.matchartist.backend.repository.ArtistaRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class ArtistaResource {

		@Autowired
		private ArtistaRepository artistaRepository;
		
		@GetMapping("/artistas")
		public List<Artista> list(){
			return artistaRepository.findAll();
		}
		
		@PostMapping("/artista")
		public ResponseEntity<Artista> criar(@RequestBody Artista artista, HttpServletResponse response) {
			Artista artistaSalvo = artistaRepository.save(artista);
			
			URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(artistaSalvo.getId()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(artistaSalvo);
		}
		
}
