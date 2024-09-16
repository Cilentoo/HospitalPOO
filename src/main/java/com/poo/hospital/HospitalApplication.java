package com.poo.hospital;

import com.poo.hospital.entidades.Atendimento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);

		Atendimento.registroAtendimento();
		Atendimento.listarAtendimento();
	}

}
