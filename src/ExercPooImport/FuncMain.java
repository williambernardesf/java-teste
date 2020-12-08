package ExercPooImport;

import java.util.Locale;
import java.util.Scanner;

import ExercPoo.Funcionario;

public class FuncMain {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double porcentagem;
		Funcionario func = new Funcionario();
		
		System.out.println("Digite seu nome: ");
		func.nome = sc.nextLine();
		System.out.println("Digite seu salario bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Digite o imposto: ");
		func.taxa = sc.nextDouble();
		
		System.out.printf("Funcionário: " + func.nome + "$ %.2f%n", func.salarioLiquido());
		System.out.println("Qual a porcentagem para aumentar salário ? ");		
		porcentagem = sc.nextDouble();
		func.incrementaSalario(porcentagem);		
	}

}
