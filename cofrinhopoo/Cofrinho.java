package cofrinhopoo;

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> moedas = new ArrayList<>();
/*	Real real = new Real();
	Dolar dolar = new Dolar();
	Euro euro = new Euro();
	
	public Cofrinho() {
		moedas.add(real);
		moedas.add(dolar);
		moedas.add(euro);
	}*/
	
	public Moeda get(int index) {
		return moedas.get(index);
	}
	
	public void adicionar(int escolhaMoeda, int escolhaValor) {
		switch(escolhaMoeda) {
		
		case 1:
			switch(escolhaValor) {
			case 1:
				moedas.add(new Real(0.10));
				System.out.println("Uma moeda de 10 centavos (Real) foi adicionada ao Cofrim!");
				break;
			case 2:
				moedas.add(new Real(0.25));
				System.out.println("Uma moeda de 25 centavos (Real) foi adicionada ao Cofrim!");
				break;
			case 3:
				moedas.add(new Real(0.50));
				System.out.println("Uma moeda de 50 centavos (Real) foi adicionada ao Cofrim!");
				break;
			case 4:
				moedas.add(new Real(1.00));
				System.out.println("Uma moeda de 1 Real foi adicionada ao Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		case 2:
			switch(escolhaValor) {
			case 1:
				moedas.add(new Dolar(0.10));
				System.out.println("Uma moeda de 10 centavos (Dólar) foi adicionada ao Cofrim!");
				break;
			case 2:
				moedas.add(new Dolar(0.25));
				System.out.println("Uma moeda de 25 centavos (Dólar) foi adicionada ao Cofrim!");
				break;
			case 3:
				moedas.add(new Dolar(0.50));
				System.out.println("Uma moeda de 50 centavos (Dólar) foi adicionada ao Cofrim!");
				break;
			case 4:
				moedas.add(new Dolar(1.00));
				System.out.println("Uma moeda de 1 Dólar foi adicionada ao Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		case 3:
			switch(escolhaValor) {
			case 1:
				moedas.add(new Euro(0.10));
				System.out.println("Uma moeda de 10 centavos (Euro) foi adicionada ao Cofrim!");
				break;
			case 2:
				moedas.add(new Euro(0.25));
				System.out.println("Uma moeda de 25 centavos (Euro) foi adicionada ao Cofrim!");
				break;
			case 3:
				moedas.add(new Euro(0.50));
				System.out.println("Uma moeda de 50 centavos (Euro) foi adicionada ao Cofrim!");
				break;
			case 4:
				moedas.add(new Euro(1.00));
				System.out.println("Uma moeda de 1 Euro foi adicionada ao Cofrim!");
				break;
			}
		}
	}
	
	public void remover(int escolhaMoeda, int escolhaValor) {
		switch(escolhaMoeda) {
		
		case 1:
			switch(escolhaValor) {
			case 1:
				moedas.add(new Real(0.10));
				System.out.println("Uma moeda de 10 centavos (Real) foi removida do Cofrim!");
				break;
			case 2:
				moedas.add(new Real(0.25));
				System.out.println("Uma moeda de 25 centavos (Real) foi removida do Cofrim!");
				break;
			case 3:
				moedas.add(new Real(0.50));
				System.out.println("Uma moeda de 50 centavos (Real) foi removida do Cofrim!");
				break;
			case 4:
				moedas.add(new Real(1.00));
				System.out.println("Uma moeda de 1 Real foi foi removida do Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		case 2:
			switch(escolhaValor) {
			case 1:
				moedas.add(new Dolar(0.10));
				System.out.println("Uma moeda de 10 centavos (Dólar) foi removida do Cofrim!");
				break;
			case 2:
				moedas.add(new Dolar(0.25));
				System.out.println("Uma moeda de 25 centavos (Dólar) foi removida do Cofrim!");
				break;
			case 3:
				moedas.add(new Dolar(0.50));
				System.out.println("Uma moeda de 50 centavos (Dólar) foi removida do Cofrim!");
				break;
			case 4:
				moedas.add(new Dolar(1.00));
				System.out.println("Uma moeda de 1 Dólar foi removida do Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		case 3:
			switch(escolhaValor) {
			case 1:
				moedas.add(new Euro(0.10));
				System.out.println("Uma moeda de 10 centavos (Euro) foi removida do Cofrim!");
				break;
			case 2:
				moedas.add(new Euro(0.25));
				System.out.println("Uma moeda de 25 centavos (Euro) foi removida do Cofrim!");
				break;
			case 3:
				moedas.add(new Euro(0.50));
				System.out.println("Uma moeda de 50 centavos (Euro) foi removida do Cofrim!");
				break;
			case 4:
				moedas.add(new Euro(1.00));
				System.out.println("Uma moeda de 1 Euro foi removida do Cofrim!");
				break;
			}
		}
	}
}