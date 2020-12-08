package ExercRepeticao;

import java.util.Scanner;

public class ExercWhilePosto {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int numGas = 0;
		int numAlc = 0;
		int numDie = 0;
		
		while (num != 4) {
			System.out.println("Com qual tipo de combustivel voce abastece: ");
			System.out.println(" 1.Álcool 2.Gasolina 3.Diesel");
			System.out.println("Caso deseje finalizar, digite 4");
			num = sc.nextInt();
			if (num == 1) {
				numAlc = numAlc + 1;
				System.out.println("Álcool :" + numAlc);
			}else if (num == 2) {
				numGas = numGas + 1;
				System.out.println("Gasolina :" + numGas);
			}else if (num == 3) {
				numDie = numDie + 1;
				System.out.println("Diesel :" + numDie);
			}else if (num == 4) {
				System.out.println("Muito Obrigado");
			}else {
				System.out.println("Digite outro número");
			}
			
		}
	}

}
