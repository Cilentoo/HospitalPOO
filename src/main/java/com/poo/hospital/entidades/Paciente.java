package com.poo.hospital.entidades;

import com.poo.hospital.entidades.controladores.Prontuario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Paciente extends Pessoa implements Prontuario {

    private String carteiraSus;

    private static List<Paciente> pacienteList = new ArrayList<Paciente>();

    @Override
    public void imprimirProntuario() {
        Paciente paciente = Paciente.getPacientePorEmail(Menu.getUsuarioLogado());

        if (paciente != null) {
            System.out.println("=============================================");
            System.out.println("|           PRONTUÁRIO DO PACIENTE           |");
            System.out.println("=============================================");
            System.out.println("| Nome do Paciente       | " + paciente.getNome());
            System.out.println("| Número da Carteira SUS | " + paciente.getCarteiraSus());
            System.out.println("=============================================");
            List<Atendimento> atendimentos = Atendimento.getAtendimentoPorPaciente(paciente);

            if (!atendimentos.isEmpty()) {
                System.out.println("|               ATENDIMENTOS                 |");
                System.out.println("=============================================");
                for (Atendimento atendimento : atendimentos) {
                    System.out.println("| ID do Atendimento      | " + atendimento.getId());
                    System.out.println("| Médico Responsável     | " + atendimento.getMedico().getNome());
                    System.out.println("| Data do Atendimento    | " + atendimento.getDataHora());
                    System.out.println("=============================================");

                    System.out.println("|                 EXAMES                    |");
                    System.out.println("=============================================");
                    for (Exame exame : atendimento.getExames()) {
                        System.out.println("| Exame Solicitado por   | " + exame.getMedicoSolicitante().getNome());
                        System.out.println("| Especialista Laudo     | " +
                                (exame.getMedicoLaudo().getNome() != null ? exame.getMedicoLaudo().getNome()
                                        : "Aguardando Laudo"));
                        System.out.println("| Status do Exame        | " + exame.getStatus());
                        System.out.println("---------------------------------------------");
                    }

                }

            }

        }
    }

    public static List<Paciente> getPacienteList() {
        return pacienteList;
    }
    // teste

    public static Paciente buscarCarteiraDoSus(String numeroSus) {

        for (Paciente paciente : pacienteList) {
            if (paciente.getCarteiraSus().equals(numeroSus)) {
                return paciente;
            }

        }
        return null;
    }

    public static Paciente getPacientePorEmail(String email) {
        for (Paciente paciente : pacienteList) {
            if (paciente.getLogin().equals(email)) {
                return paciente;
            }
        }
        return null;
    }
}
