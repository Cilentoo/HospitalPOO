package com.poo.hospital.entidades;

import com.poo.hospital.entidades.controladores.Prontuario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Paciente extends Pessoa implements Prontuario {

    private String carteiraSus;

    private static List<Paciente> pacienteList = new ArrayList<Paciente>();


    @Override
    public void imprimirProntuario() {

    }

    public static List<Paciente> getPacienteList(){
        return  pacienteList;
    }
    public static Paciente buscarCarteiraDoSus (String numeroSus){

        for (Paciente paciente: pacienteList){
            if (paciente.getCarteiraSus().equals(numeroSus)) {
               return paciente; 
            }

        }
        return null;
    }
}