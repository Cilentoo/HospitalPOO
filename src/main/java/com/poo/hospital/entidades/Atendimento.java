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
        this.id = contadorId++;
        contadorId++;
        this.exames = new ArrayList<>();
    }

    public static List<Atendimento> getAtendimentoList() {
        return atendimentoList;
    }

    //registrando manualmente o atendimento
    public static void registroAtendimento(){
        Atendimento atendimento = new Atendimento();
        System.out.println("\n=============================================");
        System.out.println("|         * REGISTRO DE ATENDIMENTO *         |");
        System.out.println("-----------------------------------------------");
        System.out.println("Digite o numero da carteira do paciente: ");
        Scanner leia = new Scanner(System.in);
        String numeroSus = leia.nextLine();
        System.out.println("Digite o nome do paciente: ");
        String nomePaciente = leia.nextLine();
        Paciente paciente = new Paciente();
        paciente.setCarteiraSus(numeroSus);
        paciente.setNome(nomePaciente);
        atendimento.setPaciente(paciente);
        
        Medico medicoLogado = Medico.getMedicoPorEmail(Menu.getUsuarioLogado());
        if (medicoLogado != null){
            atendimento.setMedico(medicoLogado);
        }else {
            System.out.println("Erro. Medico não encontrado.");
        }

        Medico.getMedicoList().add(medicoLogado);

        atendimento.setDataHora(LocalDateTime.now());

        atendimentoList.add(atendimento);

        System.out.println("\n---------------------------------------------");
        System.out.println("|     Atendimento registrado com sucesso!     |");
        System.out.println("=============================================\n");
    }

    public static void listarAtendimento(){
        for(Atendimento atendimento : atendimentoList){
            System.out.println("\n=============================================");
            System.out.println("|    * ATENDIMENTOS REALIZADOS NA UNIDADE *   |");
            System.out.println("-----------------------------------------------");
            System.out.println("ID: " + atendimento.getId());
            System.out.println("Nome do paciente: " + atendimento.getPaciente().getNome());
            System.out.println("Nome do médico: " + atendimento.getMedico().getNome());
            System.out.println("Data e hora: " + atendimento.getDataHora());
            System.out.println("------------------------------------------------\n");
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
