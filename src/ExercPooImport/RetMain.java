package ExercPooImport;

import java.util.Locale;
import java.util.Scanner;
import ExercPoo.Retangulo;

public class RetMain {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		ret.altura = sc.nextDouble();
		System.out.println("Digite a largura do retangulo: ");
		ret.largura=sc.nextDouble();
		
		System.out.printf("A area é %.2f%n",  ret.area());
		System.out.printf("Seu perimetro é %.2f%n", ret.perimetro());
		
	}

}
