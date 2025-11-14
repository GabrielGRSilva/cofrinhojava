package cofrinhopoo;

public class Real extends Moeda {
	public Real() {
		this.nome = "Reais";
	}
	
	public void info() {
		System.out.println("Valor em reais: " + valor);
	}
	
	public double converter() {
		return valor;
	}
}
