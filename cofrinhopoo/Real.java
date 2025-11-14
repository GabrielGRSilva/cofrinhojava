package cofrinhopoo;

public class Real extends Moeda {
	public String nome = "Real";
	public void info() {
		System.out.println("Valor em reais: " + valor);
	}
	
	public void converter() {
		info();
	}
}
