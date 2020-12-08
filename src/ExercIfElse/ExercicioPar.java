package ExercIfElse;

import java.util.Scanner;

public class ExercicioPar {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int s1;
		System.out.println("Digite um número qualquer: ");
		s1 = sc.nextInt();
		
		if (s1%2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
	}

}
