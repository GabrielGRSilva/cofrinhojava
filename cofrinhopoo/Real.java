package cofrinhopoo;

public class Real extends Moeda {
	public Real() {
		nome = "Reais";
	}
	
	public void info() {
		System.out.println("Valor em reais: " + valor);
	}
	
	public double converter() {
		return valor;
	}
}
