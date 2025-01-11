package com.curso.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrincipalOO {

	public static void main(String[] args) {
		System.out.println("Java OO");
		//venta 1
		Mica mica01= new Mica("HI","0.0","0.0",5);
		Mica mica02= new Mica("HI","0.5","1.5",10);
		Mica mica03= new Mica("HI","1.5","0.5",4);

		//venta2
		Mica mica04= new Mica("HI","0.0","0.0",6);
		Mica mica05= new Mica("HI","0.5","1.5",15);
		Mica mica06= new Mica("HI","1.5","0.5",8);

		//venta3
	    Mica mica07= new Mica("HI","0.0","0.0",10); //21
		Mica mica08= new Mica("HI","0.5","1.5",13); //38
		Mica mica09= new Mica("HI","1.5","0.5",6); //18
		
		List<Mica> ventaslista=new ArrayList<>();
		ventaslista.add(mica01);
		ventaslista.add(mica02);
		ventaslista.add(mica03);
		ventaslista.add(mica04);
		ventaslista.add(mica05);
		ventaslista.add(mica06);
		ventaslista.add(mica07);
		ventaslista.add(mica08);
		ventaslista.add(mica09);
		
		Map<String,Long> micasDetCantidad = new HashMap<>();
		
		for(Mica m: ventaslista) {
			String medida = m.getUnidadHor()+"/"+ m.getUnidadVer();
			boolean existe = micasDetCantidad.containsKey(medida);
			if(existe) {
				//acumular cantidad
				long acumularCantidad= micasDetCantidad.get(medida)+ m.getCantidadVendida();
				micasDetCantidad.replace(medida, acumularCantidad);
			}else {
				//Crear elemento
				micasDetCantidad.put(medida, m.getCantidadVendida());
			}
		}
		
		for(Map.Entry m: micasDetCantidad.entrySet()) {
			System.out.println("Cantidad total: "+ m.getKey() + ": " + m.getValue());
		}
		
	}

}
