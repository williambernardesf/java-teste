package ExercPooImport;

import java.util.Locale;
import java.util.Scanner;

import ExercPoo.Aluno;

public class AlunoMain {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite sua primeira nota : ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite sua segunda nota : ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite sua terceira nota : ");
		aluno.nota3 = sc.nextDouble();

		System.out.println(aluno.resultado());
	}

}
