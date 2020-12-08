package ExercCalculoDiferenca;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[]args) {
		int a, b, c, d, resul;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para a: ");
		a = sc.nextInt();
		
		System.out.println("Digite um valor para b: ");
		b = sc.nextInt();
		
		System.out.println("Digite um valor para c: ");
		c = sc.nextInt();
		
		System.out.println("Digite um valor para d: ");
		d = sc.nextInt();
		
		resul = (a * b - c * d);
		
		System.out.println("A diferença é : " + resul);
		
		
	}

}
