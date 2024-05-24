package com.allanflm.screensound.screensound.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoArtista type;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musicas> musicas = new ArrayList<>();

    public  Artista(){}
    public Artista(String nome, TipoArtista tipoArtista) {
        this.nome = nome;
        this.type = tipoArtista;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public TipoArtista getType() {
        return type;
    }

    public void setType(TipoArtista type) {
        this.type = type;
    }

    public List<Musicas> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musicas> musicas) {
        this.musicas = musicas;
    }


    @Override
    public String toString() {
        return
                ", Artista ='" + nome + '\'' +
                        ", Tipo =" + type +
                        ", Musicas=" + musicas;
    }
}
