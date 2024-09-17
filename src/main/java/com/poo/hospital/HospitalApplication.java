package com.poo.hospital;

import com.poo.hospital.entidades.Atendimento;
import com.poo.hospital.entidades.Medico;
import com.poo.hospital.entidades.MedicoEspecialista;
import com.poo.hospital.entidades.Paciente;
import com.poo.hospital.entidades.PopulaSistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);

		PopulaSistema.populaDados();
		//Atendimento.registroAtendimento();
		Atendimento.listarAtendimento();
		//Medico.registraAtendimento();
		//Medico.solicitarExame();
		//MedicoEspecialista.analisarExame();
	
		
	}

}
