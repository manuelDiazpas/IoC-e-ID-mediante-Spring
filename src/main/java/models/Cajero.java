package models;

import org.springframework.beans.factory.annotation.Value;

public class Cajero extends Empleado{

	@Value("${nombreCajero}")
	private String nombre;

	@Value("${dniCajero}")
	private String dni;
	
	@Value("${salarioCajero}")
	private int salario;
	
	public Cajero(DatosBancos banco) {
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
		return "Responsable de manejar las transacciones bancarias";
	}

	public String getBanco() {
		return banco.getNombreBanco();
		
	}

}
