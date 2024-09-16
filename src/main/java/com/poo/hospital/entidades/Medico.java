package com.poo.hospital.entidades;

import com.poo.hospital.entidades.controladores.Prontuario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Medico extends Pessoa implements Prontuario {

    private Atendimento atendimento;
    private String crm;

    private static List<Medico> medicoList = new ArrayList<Medico>();

    //registrando atendimento
    public static void registraAtendimento(){

    }

    @Override
    public void imprimirProntuario() {

    }

    public static List<Medico> getMedicoList(){
        return medicoList;
    }

}
