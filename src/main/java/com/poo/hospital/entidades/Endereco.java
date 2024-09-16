package com.poo.hospital.entidades;

import com.poo.hospital.entidades.enums.UnidadeFederal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederal unidadeFederal;

    public Endereco(){
    }

    public Endereco(String logradouro, int numero,
                    String complemento, String cep, String cidade,
                    UnidadeFederal unidadeFederal) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederal = unidadeFederal;
    }
}
