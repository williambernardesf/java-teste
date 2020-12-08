package ExercLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BancoMain {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionários serão registrados ? ");
		int num = sc.nextInt();
		
		ArrayList<Banco> list = new ArrayList();
		
		for (int i = 1; i < num + 1; i++) {
			System.out.println("Funcionario #" + i  + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário : ");
			double salario = sc.nextDouble();	
			
			Banco ban = new Banco(id, nome, salario);
			list.add(ban);
		}
		
		int id = 0;
		System.out.println("Coloque o ID do funcionário que terá o salário aumentado :");
		id = sc.nextInt();
		Integer pos = position(list, id);
		if(pos == null) {
			System.out.println("Não exitse!");
		}else {
			System.out.println("Coloque a porcentagem :");
			double porc = sc.nextDouble();
			list.get(pos).aumentaSalario(porc);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios :");
		for(Banco ban1 : list) {
			System.out.println(ban1);
		}
		sc.close();
	}
	public static Integer position(ArrayList<Banco> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
