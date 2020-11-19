package com.usta.cmapp.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		BigDecimal numero = new BigDecimal(-0.7);
		
		if(numero.compareTo(BigDecimal.ZERO)<0 || numero.compareTo(BigDecimal.ZERO)>0 ) {
			System.out.println("es menor");
		}
		
//		Date name = new Date();
//		
//		SimpleDateFormat f = new SimpleDateFormat("dd MMMM yyyy");
//		
//		String dat = f.format(name);
//		String dia = dat.substring(0, 2);
//		String mes = dat.substring(3,dat.length()-5);
//		String anio = dat.substring(dat.length()-4, dat.length());
//		
//		System.out.println(dat);
//		System.out.println(dia);
//		System.out.println(mes);
//		System.out.println(anio);
	}

}
