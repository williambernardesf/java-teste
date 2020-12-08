package ExercIfElse;

import java.util.Scanner;

public class ExercicioInteiro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		
		int s1;
		
		s1 = sc.nextInt();
		
		if (s1 > 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		
		
		
		
	}

}
