package ExercCalculoRaio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double s1, s2, s3;
		
		double pi = 3.14159;
		
		double resul1, resul2, resul3;
				
		System.out.println("Digite o raio do circulo 1 : ");
		s1 = sc.nextDouble();
		
		System.out.println("Digite o raio do circulo 2 : ");
		s2 = sc.nextDouble();

		System.out.println("Digite o raio do circulo 3 : ");
		s3 = sc.nextDouble();
		
		resul1 = s1 * s1 * pi;
		resul2 = s2 * s2 * pi;
		resul3 = s3 * s3 * pi;
		
		System.out.printf("O valor da área do circulo 1 é = %.4f%n", resul1);
		System.out.printf("O valor da área do circulo 2 é = %.4f%n", resul2);
		System.out.printf("O valor da área do circulo 3 é = %.4f%n", resul3);


		
		

	}
	
	
	
	
	

}
