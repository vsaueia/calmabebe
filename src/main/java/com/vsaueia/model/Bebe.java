package com.vsaueia.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Bebe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    public Bebe() {
    }

    public Bebe(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Long getId() {
        return id;
    }
}
