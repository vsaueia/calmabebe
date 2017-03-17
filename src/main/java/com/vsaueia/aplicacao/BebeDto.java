package com.vsaueia.aplicacao;

public class BebeDto {
    public Long id;
    public String nome;
    public String dataDeNascimento;

    public BebeDto(Long id) {
        this.id = id;
    }

    public BebeDto() {
    }

    public BebeDto(Long id, String nome, String dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
}
