package com.matchartist.backend.impl;

import com.matchartist.backend.bean.UsuarioBean;
import com.matchartist.backend.config.handlers.ValidationException;
import com.matchartist.backend.model.Artista;
import com.matchartist.backend.model.Estabelecimento;
import com.matchartist.backend.model.Usuario;
import com.matchartist.backend.repository.ArtistaRepository;
import com.matchartist.backend.repository.EstabelecimentoRepository;
import com.matchartist.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    private ArtistaRepository artistaRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

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

    public Usuario saveUsuario(UsuarioBean usuarioBean){
        Usuario usuario = usuarioBean.getUsuario();
        validaEmail(usuario.getEmail());
        usuario.setDataAlteracao(new Date());
        usuario.setDataCriacao(new Date());
        String password = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(password);
        Usuario novoUsuario = usuarioRepository.save(usuario);
        if(usuario.getTipoUsuario().getId() == 1){
            Artista artista = usuarioBean.getArtista();
            artista.setFkUsuario(novoUsuario);
            artistaRepository.save(artista);
        } else {
            Estabelecimento estabelecimento = usuarioBean.getEstabelecimento();
            estabelecimento.setFkUsuario(novoUsuario);
            estabelecimentoRepository.save(estabelecimento);
        }
        return usuario;
    }

    private void validaEmail(String email){
        Optional<Usuario> optional = this.usuarioRepository.findByEmail(email);
        if(optional.isPresent()){
            throw new ValidationException("Email já cadastrado");
        }
    }
}
