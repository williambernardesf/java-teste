package ExercPecas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double val1, val2, resul;
		
		System.out.println("Digite o código do produto 1: ");
		cod1 = sc.nextInt();
		
		System.out.println("Digite a quantidade de produtos 1: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Digite o valor do produto 1: ");
		val1 = sc.nextDouble();
		
		System.out.println("Digite o código do produto 2: ");
		cod2 = sc.nextInt();
		
		System.out.println("Digite a quantidade de produtos 2: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Digite o valor do produto 2: ");
		val2 = sc.nextDouble();
		
		resul = (qtd1 * val1 ) + (qtd2 * val2);
		
		System.out.printf("Valor a pagar pelo(s) produto(s): US %.2f%n ", resul);


											}
						}


