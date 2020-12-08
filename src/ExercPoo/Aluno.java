package ExercPoo;

public class Aluno {
	public double nota1, nota2, nota3;
	
	public double resultado() {
		double conta = nota1 + nota2 + nota3;
		if (conta < 60.0) {
			System.out.println("Reprovado");
			System.out.println("Nota final : " + conta);
			System.out.println("Faltou " + (60.00 - conta));
		}else {
			System.out.println("Nota final : " + conta);
			System.out.println("Aprovado");
		}return conta;			
	}	
}
