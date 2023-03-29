package models;

import org.springframework.beans.factory.annotation.Value;

public class RepMarketing extends Empleado{

	@Value("${nombreRepMareting}")
	private String nombre;

	@Value("${dniRepMareting}")
	private String dni;
	
	@Value("${salarioRepMareting}")
	private int salario;
	
	public RepMarketing(DatosBancos banco) {
		super(banco);
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return "DNI: " + dni;
	}

	
	public String getSalario() {
		// TODO Auto-generated method stub
		return "Gana un total de " + salario + "€";
	}

	public String getTrabajo() {
		// TODO Auto-generated method stub
		return "Responsable de comercializar productos bancarios a los clientes";
	}

	public String getBanco() {
		return banco.getNombreBanco();
		
	}
	
}
