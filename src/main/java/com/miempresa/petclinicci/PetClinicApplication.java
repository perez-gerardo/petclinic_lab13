package com.miempresa.petclinicci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicación principal de PetClinic para laboratorio de CI/CD
 * Configurado para Integración Continua con Jenkins, Maven y GitHub
 * 
 * @author Gerardo
 * @version 1.0.0
 */
@SpringBootApplication
public class PetClinicApplication {

	/**
	 * Método principal de la aplicación Spring Boot
	 * Inicia el servidor y carga la aplicación PetClinic
	 * 
	 * @param args Argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		System.out.println("========================================");
		System.out.println("  PetClinic CI Lab - Gerardo");
		System.out.println("  Iniciando aplicación...");
		System.out.println("========================================");
		SpringApplication.run(PetClinicApplication.class, args);
	}

}

