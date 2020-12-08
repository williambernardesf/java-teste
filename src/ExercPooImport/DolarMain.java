package ExercPooImport;

import java.util.Locale;
import java.util.Scanner;

import ExercPoo.Dolar;

public class DolarMain {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dolar dolar = new Dolar();
		
		System.out.println("Quanto está o dólar ?");
		dolar.dolar = sc.nextDouble();
		System.out.println("Quantos dólares voce quer comprar ?");
		dolar.qtdeDolar = sc.nextDouble();
		
		System.out.println("Voce deverá pagar "+ dolar.converter() + " em reais");
		
		
	}

}
