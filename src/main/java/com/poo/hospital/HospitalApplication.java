package com.poo.hospital;

import com.poo.hospital.entidades.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);

		PopulaSistema.populaDados();
		Menu.menuIncial();

		//Atendimento.registroAtendimento();
		//Atendimento.listarAtendimento();
		//Medico.registraAtendimento();
		//Medico.solicitarExame();
		//MedicoEspecialista.analisarExame();
	
		
	}

}
