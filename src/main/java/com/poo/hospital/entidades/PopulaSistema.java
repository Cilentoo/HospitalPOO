package com.poo.hospital.entidades;

import java.time.LocalDateTime;

import com.poo.hospital.entidades.enums.Status;

public class PopulaSistema {

    public static void populaDados() {
        // Criando alguns pacientes
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Carlos Souza");
        paciente1.setCarteiraSus("12345678901");
        paciente1.setLogin("carl@gmail.com");
        paciente1.setSenha("123");

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Ana Oliveira");
        paciente2.setCarteiraSus("98765432101");
        paciente2.setLogin("ana@gmail.com");
        paciente2.setSenha("123");

        Paciente paciente3 = new Paciente();
        paciente3.setNome("Beatriz Mendes");
        paciente3.setCarteiraSus("11121314151");
        paciente3.setLogin("beatriz@gmail.com");
        paciente3.setSenha("123");

        Paciente paciente4 = new Paciente();
        paciente4.setNome("Daniel Silva");
        paciente4.setCarteiraSus("22232424252");
        paciente4.setLogin("dan@gmail.com");
        paciente4.setSenha("123");

        Paciente paciente5 = new Paciente();
        paciente5.setNome("Eduardo Santos");
        paciente5.setCarteiraSus("33343535353");
        paciente5.setLogin("eduardo@gmail.com");
        paciente5.setSenha("123");

        Paciente paciente6 = new Paciente();
        paciente6.setNome("Fernanda Oliveira");
        paciente6.setCarteiraSus("44454646464");
        paciente6.setLogin("fernanda@gmail.com");
        paciente6.setSenha("123");

        Paciente paciente7 = new Paciente();
        paciente7.setNome("Gabriel Souza");
        paciente7.setCarteiraSus("55565757575");
        paciente7.setLogin("gabriel@gmail.com");
        paciente7.setSenha("123");

        Paciente paciente8 = new Paciente();
        paciente8.setNome("Hugo Mendes");
        paciente8.setCarteiraSus("66676868686");
        paciente8.setLogin("hugo@gmail.com");
        paciente8.setSenha("123");

        Paciente paciente9 = new Paciente();
        paciente9.setNome("Isabela Lima");
        paciente9.setCarteiraSus("77787979797");
        paciente9.setLogin("isabela@gmail.com");
        paciente9.setSenha("123");

        Paciente paciente10 = new Paciente();
        paciente10.setNome("Juliana Clara");
        paciente10.setCarteiraSus("88889080808");
        paciente10.setLogin("juliana@gmail.com");
        paciente10.setSenha("123");

        Paciente paciente11 = new Paciente();
        paciente11.setNome("Kaique Carlos");
        paciente11.setCarteiraSus("99990090909");
        paciente11.setLogin("kaique@gmail.com");
        paciente11.setSenha("123");

        Paciente paciente12 = new Paciente();
        paciente12.setNome("Larissa Luiz");
        paciente12.setCarteiraSus("10101101011");
        paciente12.setLogin("larissa@gmail.com");
        paciente12.setSenha("123");

        Paciente paciente13 = new Paciente();
        paciente13.setNome("Matheus Maria");
        paciente13.setCarteiraSus("11111211111");
        paciente13.setLogin("matheus@gmail.com");
        paciente13.setSenha("123");

        // Adicionando os pacientes na lista
        Paciente.getPacienteList().add(paciente1);
        Paciente.getPacienteList().add(paciente2);
        Paciente.getPacienteList().add(paciente3);
        Paciente.getPacienteList().add(paciente4);
        Paciente.getPacienteList().add(paciente5);
        Paciente.getPacienteList().add(paciente6);
        Paciente.getPacienteList().add(paciente7);
        Paciente.getPacienteList().add(paciente8);
        Paciente.getPacienteList().add(paciente9);
        Paciente.getPacienteList().add(paciente10);
        Paciente.getPacienteList().add(paciente11);
        Paciente.getPacienteList().add(paciente12);
        Paciente.getPacienteList().add(paciente13);

        // Criando médicos
        Medico medico1 = new Medico();
        medico1.setNome("Dr. João Lima");
        medico1.setCrm("CRM12345");
        medico1.setLogin("med@gmail.com");
        medico1.setSenha("123");

        Medico medico2 = new Medico();
        medico2.setNome("Dra. Maria Clara");
        medico2.setCrm("CRM67890");
        medico2.setSenha("123");

        Medico medico3 = new Medico();
        medico3.setNome("Dr. Pedro Paulo");
        medico3.setCrm("CRM34567");
        medico3.setLogin("ped@gmail.com");
        medico3.setSenha("123");

        Medico medico4 = new Medico();
        medico4.setNome("Dra. Rafaela Rodrigues");
        medico4.setCrm("CRM45678");
        medico4.setSenha("123");

        Medico medico5 = new Medico();
        medico5.setNome("Dr. Tiago Tomas");
        medico5.setCrm("CRM56789");
        medico5.setSenha("123");

        Medico medico6 = new Medico();
        medico6.setNome("Dra. Ursula Uchoa");
        medico6.setCrm("CRM67890");
        medico6.setSenha("123");

        Medico medico7 = new Medico();
        medico7.setNome("Dr. Vinicius Viana");
        medico7.setCrm("CRM78901");
        medico7.setSenha("123");

        Medico medico8 = new Medico();
        medico8.setNome("Dra. Wanessa Wong");
        medico8.setCrm("CRM89012");
        medico8.setSenha("123");

        Medico medico9 = new Medico();
        medico9.setNome("Dr. Xisto Xavier");
        medico9.setCrm("CRM90123");
        medico9.setSenha("123");

        Medico medico10 = new Medico();
        medico10.setNome("Dra. Yara Youssef");
        medico10.setCrm("CRM01234");
        medico10.setSenha("123");

        Medico medico11 = new Medico();
        medico11.setNome("Dr. Zairo Ziegler");
        medico11.setCrm("CRM12345");
        medico11.setSenha("123");

        Medico medico12 = new Medico();
        medico12.setNome("Dra. Alberto Almeida");
        medico12.setCrm("CRM23456");
        medico12.setSenha("123");

        Medico.getMedicoList().add(medico1);
        Medico.getMedicoList().add(medico2);
        Medico.getMedicoList().add(medico3);
        Medico.getMedicoList().add(medico4);
        Medico.getMedicoList().add(medico5);
        Medico.getMedicoList().add(medico6);
        Medico.getMedicoList().add(medico7);
        Medico.getMedicoList().add(medico8);
        Medico.getMedicoList().add(medico9);
        Medico.getMedicoList().add(medico10);
        Medico.getMedicoList().add(medico11);
        Medico.getMedicoList().add(medico12);

        MedicoEspecialista me1 = new MedicoEspecialista();
        me1.setNome("Dr. Luiz Carlos");
        me1.setCrm("CRM87421");
        me1.setEspecialidade("Ortopedista");
        me1.setLogin("lc@gmail.com");
        me1.setSenha("123");
        MedicoEspecialista.geteList().add(me1);

        MedicoEspecialista me2 = new MedicoEspecialista();
        me2.setNome("Dr. Luiz Carlos");
        me2.setCrm("CRM87421");
        me2.setEspecialidade("Ortopedista");
        me2.setLogin("lc@gmail.com");
        me2.setSenha("123");
        MedicoEspecialista.geteList().add(me2);

        MedicoEspecialista me3 = new MedicoEspecialista();
        me3.setNome("Dr. Pedro Paulo");
        me3.setCrm("CRM34567");
        me3.setEspecialidade("Cardiologista");
        me3.setLogin("ped@gmail.com");
        me3.setSenha("123");
        MedicoEspecialista.geteList().add(me3);

        MedicoEspecialista me4 = new MedicoEspecialista();
        me4.setNome("Dra. Rafaela Rodrigues");
        me4.setCrm("CRM45678");
        me4.setEspecialidade("Neurologista");
        me4.setLogin("raf@gmail.com");
        me4.setSenha("123");
        MedicoEspecialista.geteList().add(me4);

        MedicoEspecialista me5 = new MedicoEspecialista();
        me5.setNome("Dr. Tiago Tomas");
        me5.setCrm("CRM56789");
        me5.setEspecialidade("Gastroenterologista");
        me5.setLogin("tiago@gmail.com");
        me5.setSenha("123");
        MedicoEspecialista.geteList().add(me5);

        MedicoEspecialista me6 = new MedicoEspecialista();
        me6.setNome("Dra. Ursula Uchoa");
        me6.setCrm("CRM67890");
        me6.setEspecialidade("Endocrinologista");
        me6.setLogin("ur@gmail.com");
        me6.setSenha("123");
        MedicoEspecialista.geteList().add(me6);

        MedicoEspecialista me7 = new MedicoEspecialista();
        me7.setNome("Dr. Vinicius Viana");
        me7.setCrm("CRM78901");
        me7.setEspecialidade("Dermatologista");
        me7.setLogin("vini@gmail.com");
        me7.setSenha("123");
        MedicoEspecialista.geteList().add(me7);

        // Criando atendimentos
        Atendimento atendimento1 = new Atendimento(Atendimento.contadorId, paciente1, medico1);
        atendimento1.setDataHora(LocalDateTime.of(2024, 9, 17, 10, 0));
        Atendimento.getAtendimentoList().add(atendimento1);

        Atendimento atendimento2 = new Atendimento(Atendimento.contadorId, paciente2, medico2);
        atendimento2.setDataHora(LocalDateTime.of(2024, 9, 17, 14, 30));
        Atendimento.getAtendimentoList().add(atendimento2);

        Atendimento atendimento3 = new Atendimento(Atendimento.contadorId, paciente3, medico1);
        atendimento3.setDataHora(LocalDateTime.of(2024, 9, 17, 16, 0));
        Atendimento.getAtendimentoList().add(atendimento3);

        // Criando atendimentos
        Atendimento atendimento4 = new Atendimento(Atendimento.contadorId, paciente4, medico3);
        atendimento4.setDataHora(LocalDateTime.of(2024, 9, 17, 11, 0));
        Atendimento.getAtendimentoList().add(atendimento4);

        Atendimento atendimento5 = new Atendimento(Atendimento.contadorId, paciente5, medico4);
        atendimento5.setDataHora(LocalDateTime.of(2024, 9, 17, 12, 0));
        Atendimento.getAtendimentoList().add(atendimento5);

        Atendimento atendimento6 = new Atendimento(Atendimento.contadorId, paciente6, medico5);
        atendimento6.setDataHora(LocalDateTime.of(2024, 9, 17, 13, 0));
        Atendimento.getAtendimentoList().add(atendimento6);

        Atendimento atendimento7 = new Atendimento(Atendimento.contadorId, paciente7, medico6);
        atendimento7.setDataHora(LocalDateTime.of(2024, 9, 17, 14, 0));
        Atendimento.getAtendimentoList().add(atendimento7);

        Atendimento atendimento8 = new Atendimento(Atendimento.contadorId, paciente8, medico7);
        atendimento8.setDataHora(LocalDateTime.of(2024, 9, 17, 15, 0));
        Atendimento.getAtendimentoList().add(atendimento8);

        Atendimento atendimento9 = new Atendimento(Atendimento.contadorId, paciente9, medico8);
        atendimento9.setDataHora(LocalDateTime.of(2024, 9, 17, 16, 0));
        Atendimento.getAtendimentoList().add(atendimento9);

        Atendimento atendimento10 = new Atendimento(Atendimento.contadorId, paciente10, medico9);
        atendimento10.setDataHora(LocalDateTime.of(2024, 9, 17, 17, 0));
        Atendimento.getAtendimentoList().add(atendimento10);

        Atendimento atendimento11 = new Atendimento(Atendimento.contadorId, paciente11, medico10);
        atendimento11.setDataHora(LocalDateTime.of(2024, 9, 17, 18, 0));
        Atendimento.getAtendimentoList().add(atendimento11);

        Atendimento atendimento12 = new Atendimento(Atendimento.contadorId, paciente12, medico11);
        atendimento12.setDataHora(LocalDateTime.of(2024, 9, 17, 19, 0));
        Atendimento.getAtendimentoList().add(atendimento12);

        // Adicionando os atendimentos à lista global
        Atendimento.getAtendimentoList().add(atendimento1);
        Atendimento.getAtendimentoList().add(atendimento2);
        Atendimento.getAtendimentoList().add(atendimento3);
        Atendimento.getAtendimentoList().add(atendimento4);
        Atendimento.getAtendimentoList().add(atendimento5);
        Atendimento.getAtendimentoList().add(atendimento6);
        Atendimento.getAtendimentoList().add(atendimento7);
        Atendimento.getAtendimentoList().add(atendimento8);
        Atendimento.getAtendimentoList().add(atendimento9);
        Atendimento.getAtendimentoList().add(atendimento10);
        Atendimento.getAtendimentoList().add(atendimento11);
        Atendimento.getAtendimentoList().add(atendimento12);

        // Criando exames
        Exame exame1 = new Exame();
        exame1.setMedicoSolicitante(medico1);
        exame1.setMedicoLaudo(me1);
        exame1.setDescricao("Raio-X do pé esquerdo");
        exame1.setStatus(Status.PENDENTE);
        Exame.exameList.add(exame1);
        atendimento1.getExames().add(exame1);

        Exame exame2 = new Exame();
        exame2.setMedicoSolicitante(medico2);
        exame2.setMedicoLaudo(me2);
        exame2.setDescricao("Raio-X da perna direita");
        exame2.setStatus(Status.CONCLUIDO);
        Exame.exameList.add(exame2);
        atendimento2.getExames().add(exame2);

        Exame exame3 = new Exame();
        exame3.setMedicoSolicitante(medico3);
        exame3.setMedicoLaudo(me3);
        exame3.setDescricao("Ultrassom abdominal");
        exame3.setStatus(Status.PENDENTE);
        Exame.exameList.add(exame3);
        atendimento3.getExames().add(exame3);

        Exame exame4 = new Exame();
        exame4.setMedicoSolicitante(medico4);
        exame4.setMedicoLaudo(me4);
        exame4.setDescricao("Tomografia computadorizada do tórax");
        exame4.setStatus(Status.CONCLUIDO);
        Exame.exameList.add(exame4);
        atendimento4.getExames().add(exame4);

        Exame exame5 = new Exame();
        exame5.setMedicoSolicitante(medico5);
        exame5.setMedicoLaudo(me5);
        exame5.setDescricao("Ressonância magnética do joelho");
        exame5.setStatus(Status.PENDENTE);
        Exame.exameList.add(exame5);
        atendimento5.getExames().add(exame5);

        Exame exame6 = new Exame();
        exame6.setMedicoSolicitante(medico6);
        exame6.setMedicoLaudo(me1);
        exame6.setDescricao("Exame de sangue - hemograma");
        exame6.setStatus(Status.CONCLUIDO);
        Exame.exameList.add(exame6);
        atendimento6.getExames().add(exame6);

        Exame exame7 = new Exame();
        exame7.setMedicoSolicitante(medico7);
        exame7.setMedicoLaudo(me2);
        exame7.setDescricao("Teste de glicemia");
        exame7.setStatus(Status.PENDENTE);
        Exame.exameList.add(exame7);
        atendimento7.getExames().add(exame7);

        Exame exame8 = new Exame();
        exame8.setMedicoSolicitante(medico8);
        exame8.setMedicoLaudo(me3);
        exame8.setDescricao("Exame de colesterol");
        exame8.setStatus(Status.CONCLUIDO);
        Exame.exameList.add(exame8);
        atendimento8.getExames().add(exame8);

        Exame exame9 = new Exame();
        exame9.setMedicoSolicitante(medico9);
        exame9.setMedicoLaudo(me4);
        exame9.setDescricao("Eletrocardiograma (ECG)");
        exame9.setStatus(Status.PENDENTE);
        Exame.exameList.add(exame9);
        atendimento9.getExames().add(exame9);

        Exame exame10 = new Exame();
        exame10.setMedicoSolicitante(medico10);
        exame10.setMedicoLaudo(me5);
        exame10.setDescricao("Radiografia da coluna cervical");
        exame10.setStatus(Status.CONCLUIDO);
        Exame.exameList.add(exame10);
        atendimento10.getExames().add(exame10);

        Exame exame11 = new Exame();
        exame11.setMedicoSolicitante(medico11);
        exame11.setMedicoLaudo(me6);
        exame11.setDescricao("Teste de função pulmonar");
        exame11.setStatus(Status.PENDENTE);
        Exame.exameList.add(exame11);
        atendimento11.getExames().add(exame11);

        Exame exame12 = new Exame();
        exame12.setMedicoSolicitante(medico12);
        exame12.setMedicoLaudo(me7);
        exame12.setDescricao("Exame de urina");
        exame12.setStatus(Status.CONCLUIDO);
        Exame.exameList.add(exame12);
        atendimento12.getExames().add(exame12);
    }

}
