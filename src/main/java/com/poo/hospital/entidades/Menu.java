package com.poo.hospital.entidades;


import com.poo.hospital.entidades.controladores.Prontuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static String usuarioLogado = null;
    private static String funcaoUsuario = null;

    public static void login(){
        Scanner leia = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println(" UNIDADE DE PRONTO ATENDIMENTO ");
        System.out.println("================================");

        System.out.print("Entre com seu email: ");
        String email = leia.nextLine();

        System.out.println("Entre com a sua senha: ");
        String senha = leia.nextLine();

        boolean usuarioValido = false;

        for(Paciente p :Paciente.getPacienteList()){
          if(email.equals(p.getLogin()) && senha.equals(p.getSenha())){
              usuarioLogado = email;
              funcaoUsuario = "Paciente";
              System.out.println("Usuário logado com sucesso. (Paciente)");
              usuarioValido = true;
          }
        }
        for (Medico m : Medico.getMedicoList()){
            if (email.equals(m.getLogin()) && senha.equals(m.getSenha())) {
                usuarioLogado = email;
                funcaoUsuario = "Medico";
                System.out.println("Usuário logado com sucesso. (Médico)");
                usuarioValido = true;
            }
        }
        for (MedicoEspecialista me : MedicoEspecialista.geteList()){
            if (email.equals(me.getLogin()) && senha.equals(me.getSenha())){
                usuarioLogado = email;
                funcaoUsuario = "Medico Especialista";
                System.out.println("Usuário logado com sucesso. (Médico Especialista)");
                usuarioValido = true;
            }
        }

        if (!usuarioValido){
            System.out.println("Erro, email ou senha incorretos tente novamente.");
            login();
        }
    }

    public static void menuIncial(){
        login();
        int opcao = 888;

        if (usuarioLogado == null){
            System.out.println("Você precisa logar primeiro");
            login();
        }

        do{
            System.out.println("\n Menu ");
            System.out.println("O que deseja fazer: ");
            if (funcaoUsuario.equals("Paciente")){
                System.out.println("1- Imprimir prontuário");
            } else if (funcaoUsuario.equals("Medico")) {
                System.out.println("1- Imprimir prontuário");
                System.out.println("2- Registrar atendimento");
                System.out.println("3- Solicitar exame");
            }else if (funcaoUsuario.equals("Medico Especialista")){
                System.out.println("1- Analisar exame");
                System.out.println("2- Registrar laudo");
                System.out.println("3- Listar exames pendentes de laudo");
            }
            System.out.println("0- Sair\n");
            System.out.println("Digite uma opção: ");
            Scanner leia = new Scanner(System.in);
            try{
                opcao = leia.nextInt();
                switch (opcao){
                    case 1:
                        if (funcaoUsuario.equals("Paciente")){
                            Paciente paciente = new Paciente();
                            paciente.imprimirProntuario();
                        }else if (funcaoUsuario.equals("Medico")){
                            Medico medico = new Medico();
                            medico.imprimirProntuario();
                        }else if (funcaoUsuario.equals("Medico especialista")){
                            MedicoEspecialista.analisarExame();
                        }
                        break;
                    case 2:
                        if (funcaoUsuario.equals("Medico")){
                            Medico.registraAtendimento();
                        }else if (funcaoUsuario.equals("Medico especialista")){
                            System.out.println("REGISTRANDO LAUDO");
                        }
                        break;
                    case 3:
                        if (funcaoUsuario.equals("Medico")){
                            Medico.solicitarExame();
                        }else if (funcaoUsuario.equals("Medico especialista")){
                            System.out.println("Listando exames pendentes");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo");
                        usuarioLogado = null;
                        funcaoUsuario = null;
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Por favor digite um número inteiro");
            }


        }while (opcao != 0);
    }
}
