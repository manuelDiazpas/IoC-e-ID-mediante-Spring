package models;

import org.springframework.beans.factory.annotation.Value;

public class Gerente extends Empleado{
	
	@Value("${nombreGerente}")
	private String nombre;

	@Value("${dniGerente}")
	private String dni;
	
	@Value("${salarioGerente}")
	private int salario;
	
	public Gerente(DatosBancos banco) {
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
		return "Responsable de la dotacion de personal";
	}

	public String getBanco() {
		return banco.getNombreBanco();
		
	}
	
	
}
