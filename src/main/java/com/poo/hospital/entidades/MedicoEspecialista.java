package com.poo.hospital.entidades;

import java.security.cert.CRLReason;
import java.util.ArrayList;
import java.util.List;

import com.poo.hospital.entidades.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MedicoEspecialista {
    private String especiliade;
    private String crm;
    private Exame exame;


    public static List <MedicoEspecialista> eList = new ArrayList<>();

    public static void analisarExame(){
        System.out.println("Exame analisado");
        Exame exame = new Exame();
        exame.setStatus(Status.CONCLUIDO);

    }
}
