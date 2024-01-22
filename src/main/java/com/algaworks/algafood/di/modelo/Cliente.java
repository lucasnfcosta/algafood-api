package com.algaworks.algafood.di.modelo;

public class Cliente {
    private String nome;
    private String numeroCelular;
    private String email;
    private boolean ativo = false;

    public Cliente(String nome, String numeroCelular, String email) {
        this.nome = nome;
        this.numeroCelular = numeroCelular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ativar() {
        this.ativo = true;
    }
}
