package com.poo.hospital.entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
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
    private LocalDateTime dataHora;

    private static List<Atendimento> atendimentoList = new ArrayList<>();

    public Atendimento(int id, Paciente paciente, Medico medico) {
        this.id = id;
        contadorId ++;
        this.paciente = paciente;
        this.medico = medico;
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
        

        System.out.println("Digite o nome do médico: ");
        String nomeMedico = sc.nextLine();
        Medico medico = new Medico();
        medico.setNome(nomeMedico);
        Medico.getMedicoList().add(medico);
        atendimento.setMedico(medico);

        atendimento.setDataHora(LocalDateTime.now());

        atendimentoList.add(atendimento);
    }

    public static void listarAtendimento(){
        for(Atendimento atendimento : atendimentoList){
            System.out.println("ID: " + atendimento.getId());
            System.out.println("Nome do paciente: " + atendimento.getPaciente().getNome());
            System.out.println("Nome do médico: " + atendimento.getMedico().getNome());
            System.out.println("Data e hora: " + atendimento.getDataHora());


        }
    }
}
