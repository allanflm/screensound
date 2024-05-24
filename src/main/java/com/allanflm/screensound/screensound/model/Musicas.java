package com.allanflm.screensound.screensound.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musicas {
    public Musicas(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    private Artista artista;

    public Musicas(String nomeMusica) {
        this.titulo = nomeMusica;
    }

    @Override
    public String toString() {
        return
                "Música='" + titulo + '\'' +
                        ", artista=" + artista.getName();
    }

}
