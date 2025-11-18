package cofrinhopoo;

public class Euro extends Moeda {
	public Euro(double valor) {
		this.nome = "Euros";
		this.valor = valor;
	}
	public void info() {
		System.out.println("Valor em euros: " + valor);
	}
	
	public double converter() {
		double valorEmReais = valor * 6.15;
		return valorEmReais;
	}
}
