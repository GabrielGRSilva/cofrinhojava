package cofrinhopoo;

public class Dolar extends Moeda{
	public String nome = "Dólar";
	public void info() {
		System.out.println("Valor em dólares: " + valor);
	}
	
	public double converter() {
		double valorEmReais = valor * 5.32;
		return valorEmReais;
	}
}
