package models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("models")
@PropertySource("classpath:datosTrabajadores")
public class EmpleadosConfig {

	
	@Bean
	public DatosBancos datosBancoSantander(){ //será el id del bean inyectado
		
		return new BancoSantander();
	}
	@Bean
	public DatosBancos datosBancoCaixa(){ //será el id del bean inyectado
		
		return new BancoCaixa();
	}
	
	
	@Bean
	public DatosEmpleado gerente() {
		
		return new Gerente(datosBancoSantander());
	}
	
	@Bean
	public DatosEmpleado cajero() {
		
		return new Cajero(datosBancoCaixa());
	}
	
	@Bean
	public DatosEmpleado oficialProcesamiento() {
		
		return new OficialProcesamiento(datosBancoCaixa());
	}
	
	@Bean
	public DatosEmpleado repMarketing() {
		
		return new RepMarketing(datosBancoSantander());
	}
	
	
	
	
}
