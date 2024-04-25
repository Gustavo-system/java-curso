package com.udemy.modulo.one.helloworld;

import com.udemy.modulo.one.helloworld.inyecciones.Coche;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	//public static void main(String[] args) {SpringApplication.run(HelloWorldApplication.class, args);}

	/**
	 * Este es el contexto de spring al iniciar la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);

		Coche coche = context.getBean(Coche.class);

		System.out.println(coche);

	}

}
