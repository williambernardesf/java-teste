package ExercSalario;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double valor, salario;
		
		System.out.println("Digite o seu número : ");
		num = sc.nextInt();
		
		System.out.println("Digite o total de horas trabalhadas : ");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor ganho por hora : ");
		valor = sc.nextDouble();
		
		salario = (horas * valor);
		
		System.out.println("Número: " + num);
		System.out.printf("Salário = US %.2f%n", salario);
		
		
	}

}
