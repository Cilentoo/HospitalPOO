package com.poo.hospital.entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Atendimento {
    public static int contadorId = 1;

    private int id;
    private Paciente paciente;
    private Medico medico;

    private static List<String> atendimentoList = new ArrayList<String>();

    public Atendimento(int id, Paciente paciente, Medico medico, List<String> atendimentoList) {
        this.id = id;
        contadorId ++;
        this.paciente = paciente;
        this.medico = medico;
        this.atendimentoList = atendimentoList;
    }

    public Atendimento(){
        this.id = contadorId;
        contadorId++;
    }

    //registrando manualmente o atendimento

    public static void registroAtendimento(){
        Atendimento atendimento = new Atendimento();
        System.out.println("Registrando atendimento: ");
        System.out.println("Digite o nome do paciente: ");
        Scanner sc = new Scanner(System.in);
        String nomePaciente = sc.nextLine();
        Paciente paciente = new Paciente();
        paciente.setNome(nomePaciente);
        atendimento.setPaciente(paciente);
        atendimentoList.add(nomePaciente);

        System.out.println("Digite o nome do médico: ");
        String nomeMedico = sc.nextLine();
        Medico medico = new Medico();
        medico.setNome(nomeMedico);
        Medico.getMedicoList().add(medico);
        atendimento.setMedico(medico);
        atendimentoList.add(nomeMedico);

    }
}
