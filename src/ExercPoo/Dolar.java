package ExercPoo;

public class Dolar {
	
	public double dolar;
	public double qtdeDolar;

	public double converter() {
		double conta = dolar * qtdeDolar;
		double conta1 = conta * 6 / 100;
		conta = conta + conta1;
		return conta;
	}
	

}
