import java.util.Locale;

public class Exerc1 {
	public static void main(String[]args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de Trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.println(produto1 + ": o preço é $ " + preco1);
		System.out.println(produto2 + ": o preço é $ " + preco2);
		System.out.println("");
		System.out.println("Recorde: " + idade + "anos, código " + codigo + " e genero: " + genero);
		System.out.println("");
		System.out.printf("A medida com 8 casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado: %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.println("Ponto decilmal Americano " + medida);
		
		


		
	}

}
