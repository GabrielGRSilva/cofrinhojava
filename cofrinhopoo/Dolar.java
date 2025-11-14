package cofrinhopoo;

public class Dolar extends Moeda{
	public String nome = "Dólar";
	public void info() {
		System.out.println("Valor em dólares: " + valor);
	}
	
	public void converter() {
		double valorEmReais = valor * 5.32;
		System.out.println("Valor em reais: " + valorEmReais);
	}
}
