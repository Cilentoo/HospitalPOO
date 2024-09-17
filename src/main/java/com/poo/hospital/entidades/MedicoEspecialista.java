package com.poo.hospital.entidades;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MedicoEspecialista {
    private String especiliade;
    private String crm;
    private Exame exame;


    public static List <MedicoEspecialista> eList = new ArrayList<>();
}
