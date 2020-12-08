package ExercIfElse;

import java.util.Scanner;

public class ExercicioMultiplos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int s1, s2;
		System.out.println("Digite um número qualquer: ");
		System.out.println("Digite outro número qualquer: ");

		s1 = sc.nextInt();
		s2 = sc.nextInt();
		
		if (s2%s1 == 0 || s1%s2==0) {
			System.out.println("Os números são multiplos entre si");
		}else {
			System.out.println("Os números não são multiplos entre si");
		}
	}

}
