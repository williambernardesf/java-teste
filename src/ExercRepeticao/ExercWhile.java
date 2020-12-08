package ExercRepeticao;

import java.util.Scanner;

public class ExercWhile {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		while (senha != 2002) {
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha invalida");
			}
		}
	}

}
