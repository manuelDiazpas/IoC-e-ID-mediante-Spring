package controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.Cajero;
import models.EmpleadosConfig;
import models.Gerente;
import models.OficialProcesamiento;
import models.RepMarketing;

public class Listados {

	
	
	public static void listadoGerente() {
		AnnotationConfigApplicationContext anotacion = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		Gerente g = anotacion.getBean("gerente", Gerente.class);

		System.out.println();
		System.out.println(g.getNombre());
		System.out.println(g.getDni());
		System.out.println(g.getBanco());
		System.out.println(g.getTrabajo());
		System.out.println(g.getSalario());

		anotacion.close();
	}
	
	public static void listadoOficialProcesamiento() {
		AnnotationConfigApplicationContext anotacion = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		OficialProcesamiento op = anotacion.getBean("oficialProcesamiento", OficialProcesamiento.class);

		System.out.println();
		System.out.println(op.getNombre());
		System.out.println(op.getDni());
		System.out.println(op.getBanco());
		System.out.println(op.getTrabajo());
		System.out.println(op.getSalario());

		anotacion.close();
	}
	
	public static void listadoCajero() {
		AnnotationConfigApplicationContext anotacion = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		Cajero c = anotacion.getBean("cajero", Cajero.class);

		System.out.println();
		System.out.println(c.getNombre());
		System.out.println(c.getDni());
		System.out.println(c.getBanco());
		System.out.println(c.getTrabajo());
		System.out.println(c.getSalario());

		anotacion.close();
	}
	
	public static void listadoRepMarketing() {
		AnnotationConfigApplicationContext anotacion = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		RepMarketing rm = anotacion.getBean("repMarketing", RepMarketing.class);

		System.out.println();
		System.out.println(rm.getNombre());
		System.out.println(rm.getDni());
		System.out.println(rm.getBanco());
		System.out.println(rm.getTrabajo());
		System.out.println(rm.getSalario());

		anotacion.close();
	}
}
