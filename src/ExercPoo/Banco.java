package ExercPoo;

public class Banco {
	private String nome;
	private int numConta;
	private double depInicial;
	
	public Banco(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}

	public double getDepInicial() {
		return depInicial;
	}

	public void setDepInicial(double depInicial) {
		this.depInicial = depInicial;
	}
	
	public void tiraDinheiro(double grana) {
		double conta = depInicial - grana;
		depInicial = conta;
	}

	public void mostraConta() {
		System.out.println("Conta " + numConta + " Nome : " + nome + " Quantia : " + "$" + depInicial);
	}
	
	
	

}
