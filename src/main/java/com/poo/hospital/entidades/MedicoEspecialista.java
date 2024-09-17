package com.poo.hospital.entidades;

import java.security.cert.CRLReason;
import java.util.ArrayList;
import java.util.List;

import com.poo.hospital.entidades.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MedicoEspecialista extends Pessoa {
    private String especialidade;
    private String crm;
    private Exame exame;


    public static List <MedicoEspecialista> eList = new ArrayList<>();

    public static List<MedicoEspecialista> geteList() {
        return eList;
    }

    public static void analisarExame(){
        System.out.println("\n=============================================");
        System.out.println("|              * ANÁLISE DE EXAME *           |");
        System.out.println("-----------------------------------------------");
        //System.out.println("Exame sendo analisado por: " + ;  
        Exame exame = new Exame();
        exame.setStatus(Status.CONCLUIDO);
        System.out.println("\n---------------------------------------------");
        System.out.println("|          Exame analisado econcluído!        |");
        System.out.println("=============================================\n");
    }
}
