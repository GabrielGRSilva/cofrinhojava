package cofrinhopoo;

public class Dolar extends Moeda{
	public Dolar(double valor) {
		this.nome = "Dólares";
		this.valor = valor;
	}
	
	public void info() {
		System.out.println("Valor em dólares: " + valor);
	}
	
	public double converter() {
		double valorEmReais = valor * 5.32;
		return valorEmReais;
	}
}
