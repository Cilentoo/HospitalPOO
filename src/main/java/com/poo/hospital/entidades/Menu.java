package com.poo.hospital.entidades;

import com.poo.hospital.entidades.controladores.Prontuario;

import lombok.Getter;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    @Getter
    private static String usuarioLogado = null;
    private static String funcaoUsuario = null;
    private static String nomePaciente = null;
    private static String nomeMedico = null;
    private static String nomeMedicoE = null;

    public static void login() {
        Scanner leia = new Scanner(System.in);
        System.out.println("                  ___________                  ");
        System.out.println("                 |           |                 ");
        System.out.println("                 |  UPA 24H  |                 ");
        System.out.println("                 |___________|                 ");
        System.out.println("==============================================");
        System.out.println("|         Unidade de Pronto Atendimento     |");
        System.out.println("|              Sistema de Gestão            |");
        System.out.println("---------------------------------------------");

        System.out.print("Login (email): ");
        String email = leia.nextLine();

        System.out.println("Senha: ");
        String senha = leia.nextLine();

        boolean usuarioValido = false;

        for (Paciente p : Paciente.getPacienteList()) {
            if (email.equals(p.getLogin()) && senha.equals(p.getSenha())) {
                usuarioLogado = email;
                funcaoUsuario = "Paciente";
                nomePaciente = p.getNome();
                System.out.println("\n-----------------------------------------------");
                System.out.println("|          Acesso Permitido (Paciente)        |");
                System.out.println("===============================================");
                usuarioValido = true;
            }
        }
        for (Medico m : Medico.getMedicoList()) {
            if (email.equals(m.getLogin()) && senha.equals(m.getSenha())) {
                usuarioLogado = email;
                funcaoUsuario = "Medico";
                nomeMedico = m.getNome();
                System.out.println("\n---------------------------------------------");
                System.out.println("|          Acesso Permitido (Médico)          |");
                System.out.println("===============================================");
                usuarioValido = true;
            }
        }
        for (MedicoEspecialista me : MedicoEspecialista.geteList()) {
            if (email.equals(me.getLogin()) && senha.equals(me.getSenha())) {
                usuarioLogado = email;
                funcaoUsuario = "Medico Especialista";
                nomeMedicoE = me.getNome();
                System.out.println("\n---------------------------------------------");
                System.out.println("|    Acesso Permitido (Médico Especialista)    |");
                System.out.println("===============================================");
                usuarioValido = true;
            }
        }

        if (!usuarioValido) {
            System.out.println("\n-------------------------------------------");
            System.out.println("|              Dados inválidos              |");
            System.out.println("|             Tente novamente!              |");
            System.out.println("=============================================");
            login();
        }
    }

    public static void menuIncial() {
        login();
        int opcao = 888;

        if (usuarioLogado == null) {
            System.out.println("\n---------------------------------------------");
            System.out.println("|         Você precisa logar primeiro!        |");
            System.out.println("===============================================");
            login();
        }

        do {
            if (funcaoUsuario.equals("Paciente")) {
                System.out.println("\n===============================================");
                System.out.println("|               + MENU PACIENTE +              |");
                System.out.println("------------------------------------------------");
                System.out.println("     Olá, " + nomePaciente + ", seja bem-vindo(a)! ");
                System.out.println("|                                              |");
                System.out.println("|    [1] Imprimir Prontuário                   |");
                System.out.println("|                                              |");
                System.out.println("|    (0) Sair                                  |");
                System.out.println("------------------------------------------------\n");
            } else if (funcaoUsuario.equals("Medico")) {
                System.out.println("\n=================================================");
                System.out.println("|                + MENU MÉDICO +                |");
                System.out.println("-------------------------------------------------");
                System.out.println("      Olá, " + nomeMedico + ", seja bem-vindo(a)!   ");
                System.out.println("|                                               |");
                System.out.println("|    [1] Imprimir prontuário do paciente        |");
                System.out.println("|    [2] Registrar atendimento                  |");
                System.out.println("|    [3] Solicitar exame                        |");
                System.out.println("|    [4] Listar atendimentos                    |");
                System.out.println("|                                               |");
                System.out.println("|    [0] Sair                                   |");
                System.out.println("-------------------------------------------------\n");
            } else if (funcaoUsuario.equals("Medico Especialista")) {
                System.out.println("\n==============================================");
                System.out.println("|        + MENU MÉDICO ESPECIALISTA +         |");
                System.out.println("-----------------------------------------------");
                System.out.println("      Olá, " + nomeMedicoE + ", seja bem-vindo(a)!");
                System.out.println("|                                             |");
                System.out.println("|    [1] Analisar exame                       |");
                System.out.println("|    [2] Registrar laudo                      |");
                System.out.println("|    [3] Listar exames pendentes de laudo     |");
                System.out.println("|                                             |");
                System.out.println("|    [0] Sair                                 |");
                System.out.println("-----------------------------------------------\n");
            }
            System.out.println("Digite uma opção: ");
            Scanner leia = new Scanner(System.in);
            try {
                opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        if (funcaoUsuario.equals("Paciente")) {
                            Paciente paciente = new Paciente();
                            paciente.imprimirProntuario();
                        } else if (funcaoUsuario.equals("Medico")) {
                            Medico medico = new Medico();
                            medico.imprimirProntuario();
                        } else if (funcaoUsuario.equals("Medico Especialista")) {
                            MedicoEspecialista.analisarExame();
                        }
                        break;
                    case 2:
                        if (funcaoUsuario.equals("Medico")) {
                            Atendimento.registroAtendimento();
                        } else if (funcaoUsuario.equals("Medico Especialista")) {
                            System.out.println("Digite o id do exame: ");
                            int idExame = leia.nextInt();
                            MedicoEspecialista.registrarLaudo(null, idExame);
                        }
                        break;
                    case 3:
                        if (funcaoUsuario.equals("Medico")) {
                            Medico.solicitarExame();
                        } else if (funcaoUsuario.equals("Medico Especialista")) {
                            MedicoEspecialista.listarExamesPendentes();
                        }
                        break;
                    case 4:
                        if (funcaoUsuario.equals("Medico")) {
                            Atendimento.listarAtendimento();
                        }
                        break;
                    case 0:
                        System.out.println("=> Saindo do sistema ...");
                        usuarioLogado = null;
                        funcaoUsuario = null;
                        break;
                    default:
                        System.out.println("=> Opção invalida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("=> Por favor digite um número inteiro! ");
            }

        } while (opcao != 0);
    }
}
