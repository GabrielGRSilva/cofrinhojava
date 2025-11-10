package cofrinhopoo;

public class Euro extends Moeda {
	public void info() {
		System.out.println("Valor em euros: " + valor);
	}
	
	public void converter() {
		double valorEmReais = valor * 6.15;
		System.out.println("Valor em reais: " + valorEmReais);
	}
}
