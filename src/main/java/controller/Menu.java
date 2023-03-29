package controller;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.EmpleadosConfig;
import models.Gerente;

public class Menu {
	
	public static void menuEmpleados(int opc) {
		System.out.println("***************************************************************");
		System.out.println("*   Lista de los empleados recientes de Bancos cercanos       *");
		System.out.println("***************************************************************");
		System.out.println();
		System.out.println("1. Gerente");
		System.out.println("2. Cajero");
		System.out.println("3. Oficial de procesamiento");
		System.out.println("4. Representante de Marketing");
		while(opc<1 || opc>4) {
		System.out.println();
		opc = LeerInt("Seleccione un puesto: ");
		

			switch(opc) {
			case 1: Listados.listadoGerente(); break;
			case 2: Listados.listadoCajero();; break;
			case 3: Listados.listadoOficialProcesamiento(); break;
			case 4: Listados.listadoRepMarketing();; break;
			default: System.out.println("Opcion no valida.");
			}
		}
	}



	static int LeerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;

		System.out.print(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());

		return respuesta;
	}
	
}
