package com.poo.hospital.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.poo.hospital.entidades.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MedicoEspecialista extends Pessoa {
    private String especialidade;
    private String crm;
    private Exame exame;


    public static List <MedicoEspecialista> eList = new ArrayList<>();

    public static List<MedicoEspecialista> geteList(){
        return eList;

    }


    public static void analisarExame(){
        System.out.println("\n=============================================");
        System.out.println("|              * ANÁLISE DE EXAME *           |");
        System.out.println("-----------------------------------------------");
        //System.out.println("Exame sendo analisado por: " + ;  
        Exame exame = new Exame();
        exame.setStatus(Status.CONCLUIDO);
        System.out.println("\n---------------------------------------------");
        System.out.println("|          Exame analisado econcluído!        |");
        System.out.println("=============================================\n");
    }
    public static void imprimirLaudo (String laudo, int idExame){
        Exame exameEncontrado = null;
        for (Exame e : Exame.getExameList()){
            if (e.getId() == idExame){
                exameEncontrado = e;
                break;
            }
        }
        if (exameEncontrado == null) {
            System.out.println("exame não encontrado");
            return;
        }
        System.out.println("Laudo do exame");
        System.out.println("Medico solicitante: " + exameEncontrado.getMedicoSolicitante().getNome());
        System.out.println("Medico responsável pelo laudo: " + exameEncontrado.getMedicoLaudo().getNome());
        System.out.println("Especialidade: " + exameEncontrado.getMedicoLaudo().getEspecialidade());
        System.out.println("Descrição: " + exameEncontrado.getDescricao());
        System.out.println("Digite laudo do exame: ");
        Scanner leia = new Scanner(System.in);
        String laudoEspecialista = leia.nextLine();
        exameEncontrado.setLaudo(laudoEspecialista);
        System.out.println("Laudo Concluído.");
            
    }

    public static void listarExamesPendentes(){
        System.out.println("\n===================================");
        System.out.println("|        * LISTA DE EXAMES PENDENTES *      |");
        System.out.println("======================================");

        boolean temExamesPendentes = false;

        for (Exame exame : Exame.getExameList()){
            if (exame.getStatus() == Status.PENDENTE){
                temExamesPendentes = true;
                System.out.println("Exame referente ao Id: " + exame.getId() + exame.getDescricao() +" Pendente.");
            }
        }
        if (!temExamesPendentes){
            System.out.println("Nenhum exame pendente de laudo encontrado");
        }
    }


}


