package com.poo.hospital.entidades;

import java.util.List;
import java.util.ArrayList;

import com.poo.hospital.entidades.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exame {

    private Status status;
    private Medico medicoSolicitante;
    private MedicoEspecialista medicoLaudo;
    private String descricao;

    public Exame(Status status, Medico medicoSolicitante, MedicoEspecialista medicoLaudo) {
        this.status = status;
        this.medicoSolicitante = medicoSolicitante;
        this.medicoLaudo = medicoLaudo;
    }

    public static List <Exame> exameList = new ArrayList<Exame> ();

    public static List<Exame> getExameList() {
        return exameList;
    }

}
