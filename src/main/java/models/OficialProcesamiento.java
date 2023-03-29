package models;

import org.springframework.beans.factory.annotation.Value;

public class OficialProcesamiento extends Empleado{

	@Value("${nombreOficialProcesamiento}")
	private String nombre;

	@Value("${dniOficialProcesamiento}")
	private String dni;
	
	@Value("${salarioOficialProcesamiento}")
	private int salario;
	
	public OficialProcesamiento(DatosBancos banco) {
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
		return "Responsable del procesamiento de las solicitudes de los clientes";
	}

	public String getBanco() {
		return banco.getNombreBanco();
		
	}

}
