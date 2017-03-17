package com.vsaueia.aplicacao;

public class DadosDoBebeDto {
    private String nome;
    private long semanas;
    private String etapaDoDesenvolvimento;

    public DadosDoBebeDto() {
    }

    public DadosDoBebeDto(String nome, long semanas, String etapaDoDesenvolvimento) {
        this.nome = nome;
        this.semanas = semanas;
        this.etapaDoDesenvolvimento = etapaDoDesenvolvimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getSemanas() {
        return semanas;
    }

    public void setSemanas(long semanas) {
        this.semanas = semanas;
    }

    public String getEtapaDoDesenvolvimento() {
        return etapaDoDesenvolvimento;
    }

    public void setEtapaDoDesenvolvimento(String etapaDoDesenvolvimento) {
        this.etapaDoDesenvolvimento = etapaDoDesenvolvimento;
    }
}
