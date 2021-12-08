package com.matchartist.backend.bean;

import com.matchartist.backend.model.Artista;
import com.matchartist.backend.model.Estabelecimento;
import com.matchartist.backend.model.Usuario;

public class UsuarioBean {
    private Usuario usuario;
    private Artista artista;
    private Estabelecimento estabelecimento;

    public UsuarioBean() {
        super();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}
