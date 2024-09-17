package com.poo.hospital.entidades;

import com.poo.hospital.entidades.controladores.Prontuario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero da carteira do SUS: ");
        String numeroDoSus = leia.nextLine();
        Paciente paciente = Paciente.buscarCarteiraDoSus(numeroDoSus);
        
        if (paciente != null){
            System.out.println("PRONTUARIO DO PACIENTE");
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Numero da carteira SUS: " + paciente.getCarteiraSus());
            List <Atendimento> atendimentos = Atendimento.getAtendimentoPorPaciente(paciente);

            if (!atendimentos.isEmpty()){
                System.out.println("ATENDIMENTOS");
                for (Atendimento atendimento : atendimentos){
                    System.out.println("ID do atendimento" + atendimento.getId());
                    System.out.println("Medico responsavel: " + atendimento.getMedico().getNome());
                    System.out.println("Data do atendimento: " + atendimento.getDataHora());
                    System.out.println("EXAMES");
                    for (Exame exame : atendimento.getExames()){
                        System.out.println("Exame solicitado por: " + exame.getMedicoSolicitante().getNome());
                        System.out.println("Especialista Laudo: " + (exame.getMedicoLaudo() != null ? exame.getMedicoLaudo() : "Aguardando Laudo"));
                        System.out.println("Status do Exame: " + exame.getStatus());
                        System.out.println("-------------------------------");
                    }

                }

            }
            
        }
    }

    public static List<Medico> getMedicoList(){
        return medicoList;
    }

    public static void solicitarExame(){

        Scanner leia =new Scanner(System.in);
        System.out.println("Escreva o numero do Sus: " );
        String numeroSus = leia.nextLine();
        Paciente paciente = Paciente.buscarCarteiraDoSus(numeroSus);

        if (paciente != null) {
            Exame exame = new Exame();
            exame.setStatus(null);
            exame.setMedicoSolicitante(null);
            exame.setMedicoLaudo(null);
            for (Atendimento atendimento : Atendimento.getAtendimentoPorPaciente(paciente)){
                if (atendimento.getMedico().equals(null)){
                    atendimento.getExames().add(exame);
                    System.out.println("Pedido de exame aceito");
                    break;
                }
            }
        }
        
    }

}
