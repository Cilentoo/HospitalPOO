package com.poo.hospital.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Getter
@Setter
public abstract class Pessoa {

    private String nome;
    private String login;
    private String senha;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Pessoa(){
    }

    public Pessoa(String nome, String login, String senha, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    private boolean validarCPF(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }else {
            return true;
        }
    }
}
