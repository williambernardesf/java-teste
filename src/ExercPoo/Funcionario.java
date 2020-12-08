package ExercPoo;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void incrementaSalario(double porcentagem) {
		double conta = 10 * salarioBruto / 100;
		double conta1 = salarioBruto + conta - taxa;
		System.out.printf("Nome: " + nome + "$ %.2f%n", conta1);
		
	}

}
