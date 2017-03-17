package com.vsaueia.model;

import javax.persistence.*;

@Entity
@Table(name = "pico_de_crescimento")
public class PicoDeCrescimento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int semanas_inicial;
    private int semanas_final;

    private String descricao;

    public PicoDeCrescimento() {
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getId() {
        return id;
    }

    public int getSemanas_inicial() {
        return semanas_inicial;
    }

    public int getSemanas_final() {
        return semanas_final;
    }
}
