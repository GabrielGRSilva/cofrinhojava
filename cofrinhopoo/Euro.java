package cofrinhopoo;

public class Euro extends Moeda {
	public String nome = "Euro";
	public void info() {
		System.out.println("Valor em euros: " + valor);
	}
	
	public double converter() {
		double valorEmReais = valor * 6.15;
		return valorEmReais;
	}
}
