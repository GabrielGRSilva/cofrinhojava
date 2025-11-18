package cofrinhopoo;

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> cofrinho = new ArrayList<>();
	
	public Moeda get(int index) {
		return cofrinho.get(index);
	}
	
	public void adicionar(int escolhaMoeda, int escolhaValor) {
		switch(escolhaMoeda) {
		
		case 1:
			switch(escolhaValor) {
			case 1:
				cofrinho.add(new Real(0.10));
				System.out.println("Uma moeda de 10 centavos (Real) foi adicionada ao Cofrim!");
				break;
			case 2:
				cofrinho.add(new Real(0.25));
				System.out.println("Uma moeda de 25 centavos (Real) foi adicionada ao Cofrim!");
				break;
			case 3:
				cofrinho.add(new Real(0.50));
				System.out.println("Uma moeda de 50 centavos (Real) foi adicionada ao Cofrim!");
				break;
			case 4:
				cofrinho.add(new Real(1.00));
				System.out.println("Uma moeda de 1 Real foi adicionada ao Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
			break;
		case 2:
			switch(escolhaValor) {
			case 1:
				cofrinho.add(new Dolar(0.10));
				System.out.println("Uma moeda de 10 centavos (Dólar) foi adicionada ao Cofrim!");
				break;
			case 2:
				cofrinho.add(new Dolar(0.25));
				System.out.println("Uma moeda de 25 centavos (Dólar) foi adicionada ao Cofrim!");
				break;
			case 3:
				cofrinho.add(new Dolar(0.50));
				System.out.println("Uma moeda de 50 centavos (Dólar) foi adicionada ao Cofrim!");
				break;
			case 4:
				cofrinho.add(new Dolar(1.00));
				System.out.println("Uma moeda de 1 Dólar foi adicionada ao Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
			break;
		case 3:
			switch(escolhaValor) {
			case 1:
				cofrinho.add(new Euro(0.10));
				System.out.println("Uma moeda de 10 centavos (Euro) foi adicionada ao Cofrim!");
				break;
			case 2:
				cofrinho.add(new Euro(0.25));
				System.out.println("Uma moeda de 25 centavos (Euro) foi adicionada ao Cofrim!");
				break;
			case 3:
				cofrinho.add(new Euro(0.50));
				System.out.println("Uma moeda de 50 centavos (Euro) foi adicionada ao Cofrim!");
				break;
			case 4:
				cofrinho.add(new Euro(1.00));
				System.out.println("Uma moeda de 1 Euro foi adicionada ao Cofrim!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
	
	public void remover(int escolhaMoeda) {
		try {
			cofrinho.remove(escolhaMoeda-1);
			System.out.println("Moeda removida do Cofrim com sucesso!");
		}catch(Exception e) {
			System.out.println("Ocorreu um erro ao remover a moeda!" + e);
		}
	}
}
