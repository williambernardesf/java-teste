package ExercIfElse;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPreco {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1;
		double valCachorro = 4.00;
		double valSala = 4.50;
		double valBacon = 5.00;
		double valTorrada = 2.00;
		double valRefri = 1.50;
		double resul;
		
		System.out.print("Digite o código do item: ");
		cod1 = sc.nextInt();
		System.out.print("Digite a quantidade do item: ");
		qtd1 = sc.nextInt();
		
		Locale.setDefault(Locale.US);
		
		if(cod1 == 1) {
			resul = qtd1 * valCachorro;
			System.out.printf("Total a pagar = R$ %.2f%n", resul);
		}else if(cod1 == 2) {
			resul = qtd1 * valSala;
			System.out.printf("Total a pagar = R$ %.2f%n", resul);
		}else if(cod1 == 3) {
			resul = qtd1 * valBacon;
			System.out.printf("Total a pagar = R$ %.2f%n", resul);
		}else if(cod1 == 2) {
			resul = qtd1 * valTorrada;
			System.out.printf("Total a pagar = R$ %.2f%n", resul);
		}else if(cod1 == 2) {
			resul = qtd1 * valRefri;
			System.out.printf("Total a pagar = R$ %.2f%n", resul);
	}

}}
