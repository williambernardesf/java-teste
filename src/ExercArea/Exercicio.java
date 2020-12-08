package ExercArea;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		double areaTri, areaCir, areaTra, areaQua, areaRet;
		
		System.out.println("Digite um valor float para a: ");
		a = sc.nextFloat();
		
		System.out.println("Digite um valor float para b: ");
		b = sc.nextFloat();
		
		System.out.println("Digite um valor float para c: ");
		c = sc.nextFloat();
		
		areaTri = (a * c) / 2;
		areaCir =  3.14159 * c * c;
		areaTra = (a + b) * (c) / 2;
		areaQua = (b * b);
		areaRet = (a * b);
		
		System.out.printf("A área do triangulo é = %.3f%n", areaTri);
		System.out.printf("A área do circulo é = %.3f%n", areaCir);
		System.out.printf("A área do trapézio é = %.3f%n", areaTra);
		System.out.printf("A área do quadrado é = %.3f%n", areaQua);
		System.out.printf("A área do retângulo é = %.3f%n", areaRet);


	}

}
