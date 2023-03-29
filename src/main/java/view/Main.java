package view;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import controller.*;

public class Main {

	static controller.Menu m;
	
	public static void main(String[] args) {
		
		int opc = 0;
		m.menuEmpleados(opc);

	}
}
