package com.poo.hospital.entidades;

import java.time.LocalDateTime;

import com.poo.hospital.entidades.enums.Status;

public class PopulaSistema {

    public static void populaDados() {
         // Criando alguns pacientes
    Paciente paciente1 = new Paciente();
    paciente1.setNome("Carlos Souza");
    paciente1.setCarteiraSus("123456789");

    Paciente paciente2 = new Paciente();
    paciente2.setNome("Ana Oliveira");
    paciente2.setCarteiraSus("987654321");

    Paciente paciente3 = new Paciente();
    paciente3.setNome("Beatriz Mendes");
    paciente3.setCarteiraSus("111213141");

    // Adicionando os pacientes na lista
    Paciente.getPacienteList().add(paciente1);
    Paciente.getPacienteList().add(paciente2);
    Paciente.getPacienteList().add(paciente3);

    // Criando médicos
    Medico medico1 = new Medico();
    medico1.setNome("Dr. João Lima");
    medico1.setCrm("CRM12345");

    Medico medico2 = new Medico();
    medico2.setNome("Dra. Maria Clara");
    medico2.setCrm("CRM67890");

    Medico.getMedicoList().add(medico1);
    Medico.getMedicoList().add(medico2);

    // Criando atendimentos
    Atendimento atendimento1 = new Atendimento(Atendimento.contadorId, paciente1, medico1);
    atendimento1.setDataHora(LocalDateTime.of(2024, 9, 17, 10, 0));

    Atendimento atendimento2 = new Atendimento(Atendimento.contadorId, paciente2, medico2);
    atendimento2.setDataHora(LocalDateTime.of(2024, 9, 17, 14, 30));

    Atendimento atendimento3 = new Atendimento(Atendimento.contadorId, paciente3, medico1);
    atendimento3.setDataHora(LocalDateTime.of(2024, 9, 17, 16, 0));

    // Adicionando os atendimentos à lista global
    Atendimento.getAtendimentoList().add(atendimento1);
    Atendimento.getAtendimentoList().add(atendimento2);
    Atendimento.getAtendimentoList().add(atendimento3);

    // Criando exames
    Exame exame1 = new Exame();
    exame1.setMedicoSolicitante(medico1);
    exame1.setStatus(Status.PENDENTE);

    Exame exame2 = new Exame();
    exame2.setMedicoSolicitante(medico2);
    exame2.setStatus(Status.CONCLUIDO);

    // Adicionando exames aos atendimentos
    atendimento1.getExames().add(exame1);
    atendimento2.getExames().add(exame2);

    // Exibindo prontuários
    paciente1.imprimirProntuario();
    paciente2.imprimirProntuario();
    paciente3.imprimirProntuario();
    }

}
