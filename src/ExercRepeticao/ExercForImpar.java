package ExercRepeticao;

import java.util.Scanner;

public class ExercForImpar {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um valor para x de 1 a 1000: ");
		x = sc.nextInt();
		
		
		if (x >= 1 && x <= 1000) {
			for (int i = 1; i < x; i = i + 2) {
				System.out.println(i);
			}
		}else {
			System.out.println("Porfavor digite um numero acima de 0 e menor que 1001");
		}
		
	}

}
