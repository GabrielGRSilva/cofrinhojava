package cofrinhopoo;

public class Real extends Moeda {
	public Real(double valor) {
		this.nome = "Reais";
		this.valor = valor;
	}
	
	public void info() {
		System.out.println("Valor em reais: " + valor);
	}
	
	public double converter() {
		return valor;
	}
}
