package ExercIfElse;

import java.util.Scanner;

public class ExercicioJogo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int h1, h2, resul;
		
		System.out.println("Digite o horario inicial: ");
		h1 = sc.nextInt();
		System.out.println("Digite o horario final: ");
		h2 = sc.nextInt();
		
		if(h1 < h2) {
			resul = h2 - h1;
		}else {
			resul = 24 - h1 + h2;
		}
		
		System.out.println("O jogo durou " + resul + " horas");
	}

}
