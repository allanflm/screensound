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
    private String name;

    @Enumerated(EnumType.STRING)
    private TipoArtista type;

    @OneToMany(mappedBy = "artista")
    private List<Musicas> musicas = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", Artista ='" + name + '\'' +
                        ", Tipo =" + type +
                        ", Musicas=" + musicas;
    }
}
