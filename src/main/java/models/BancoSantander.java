package models;

import org.springframework.stereotype.Component;

@Component
public class BancoSantander implements DatosBancos{

	public String getNombreBanco() {
		// TODO Auto-generated method stub
		return "Trabaja en el banco Santander";
	}

}
