package ExercPooImport;

import java.util.Locale;
import java.util.Scanner;

import ExercPoo.Banco;

public class BancoMain {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		int num = sc.nextInt();		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		Banco cliente = new Banco(nome,num);
		System.out.println("Tem um valor para depósito inicial? (s/n)");
		char opcao = sc.next().charAt(0);
		if (opcao == 's') {
			System.out.println("Digite o valor do depósito inicial: ");
			double deposito = sc.nextDouble();
			cliente.setDepInicial(deposito);
		}else {
			cliente.setDepInicial(0.00);
		}
		cliente.mostraConta();
		
		System.out.println("O que você deseja?");
		System.out.println("Depositar ou sacar ? ");
		String desejo = sc.next();
		
		String string1 = "depositar";
		String string2 = "Depositar";

		if(desejo.equals(string1) || desejo.equals(string2)) {
			System.out.println("Quanto você deseja depositar? ");
			double deposit = sc.nextDouble();
			cliente.setDepInicial(deposit);
			cliente.mostraConta();
		}else {
			System.out.println("Quanto você deseja sacar ?");
			double saca = sc.nextDouble();
			if(saca > cliente.getDepInicial()) {
				System.out.println("Você não pode retirar esse valor, sua conta tem " + cliente.getDepInicial() + "reais");
			}else {
				cliente.tiraDinheiro(saca);
				System.out.println("Quantia atual na sua conta: " + cliente.getDepInicial());
			}
		}
		
	}

}
