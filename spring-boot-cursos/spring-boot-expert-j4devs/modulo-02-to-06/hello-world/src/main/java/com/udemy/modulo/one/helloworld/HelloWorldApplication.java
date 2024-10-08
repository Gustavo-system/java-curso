package com.udemy.modulo.one.helloworld;

import com.udemy.modulo.one.helloworld.aop.TarjetObject;
import com.udemy.modulo.one.helloworld.aop.practica.MetodosGenericos;
import com.udemy.modulo.one.helloworld.inyecciones.Coche;
import com.udemy.modulo.one.helloworld.lifecycle.ExplicitBeen;
import com.udemy.modulo.one.helloworld.lifecycle.LifeCycleBeen;
import com.udemy.modulo.one.helloworld.profiles.EnviromentService;
import com.udemy.modulo.one.helloworld.qualifiers.Granja;
import com.udemy.modulo.one.helloworld.scopes.EjemploScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

	private static final Logger log = LoggerFactory.getLogger(HelloWorldApplication.class);

	// declaration beans explicit
	@Bean
	public String getNombreAplicacion(){
		return "curso de spring boot udemy";
	}

	// declaration de un been explicito custom haciendo referencia por medio de los parameters de la annotation Been
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ExplicitBeen getExplicitBeen(){
		return new ExplicitBeen();
	}

	//public static void main(String[] args) {SpringApplication.run(HelloWorldApplication.class, args);}

	/**
	 * Este es el contexto de spring al iniciar la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);


		/*
		 * inyeccion de dependencias
		 */
		Coche coche = context.getBean(Coche.class);
		log.info("Objeto coche {}", coche);

		/**
		 * Quealifiers
		 * Si no se defina que implementacion se usara, dara un error
		 * Animal animal = context.getBean("pajarito", Animal.class);
		 * log.info("Objeto animal: nombre {} edad {}", animal.getNombre(), animal.getEdad());
		 */
		Granja granja = context.getBean(Granja.class);
		granja.imprimirInfo();

		EnviromentService enviromentService = context.getBean(EnviromentService.class);
		log.info("profile {}", enviromentService.getEnviroment());

		EjemploScopeService ejemploScopeService0 = context.getBean(EjemploScopeService.class);
		EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);

		log.info("beean equals {}", ejemploScopeService0.equals(ejemploScopeService1));
		log.info("beean == {}", ejemploScopeService0 == ejemploScopeService1);

		// declaracion de beens cuando no podemos acceder al codigo o no podemos realizar modificaciones
		String nombreAplicacion = context.getBean(String.class);
		log.info("Nombre de la aplicacion -> {}", nombreAplicacion);

		// ciclos de vida
		LifeCycleBeen lifeCycleBeen = context.getBean(LifeCycleBeen.class);
		ExplicitBeen explicitBeen = context.getBean(ExplicitBeen.class);

		// programacion orientada a aspectos
		TarjetObject tarjetObject = context.getBean(TarjetObject.class);
		tarjetObject.hello();
		tarjetObject.parseString("hola desde el init");

		log.info("---------------------------------------------");

		MetodosGenericos metodosGenericos = context.getBean(MetodosGenericos.class);
		log.info("valor retorno con la anotacion personalizada -> {} ", metodosGenericos.convertAllToUpperCase("gus"));

	}

}
