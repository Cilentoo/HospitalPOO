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
            System.out.println("=============================================");
            System.out.println("|           PRONTUÁRIO DO PACIENTE           |");
            System.out.println("=============================================");
            System.out.println("| Nome do Paciente       | " + paciente.getNome());
            System.out.println("| Número da Carteira SUS | " + paciente.getCarteiraSus());
            System.out.println("=============================================");
            List <Atendimento> atendimentos = Atendimento.getAtendimentoPorPaciente(paciente);

            if (!atendimentos.isEmpty()){
                System.out.println("|               ATENDIMENTOS                 |");
                System.out.println("=============================================");
                for (Atendimento atendimento : atendimentos){
                    System.out.println("| ID do Atendimento      | " + atendimento.getId());
                    System.out.println("| Médico Responsável     | " + atendimento.getMedico().getNome());
                    System.out.println("| Data do Atendimento    | " + atendimento.getDataHora());
                    System.out.println("=============================================");

                    System.out.println("|                 EXAMES                    |");
                    System.out.println("=============================================");
                    for (Exame exame : atendimento.getExames()){
                        System.out.println("| Exame Solicitado por   | " + exame.getMedicoSolicitante().getNome());
                        System.out.println("| Especialista Laudo     | " + 
                            (exame.getMedicoLaudo() != null ? exame.getMedicoLaudo() : "Aguardando Laudo"));
                        System.out.println("| Status do Exame        | " + exame.getStatus());
                        System.out.println("---------------------------------------------");
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
        System.out.println("\n===============================================");
        System.out.println("|             * SOLICITAR EXAME *             |");
        System.out.println("-----------------------------------------------");
        System.out.println("Escreva o numero do Sus do paciente: " );
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
                    System.out.println("\n--------------------------------------------");
                    System.out.println("|          Pedido de exame aceito!           |");
                    System.out.println("=============================================\n");;
                    break;
                }
            }
        }
        
    }

    public static Medico getMedicoPorEmail(String email){
        for (Medico medico : medicoList) {
            if (medico.getLogin().equals(email)){
                return medico;
            }
        }
        return null; 
    }

}
