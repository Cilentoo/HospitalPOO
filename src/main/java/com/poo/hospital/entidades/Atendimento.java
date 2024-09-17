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
    private List <Exame> exames;

    private static List<Atendimento> atendimentoList = new ArrayList<>();

    public Atendimento(int id, Paciente paciente, Medico medico) {
        this.id = id;
        contadorId ++;
        this.paciente = paciente;
        this.medico = medico;
        this.exames = new ArrayList<>(); 
    }
    
    public Paciente getPaciente(){
        return paciente;
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

    public static List<Atendimento> getAtendimentoPorPaciente(Paciente paciente){
        List<Atendimento> atendimentoPaciente = new ArrayList<>();
        for(Atendimento atendimento : atendimentoList){
            if (atendimento.getPaciente().equals(paciente)){
                atendimentoPaciente.add(atendimento);
            }
        }
        return atendimentoPaciente;
    } 
    
}
