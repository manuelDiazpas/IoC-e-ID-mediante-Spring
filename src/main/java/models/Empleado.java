package models;

import org.springframework.stereotype.Component;

@Component
public abstract class Empleado implements DatosEmpleado{
	
	protected DatosBancos banco;
	
	public Empleado(DatosBancos banco) {
		setBanco(banco);
	}

	public void setBanco(DatosBancos banco) {
		this.banco = banco;
	}
	
	
	
}
