package co.edu.unicauca.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.unicauca.core.service.TurnoServiceImp;

public class ApplicationPruebas {

	public static void main(String[] args) {
		TurnoServiceImp turnoServiceImp=new TurnoServiceImp();
		
		String prueba="700,900";
		
		System.out.println(turnoServiceImp.formaterString(prueba));
		
		prueba="800,1200";
		
		System.out.println(turnoServiceImp.formaterString(prueba));
		
		
		prueba="1400,1800";
		
		System.out.println(turnoServiceImp.formaterString(prueba));
		
		prueba="630,930";
		
		System.out.println(turnoServiceImp.formaterString(prueba));
		
		System.out.println(LocalDate.now());
	
	}

}
