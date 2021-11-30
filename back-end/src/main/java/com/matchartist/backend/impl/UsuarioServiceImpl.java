package com.matchartist.backend.impl;

import com.matchartist.backend.model.Usuario;
import com.matchartist.backend.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    
    public UsuarioServiceImpl(UsuarioRepository usuario, BCryptPasswordEncoder bcript) {
    	this.usuarioRepository = usuario;
    	this.passwordEncoder = bcript;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(email);
        if(!usuarioOptional.isPresent()){
            throw new UsernameNotFoundException(String.format("User %s, wasn't not found!", email));
        }
        return usuarioOptional.get();
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario saveUsuario(Usuario usuario){
        String password = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(password);
        return usuarioRepository.save(usuario);
    }
}
