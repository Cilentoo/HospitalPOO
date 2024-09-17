package com.poo.hospital.entidades;


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
}
