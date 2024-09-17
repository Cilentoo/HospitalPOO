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

    public static List<MedicoEspecialista> geteList() {
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
        for (Exame e: Exame.exameList){
            if (e.getId()==idExame){exameEncontrado = e;
                break;


            }
        }
        if (exameEncontrado == null) {System.out.println("exame não encontrado"); 
        return;
    }   System.out.println("laudo do exame");
        System.out.println("medico solicitante: " + exameEncontrado.getMedicoSolicitante().getNome());
        System.out.println("medico responsável pelo laudo: " + exameEncontrado.getMedicoLaudo().getNome());
        System.out.println("especialidade: " + exameEncontrado.getMedicoLaudo().getEspecialidade());
        System.out.println("descrição: " + exameEncontrado.getDescricao());
        System.out.println("digite laudo do exame: ");
        Scanner leia = new Scanner(System.in);
        String laudoEspecialista = leia.nextLine();
        exameEncontrado.setLaudo(laudoEspecialista); 
            
        } 
        
    }


